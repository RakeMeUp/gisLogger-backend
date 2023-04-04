package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Operator;
import com.rake.gisbackend.repository.OperatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorService implements IOperatorService {

  OperatorRepository operatorRepository;

  public OperatorService(OperatorRepository operatorRepository) {
    this.operatorRepository = operatorRepository;
  }

  @Override
  public Operator addOperator(Operator operator) {
    return operatorRepository.save(operator);
  }

  @Override
  public List<Operator> getAllOperators() {
    return operatorRepository.findAll();
  }

  @Override
  public Operator updateOperatorById(int operatorId, Operator operator) {
    Operator updated = getOperatorById(operatorId);
    updated.setName(operator.getName());
    updated.setEmail(operator.getEmail());
    updated.setPwd(operator.getPwd());
    return operatorRepository.save(updated);
  }

  @Override
  public void deleteOperator(int operatorId) {
    operatorRepository.deleteById(operatorId);
  }

  public Operator getOperatorById(int operatorId) {
    return operatorRepository.findById(operatorId).get();
  }
}
