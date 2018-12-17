/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;

import com.example.model.rawat_jalan;
import com.example.repo.repo_rawat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class control_rawat 
{
@Autowired
private repo_rawat repra;

@RequestMapping(value={"/rawat_jalan"})
public String rawat() 
{
return "rawat_jalan/rawat_jalan";
}

  @GetMapping({"/rawat_jalan"})
  public String rawat_jalan_form(Model model)
  {
    model.addAttribute("rawat_jalan", new rawat_jalan());
    return "rawat_jalan/rawat_jalan";
  }

@RequestMapping(value={"komit"},  method = RequestMethod.POST, params={"action=simpan"})
  public String simpan(rawat_jalan rj)
  {
    this.repra.save(rj);
    return "redirect:/rawat_jalan";
  }
  
 @RequestMapping(value={"komit"}, method=RequestMethod.POST, params={"action=ubah"})
  public String ubah(@RequestParam("id_rawat_jalan") String idr, Model model, rawat_jalan rj)
  {

    model.addAttribute("rawat_jalan", this.repra.findOne(idr));
    this.repra.save(rj);
    return "redirect:/rawat_jalan";
  } 
  
   @RequestMapping(value={"komit"}, method=RequestMethod.POST, params={"action=hapus"})
  public String hapus(@RequestParam("id_rawat_jalan") String idr,Model model, rawat_jalan rj)
  {
   
    model.addAttribute("rawat_jalan", this.repra.findOne(idr));
    this.repra.delete(rj);
    return "redirect:/rawat_jalan";
  }
}
