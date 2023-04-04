package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Las;
import com.rake.gisbackend.repository.LasRepository;
import org.springframework.stereotype.Service;

@Service
public class LasService extends BaseCrudService<Las,LasRepository>{
  private final LasRepository lasRepository;

  public LasService(LasRepository lasRepository) {
    super(lasRepository);
    this.lasRepository = lasRepository;
  }
  @Override
  public Las add(Las entity) {
    return lasRepository.save(entity);
  }

  @Override
  public Las updateById(int id, Las entity) {
    //TODO
    return null;
  }


}

