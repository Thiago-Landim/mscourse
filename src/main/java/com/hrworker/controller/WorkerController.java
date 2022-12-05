package com.hrworker.controller;

import com.hrworker.entities.Worker;
import com.hrworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/workers")
public class WorkerController {

   private final WorkerRepository workerRepository;


   @GetMapping
    public ResponseEntity<List<Worker>> listaTudo(){
       List<Worker> list  = workerRepository.findAll();
       return ResponseEntity.ok(list);

   }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Worker>> searchId(@PathVariable Long id){
        Optional<Worker> obj = workerRepository.findById(id);
        return ResponseEntity.ok(obj);

    }


}
