/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.control.rest;

import com.example.model.Obat;
import com.example.repo.repo_obat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_obat_rest
{
@Autowired
private repo_obat rebat;
@RequestMapping(path="/obatAll", method=RequestMethod.GET)
public List<Obat> getAllObat()
{
return (List)this.rebat.findAll();
}
}