/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.repo.repo_pasien;
import com.example.repo.repo_rawat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;
import com.example.model.rawat_jalan;

@ControllerAdvice
@Controller
@RequestMapping("/index")
public class control_index 
{

    @Autowired
    repo_pasien rp;
    @Autowired
    repo_rawat rr;

    rawat_jalan rrr = new rawat_jalan();
//    @GetMapping("/index")
//    public String greeting() 
//    {
////           ModelAndView model = new ModelAndView("index");
////        model.addObject("id_pasien", rep.c_pasien());
//        return "index";
//    }
    
//@ModelAttribute("count")
//public Long index () 
//{
// //model.addAttribute("count",rep.count() );
// return rep.count();
//}
  
 //@RequestMapping(value={"/index"}, method = RequestMethod.GET)
// @GetMapping("/index")
//public ModelAndView index()
//  {   
//   ModelAndView mv = new ModelAndView("index");
//   mv.addObject("count",rep.count() );
//   mv.setViewName("index");
//   return mv;
//  }  
 @ModelAttribute
    public void getX(final Model model)
 {
           List<Long> ls = new ArrayList<>();
           ls.add(rp.count());
        model.addAttribute("rp",ls.toString().charAt(1));
        
    }
//    @ModelAttribute
//    public void getRx(final Model model)
//    {
//
//        List<Long> ls = new ArrayList<>();
//        ls.add(rr.count());
//        model.addAttribute("rx",ls.toString().charAt(1));
//    }

    @ModelAttribute
    public void getRz(final Model model)
    {
        List<Long> ls = new ArrayList<>();
        ls.add(rr.count());
        model.addAttribute("rr",ls.toString().charAt(1));
    }
// @ModelAttribute("jumlah")
//    public long home()
//    {
//      //  jumlah.add(rep.count());
//        return rep.count();
//    }

}
