package com.rake.gisbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
Table gis.las{
  las_id int [pk, not null]
  area varchar [not null]
  project varchar [not null]
}
*/

@Entity
@Data
@NoArgsConstructor
@Table(name = "las")
public class Las {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lasId;
    private String area;
    private String project;

    public Las(String project, String area) {
        this.project = project;
        this.area = area;
    }

    @OneToOne(mappedBy = "las")
    private Entry entry;
}