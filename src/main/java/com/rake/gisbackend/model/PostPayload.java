package com.rake.gisbackend.model;

/**
 * Object representation of the excel row that will be copy-pasted into the client input
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
public class PostPayload {
  @NonNull
  private String area;
  @NonNull
  private String project;
  @NonNull
  private Date startDate;
  @NonNull
  private Date endDate;
  private int las;
  private int operatorId;
}
