package com.rake.gisbackend.controller;

import com.rake.gisbackend.model.Operator;
import com.rake.gisbackend.model.PostPayload;
import com.rake.gisbackend.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operator")
public class OperatorController {

    private final OperatorService operatorService;

    public OperatorController(OperatorService operatorService) {
        this.operatorService = operatorService;
    }


    @GetMapping
    public ResponseEntity getAllOperators() {
        return ResponseEntity.ok(operatorService.getAll());
    }

    @PostMapping
    public ResponseEntity<Operator> addOperator(@RequestBody Operator operator) {
        return ResponseEntity.ok(operatorService.add(operator));
    }

    @PutMapping("/{operatorId}")
    public  ResponseEntity<Operator> updateOperatorById(@PathVariable int operatorId, @RequestBody Operator operator) {
        return ResponseEntity.ok(operatorService.updateById(operatorId, operator));
    }

    @DeleteMapping("/{operatorId}")
    public ResponseEntity deleteOperator(@PathVariable int operatorId) {
        operatorService.delete(operatorId);
        return ResponseEntity.ok().build();
    }
}
