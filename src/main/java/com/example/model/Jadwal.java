/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;


@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "Jadwal")
public class Jadwal  implements Serializable 
{
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_jadwal", unique = true, nullable = false)    
private String id_jadwal;

@NotEmpty
@Size(min=1, max=30)
private String nama;

@DateTimeFormat(pattern = "dd-mm-yyyy")
@Column(name="mulai", nullable=false)
@Temporal(TemporalType.DATE)
private Date mulai;

@DateTimeFormat(pattern = "dd-mm-yyyy")
@Column(name="selesai", nullable=false)
@Temporal(TemporalType.DATE)
private Date selesai;

@JoinColumn(name = "id_dokter", referencedColumnName = "id_dokter",nullable=false)
@ManyToOne(fetch = FetchType.EAGER)
private Dokter id_dokter;

   
}
