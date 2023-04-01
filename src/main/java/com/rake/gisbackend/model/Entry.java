package com.rake.gisbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
Table gis.entry{
  entry_id int [pk, increment, not null]
  las int [ref: - gis.las.las_id]
  start_date datetime [not null]
  end_date datetime [not null]
}
*/

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entry")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entryId")
    private int entryId;
    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;

    @OneToOne(mappedBy = "entry")
    private OperatorEntry operatorEntry;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "las", referencedColumnName = "lasId")
    private Las las;
}
