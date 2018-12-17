/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.control;

import com.example.model.Dokter;
import com.example.repo.Repo_Dokter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control_dokter 
{
@Autowired
private Repo_Dokter redok;

 	@RequestMapping(value={"/dokter"})
    public String dokter() {
        return "dokter/dokter";
    }
@GetMapping({"/dokter"})
public String dokter_Form(Model model)
{
model.addAttribute("dokter", new Dokter());
return "dokter/dokter";
}  

@RequestMapping(value={"komit"},  method = RequestMethod.POST, params={"aksi=save"})
public String save(Dokter dokter)
{
this.redok.save(dokter);
return "redirect:/dokter";
}

@RequestMapping(value={"komit"}, method=RequestMethod.POST, params={"aksi=edit"})
public String update(@RequestParam("id_dokter") String id, Model model, Dokter dokter)
{
model.addAttribute("dokter", this.redok.findOne(id));
this.redok.save(dokter);
return "redirect:/dokter";
}

@RequestMapping(value={"komit"}, method=RequestMethod.POST, params={"aksi=delete"})
public String delete(@RequestParam("id_dokter") String id, Model model, Dokter dokter)
{
model.addAttribute("dokter", this.redok.findOne(id));
this.redok.delete(dokter);
return "redirect:/dokter";
}
}
