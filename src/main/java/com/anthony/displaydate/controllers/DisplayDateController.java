package com.anthony.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class DisplayDateController {
  
  @RequestMapping("/")
  public String index() {
    return "index.jsp";
  }

  @RequestMapping("/date")
  public String date(Model model) {
    
    SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy");

    Date date = new Date();

    model.addAttribute("date", sdf.format(date));
    
    return "date.jsp";
  }

  @RequestMapping("/time")
  public String time(Model model) {

    SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");

    Date date = new Date();

    model.addAttribute("date", sdf.format(date));
    

    return "time.jsp";
  }

}
