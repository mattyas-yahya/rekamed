/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repo;

import com.example.model.rawat_jalan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Windows
 */
public interface repo_rawat extends JpaRepository<rawat_jalan, String> 
{
    @Query(value = "select  id_rawat_jalan,alamat,anamnesia,bayar,checked,diagnosa,dokter,klinik,nama,nok,riwayat_penyakit,terapi,tgl_berobat,id_pasien from rawat_jalan", nativeQuery = true)
List<rawat_jalan> findAllData();

//    @Query(value = "SELECT max(nama_penyakit)FROM as mx rawat_jalan;", nativeQuery = true)
//    List<rawat_jalan> mPenyakit();
}
