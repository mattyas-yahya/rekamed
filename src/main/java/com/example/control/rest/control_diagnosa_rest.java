/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control.rest;

import com.example.model.Diagnosa;
import com.example.repo.RepoDiagnosa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_diagnosa_rest {
      @Autowired
   private RepoDiagnosa redeg;
    @RequestMapping(path="/diagnosaAll", method=RequestMethod.GET)
	public List<Diagnosa> getAllDiagnosa(){
return (List)this.redeg.findAll();
        }    
}
