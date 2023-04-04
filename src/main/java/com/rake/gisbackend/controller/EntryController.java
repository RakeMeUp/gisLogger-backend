package com.rake.gisbackend.controller;

import com.rake.gisbackend.model.*;
import com.rake.gisbackend.service.EntryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entry")
public class EntryController {

  private final EntryService entryService;

  public EntryController(EntryService entryService) {
    this.entryService = entryService;
  }

  @GetMapping
  public ResponseEntity<List<Entry>> getAllEntries() {
    return ResponseEntity.ok(entryService.getAll());
  }

  @PostMapping
  public ResponseEntity<Entry> addEntry(@RequestBody Entry entry) {
    return ResponseEntity.ok(entryService.add(entry));
  }
}
