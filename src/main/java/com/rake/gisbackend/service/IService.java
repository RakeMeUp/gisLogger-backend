package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
  T add(T entity);
  List<T> getAll();
  T updateById(int id, T entity);
  void delete(int id);
  T getOneById(int id);

}
