package com.elib.entity;

// Generated Nov 16, 2013 10:36:05 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

  private int id;
  private String role;

  public Role() {
  }

  public Role(int id, String role) {
    this.id = id;
    this.role = role;
  }

  @Id
  @Column(name = "ID", unique = true, nullable = false)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "Role", nullable = false, length = 45)
  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
