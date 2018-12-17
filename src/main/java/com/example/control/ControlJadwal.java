/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;

import com.example.model.Jadwal;
import com.example.repo.RepoJadwal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControlJadwal 
{
    @Autowired
 private RepoJadwal rejal;
@RequestMapping(value={"/jadwal"})
    public String jadwal() {
        return "jadwal/jadwal";
    }    
    @GetMapping({"/jadwal"})
public String jadwal_Form(Model model)
{
model.addAttribute("jadwal", new Jadwal());
return "jadwal/jadwal";
}

@RequestMapping(value={"komite"},  method = RequestMethod.POST, params={"aksi=save"})
public String save(Jadwal jadwal)
{
this.rejal.save(jadwal);
return "jadwal/jadwal";
}
}
