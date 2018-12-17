/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.model;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

@Getter @Setter @NoArgsConstructor
@Entity
public class Pasien implements Serializable
{
@Id
@GeneratedValue(generator="system-uuid")
@GenericGenerator(name="system-uuid", strategy="uuid")
private String id_pasien;
@NotEmpty
@Size(min=1, max=30)
private String nok;
@NotEmpty
@Size(min=1, max=30)
private String nama;
@NotEmpty
@Size(min=1, max=30)
private String alamat;
//@JsonFormat(shape = JsonFormat.Shape.NATURAL, pattern = "dd-MM-yyyy")
 @DateTimeFormat(pattern = "yyyy-MM-yy")
@Temporal(TemporalType.DATE)
private Date tgl_lhr;
private int umur;
@NotEmpty
@Size(min=1, max=30)
private String telp;
@NotEmpty
@Size(min=1, max=30)
private String kecamatan;
@NotEmpty
@Size(min=1, max=30)
private String n_ortu;
@NotEmpty
@Size(min=1, max=30)
private String alamat_ortu;
@NotEmpty
@Size(min=1, max=30)
private String pekerjaan;
@NotEmpty
@Size(min=1, max=30)
private String agama;
@NotEmpty
@Size(min=1, max=30)
private String stat_nikah;
@NotEmpty
@Size(min=1, max=30)
private String jekel;
}
