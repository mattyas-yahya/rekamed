/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Getter @Setter @NoArgsConstructor
@Entity
public class Diagnosa implements Serializable
{
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_diagnosa", unique = true, nullable = false)
private String id_diagnosa;
@NotEmpty
@Size(min=1, max=30)
private String referensi;
@NotEmpty
@Size(min=1, max=30)
private String nama_penyakit;

//@OneToMany
//private Collection<rawat_jalan> rawatJalanCollection;
}
