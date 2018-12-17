/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repo;

import com.example.model.Dokter;
import com.example.model.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Windows
 */
public interface Repo_Dokter extends JpaRepository<Dokter, String>
{
    
}