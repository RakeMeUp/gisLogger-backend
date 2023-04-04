package com.rake.gisbackend.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
public class OperatorEntryId implements Serializable {
  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(referencedColumnName = "operatorId")
  private Operator operator;

  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(referencedColumnName = "entryId")
  private Entry entry;

  public OperatorEntryId(Operator operator, Entry entry) {
    this.operator = operator;
    this.entry = entry;
  }

  public Operator getOperator() {
    return operator;
  }

  public Entry getEntry() {
    return entry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OperatorEntryId that = (OperatorEntryId) o;
    return Objects.equals(operator, that.operator) && Objects.equals(entry, that.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, entry);
  }
}
