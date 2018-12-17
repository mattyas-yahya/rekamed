/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control.rest;

import com.example.model.Pasien;
import com.example.repo.repo_pasien;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_pasien_rest 
{
    @Autowired
   private repo_pasien repas;
    @RequestMapping(path="/pasienAll", method=RequestMethod.GET)
	public List<Pasien> getAllEmployees(){
return (List)this.repas.findAll();
        }
}
