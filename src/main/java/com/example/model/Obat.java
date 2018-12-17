/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Getter @Setter @NoArgsConstructor
@Entity
public class Obat 
{
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_obat", unique = true, nullable = false)
String  id_obat;
@NotEmpty
@Size(min=1, max=30)
String referensi;
@NotEmpty
@Size(min=1, max=30)
String nama_obat;
@NotEmpty
@Size(min=1, max=30)
String no_ktp;
@NotEmpty
@Size(min=1, max=30)
String nama_pasien;
@JoinColumn(name = "id_pasien")
 @ManyToOne
private rawat_jalan id_rawat_jalan;
}
