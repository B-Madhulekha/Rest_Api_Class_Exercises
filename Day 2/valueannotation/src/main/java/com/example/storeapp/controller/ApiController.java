package com.example.storeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.storeapp.model.AppConfig;

@RestController
public class ApiController {
   @Autowired
   AppConfig conf;

   @GetMapping("/info")
   public String getApp() {
      return new String(conf.getAppName()+" "+conf.getAppVersion());
   }

}
