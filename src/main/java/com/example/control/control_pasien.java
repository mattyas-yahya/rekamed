/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.model.Pasien;
import com.example.repo.repo_pasien;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class control_pasien
{
    @Autowired
   private repo_pasien repas;
    
    	@RequestMapping(value={"/pasien"})
    public String barang() {
        return "pasien/pasien";
    }
     @GetMapping({"/pasien"})
  public String greetingForm(Model model)
  {
    model.addAttribute("pasien", new Pasien());
    return "pasien/pasien";
  }
  
   @RequestMapping(value={"comit"},  method = RequestMethod.POST, params={"action=save"})
  public String save(Pasien pasien)
  {
    this.repas.save(pasien);
    return "redirect:/pasien";
  }
@RequestMapping(value={"comit"}, method=RequestMethod.POST, params={"action=edit"})
  public String update(@RequestParam("id_pasien") String id, Model model, Pasien pasien)
  {
    model.addAttribute("pasien", this.repas.findOne(id));
    this.repas.save(pasien);
    return "redirect:/pasien";
  }
   @RequestMapping(value={"comit"}, method=RequestMethod.POST, params={"action=delete"})
  public String delete(@RequestParam("id_pasien") String id, Model model, Pasien pasien)
  {
    model.addAttribute("pasien", this.repas.findOne(id));
    this.repas.delete(pasien);
    return "redirect:/pasien";
  }
}
