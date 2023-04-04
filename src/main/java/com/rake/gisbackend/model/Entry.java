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
@Table(name = "entry")
public class Entry {
    public Entry(Date startDate, Date endDate, Las las) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.las = las;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entryId")
    private int entryId;
    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;

    @OneToOne(mappedBy = "id.entry")
    private OperatorEntry operatorEntry;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "las", referencedColumnName = "lasId")
    private Las las;
}
