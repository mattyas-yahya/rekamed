/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Windows
 */@Controller
public class control_baarang 
 {
    	@RequestMapping(value={"/barang"})
    public String barang() {
        return "barang/barang";
    }
}
