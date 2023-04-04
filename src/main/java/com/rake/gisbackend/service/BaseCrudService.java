package com.rake.gisbackend.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseCrudService<T, U extends JpaRepository<T,Integer>> implements IService<T> {

  private final U repo;

  public BaseCrudService(U repo) {
    this.repo = repo;
  }

  @Override
  public List<T> getAll() {
    return repo.findAll();
  }

  @Override
  public void delete(int id) {
    repo.deleteById(id);
  }

  @Override
  public T getOneById(int id) {
    Optional<T> element = repo.findById(id);
    return element.orElse(null);
  }
}
