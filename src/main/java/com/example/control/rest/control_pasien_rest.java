/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control.rest;

import com.example.model.Pasien;
import com.example.repo.repo_pasien;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
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
        
//          @RequestMapping(path="/c_pasien", method=RequestMethod.GET)
//	public Long getC(){
//       return this.repas.count();
//        }
        
        @RequestMapping(path="/c_pasien", method=RequestMethod.GET)
public void getID(HttpServletResponse response) throws JsonProcessingException, IOException
{
    response.setContentType("application/json;charset=UTF-8");
response.setHeader("Cache-Control", "no-cache");
PrintWriter out = response.getWriter();    
try{
Pasien r ; 
ArrayList arrData = new ArrayList();
Map<String, String> dataMap = new LinkedHashMap<>();
Map<String, Long> lv = new HashMap<>();
Gson gson = new Gson();
lv.put("id", repas.count());
arrData.add(lv);
dataMap.put("data",gson.toJson(arrData));
out.println(dataMap.put("data", gson.toJson(arrData)));

}catch (HibernateException e) 
{ 
  e.printStackTrace();   
}
}
}
