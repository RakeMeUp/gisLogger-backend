package com.rake.gisbackend.controller;

import com.rake.gisbackend.model.Operator;
import com.rake.gisbackend.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operator")
public class OperatorController {

    private final OperatorRepository operatorRepository;

    public OperatorController(OperatorRepository operatorRepository) {
        this.operatorRepository = operatorRepository;
    }

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(this.operatorRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Operator> addOperator(@RequestBody Operator operator) {
        operatorRepository.save(operator);
        return ResponseEntity.ok(operator);
    }
}
