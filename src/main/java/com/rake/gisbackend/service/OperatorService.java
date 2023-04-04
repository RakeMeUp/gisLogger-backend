package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Operator;
import com.rake.gisbackend.repository.OperatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorService extends BaseCrudService<Operator, OperatorRepository>{

  OperatorRepository operatorRepository;

  public OperatorService(OperatorRepository operatorRepository) {
    super(operatorRepository);
    this.operatorRepository = operatorRepository;
  }

  @Override
  public Operator add(Operator operator) {
    return operatorRepository.save(operator);
  }

  @Override
  public Operator updateById(int operatorId, Operator operator) {
    Operator updated = getOneById(operatorId);
    updated.setName(operator.getName());
    updated.setEmail(operator.getEmail());
    updated.setPwd(operator.getPwd());
    return operatorRepository.save(updated);
  }
}
