/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.control;

import com.example.model.Diagnosa;
import com.example.repo.RepoDiagnosa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_diagnosa
{
@Autowired
RepoDiagnosa redeg;

@RequestMapping(value={"/diagnosa"})
public String dokter() {
return "diagnosa/diagnosa";
}

@GetMapping({"/diagnosa"})
public String dokter_Form(Model model)
{
model.addAttribute("diagnosa", new Diagnosa());
return "diagnosa/diagnosa";
} 

@RequestMapping(value={"komit_diagnosa"},  method = RequestMethod.POST, params={"aksi_diagnosa=save_diagnosa"})
public String save(Diagnosa diagnosa)
{
this.redeg.save(diagnosa);
return "redirect:/diagnosa";
}

@RequestMapping(value={"komit_diagnosa"}, method=RequestMethod.POST, params={"aksi_diagnosa=edit_diagnosa"})
public String update(@RequestParam("id_diagnosa") String id, Model model, Diagnosa diagnosa)
{
model.addAttribute("diagnosa", this.redeg.findOne(id));
this.redeg.save(diagnosa);
return "redirect:/diagnosa";
}

@RequestMapping(value={"komit_diagnosa"}, method=RequestMethod.POST, params={"aksi_diagnosa=delete_diagnosa"})
public String delete(@RequestParam("id_diagnosa") String id, Model model, Diagnosa diagnosa)
{
model.addAttribute("diagnosa", this.redeg.findOne(id));
this.redeg.delete(diagnosa);
return "redirect:/diagnosa";
}

}
