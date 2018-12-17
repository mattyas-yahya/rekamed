/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "rawat_jalan")
public class rawat_jalan implements Serializable {
@Id
@GeneratedValue(generator = "uuid")
@GenericGenerator(name = "uuid", strategy = "uuid2")
@Column(name = "id_rawat_jalan", unique = true, nullable = false)
private String id_rawat_jalan;
@NotEmpty
@Size(min=1, max=30)
private String nok;
@NotEmpty
@Size(min=1, max=30)
private String nama;
@NotEmpty
@Size(min=1, max=30)
private String alamat;
 @DateTimeFormat(pattern = "yyyy-MM-yy")
@Column(name="tgl_berobat", nullable=false)
@Temporal(TemporalType.DATE)
private Date tgl_berobat;
@NotEmpty
private String klinik;
@NotEmpty
private String bayar;
@NotEmpty
private String riwayat_penyakit;
@NotEmpty
private String anamnesia;
@NotEmpty
private String terapi;
 @DateTimeFormat(pattern = "yyyy-MM-yy")
@Column(name="checked", nullable=false)
@Temporal(TemporalType.DATE)
private Date checked;
@NotEmpty
private String nama_dokter;
@NotEmpty
private String nama_penyakit;


  @JoinColumn(name = "id_pasien")
@ManyToOne
   private Pasien id_pasien;
  
@ManyToOne
  @JoinColumn(name = "id_diagnosa")
    private Diagnosa id_diagnosa;
  
    @JoinColumn(name = "id_dokter")
@ManyToOne
    private Dokter id_dokter;
}
