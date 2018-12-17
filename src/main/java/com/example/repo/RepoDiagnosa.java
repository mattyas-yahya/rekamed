/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.repo;

import com.example.model.Diagnosa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Windows
 */
public interface RepoDiagnosa extends JpaRepository <Diagnosa,String>
{
    
}
