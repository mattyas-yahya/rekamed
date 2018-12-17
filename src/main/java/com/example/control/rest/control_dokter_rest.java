/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control.rest;

import com.example.model.Dokter;
import com.example.repo.Repo_Dokter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_dokter_rest 
{
    @Autowired
   private Repo_Dokter redok;
    @RequestMapping(path="/dokterAll", method=RequestMethod.GET)
	public List<Dokter> getAllDokter(){
return (List)this.redok.findAll();
        }    
}
