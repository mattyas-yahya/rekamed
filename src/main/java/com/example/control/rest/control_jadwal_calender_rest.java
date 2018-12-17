/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control.rest;

import com.example.model.Jadwal;
import com.example.repo.RepoJadwal;
import com.google.gson.Gson;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_jadwal_calender_rest {
     @Autowired
   private RepoJadwal rejal;
    @RequestMapping(path="/jadwal_All", method=RequestMethod.GET)
public void getAllEmployees(HttpServletResponse response)
{
try {    
response.setContentType("application/json;charset=UTF-8");
response.setHeader("Cache-Control", "no-cache");
PrintWriter out = response.getWriter();    
Jadwal r = new Jadwal();    
List<Jadwal> rj = (List<Jadwal>) rejal.findAll();
Iterator stIterator = rj.iterator();
ArrayList arrData = new ArrayList();
Map<String, String> dataMap = new LinkedHashMap<String, String>();
Gson gson = new Gson();
while (stIterator.hasNext()) 
{ 
r=(Jadwal)stIterator.next();
Map<String, String> lv = new HashMap<String, String>();
lv.put("id", r.getId_jadwal());
lv.put("title", r.getNama());
lv.put("start", r.getMulai().toString());
lv.put("end", r.getSelesai().toString());
arrData.add(lv);
dataMap.put("data",gson.toJson(arrData));
out.println(dataMap.put("data", gson.toJson(arrData)));
System.out.println(dataMap.put("data",gson.toJson(arrData)));
}
} catch (Exception e)
{
System.out.println(e.getMessage());
}
}
}
