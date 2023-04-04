package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Operator;

import java.util.List;

public interface IOperatorService {
  Operator addOperator(Operator operator);
  List<Operator> getAllOperators();
  Operator updateOperatorById(int operatorId,Operator operator);
  void deleteOperator(int operatorId);
}
