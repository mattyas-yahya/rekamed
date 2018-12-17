/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;

import com.example.model.Obat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.repo.repo_obat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class control_obat 
{
    @Autowired
private repo_obat rebat;
    
@RequestMapping(value={"/obat"})
public String rawat() 
{
return "obat/obat";
}

  @GetMapping({"/obat"})
  public String rawat_jalan_form(Model model)
  {
    model.addAttribute("obat", new Obat());
    return "obat/obat";
  }   
  
  @RequestMapping(value={"komit_obat"},  method = RequestMethod.POST, params={"action_obat=simpan_obat"})
  public String simpan(Obat obat)
  {
    this.rebat.save(obat);
    return "redirect:/obat";
  }
  
 @RequestMapping(value={"komit_obat"}, method=RequestMethod.POST, params={"action_obat=ubah_obat"})
  public String ubah(@RequestParam("id_obat") String ido, Model model, Obat obat)
  {

    model.addAttribute("obat", this.rebat.findOne(ido));
    this.rebat.save(obat);
    return "redirect:/obat";
  }  
  
  
  @RequestMapping(value={"komit_obat"}, method=RequestMethod.POST, params={"action_obat=hapus_obat"})
  public String hapus(@RequestParam("id_obat") String ido,Model model, Obat obat)
  {
    model.addAttribute("obat", this.rebat.findOne(ido));
    this.rebat.delete(obat);
    return "redirect:/obat";
  }
}
