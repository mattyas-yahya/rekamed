/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.control.rest;

import com.example.model.rawat_jalan;
import com.example.repo.repo_rawat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.annotations.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control_rawat_rest 
{
@Autowired
private repo_rawat reprw;

@RequestMapping(path="/rawat_jalan_All", method=RequestMethod.GET)
public List<rawat_jalan> getAll()
{
return (List<rawat_jalan>) reprw.findAll();
}
     

//@RequestMapping(path="/rawat_jalan_All", method=RequestMethod.GET)
//public void getAllEmployees(HttpServletResponse response) throws JsonProcessingException, IOException
//{
//    response.setContentType("application/json;charset=UTF-8");
//response.setHeader("Cache-Control", "no-cache");
//PrintWriter out = response.getWriter();    
//try{
//rawat_jalan r ; 
//ArrayList arrData = new ArrayList();
//Map<String, String> dataMap = new LinkedHashMap<>();
//Map<String, String> lv = new HashMap<>();
//Gson gson = new Gson();
//List employees = reprw.findAll(); 
//Iterator itr = employees.iterator();
//while (itr.hasNext())
//{ 
//r = (rawat_jalan) itr.next(); 
//lv.put("id_rawat_jalan", r.getId_rawat_jalan());
//lv.put("id_pasien", r.getId_pasien().getId_pasien());
//lv.put("nok", r.getNok());
//lv.put("nama", r.getNama());
//lv.put("alamat", r.getAlamat());
//lv.put("tgl_berobat", r.getTgl_berobat().toString());
//lv.put("klinik", r.getKlinik());
//lv.put("check", r.getChecked().toString());
//lv.put("bayar", r.getBayar());
//lv.put("dokter", r.getDokter());
//lv.put("diagnosa", r.getDiagnosa());
//lv.put("riwayat_penyakit", r.getRiwayat_penyakit());
//lv.put("anamnesia", r.getAnamnesia());
//lv.put("terapi", r.getTerapi());
//arrData.add(lv);
//dataMap.put("data",gson.toJson(arrData));
//out.println(dataMap.put("data", gson.toJson(arrData)));
//}
//}catch (HibernateException e) 
//{ 
//  e.printStackTrace();   
//}
//}
//   
//@RequestMapping(path="/rawat_jalan_All", method=RequestMethod.GET)
//public void getAllEmployees(HttpServletResponse response)
//{
//try {    
//response.setContentType("application/json;charset=UTF-8");
////response.setHeader("Cache-Control", "no-cache");
//PrintWriter out = response.getWriter();    
//rawat_jalan r ;    
//List<rawat_jalan> rj = (List<rawat_jalan>) reprw.findAll();
//Iterator stIterator = rj.iterator();
//ArrayList arrData = new ArrayList();
//Map<String, String> dataMap = new LinkedHashMap<>();
//Gson gson = new Gson();
//while (stIterator.hasNext()) 
//{ 
//r=(rawat_jalan)stIterator.next();
//Map<String, String> lv = new HashMap<>();
//lv.put("id_rawat_jalan", r.getId_rawat_jalan());
//lv.put("id_pasien", r.getId_pasien().getId_pasien());
//lv.put("nok", r.getNok());
//lv.put("nama", r.getNama());
//lv.put("alamat", r.getAlamat());
//lv.put("tgl_berobat", r.getTgl_berobat().toString());
//lv.put("klinik", r.getKlinik());
//lv.put("check", r.getChecked().toString());
//lv.put("bayar", r.getBayar());
//lv.put("dokter", r.getDokter());
//lv.put("diagnosa", r.getDiagnosa());
//lv.put("riwayat_penyakit", r.getRiwayat_penyakit());
//lv.put("anamnesia", r.getAnamnesia());
//lv.put("terapi", r.getTerapi());
//
//arrData.add(lv);
//dataMap.put("data",gson.toJson(arrData));
//out.println(dataMap.put("data", gson.toJson(arrData).toString()));
//System.out.println(dataMap.put("data",gson.toJson(arrData)));
//}
//} catch (IOException e)
//{
//System.out.println(e.getMessage());
//}
//}


}
