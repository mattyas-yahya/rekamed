/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.*;


@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "Dokter")

public class Dokter implements Serializable{
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_dokter", unique = true, nullable = false)
private String id_dokter;    

@NotEmpty
@Size(min=1, max=30)
private String Kode;

@NotEmpty
@Size(min=1, max=30)
private String nama;

@NotEmpty
@Size(min=1, max=30)
private String Bidang;

   
}
