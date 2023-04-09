package com.rake.gisbackend.service;

import com.rake.gisbackend.model.Entry;
import com.rake.gisbackend.repository.EntryRepository;
import org.springframework.stereotype.Service;

@Service
public class EntryService extends BaseCrudService<Entry, EntryRepository>{

  private final EntryRepository entryRepository;

  public EntryService(EntryRepository repo, EntryRepository entryRepository) {
    super(repo);
    this.entryRepository = entryRepository;
  }

  @Override
  public Entry add(Entry entry){
    return entryRepository.save(entry);
  }

  @Override
  public Entry updateById(int id, Entry entity) {
    //TODO
    return null;
  }
}
