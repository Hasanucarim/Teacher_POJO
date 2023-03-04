package com.example02.ex02.controller;

import com.example02.ex02.beans.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "index.html";
    }

    @GetMapping("/teacherForm")
    public String teacherForm(){
        return "teacherForm.html";
    }


    @PostMapping("/teacherPost")
    public String teacherPost(@RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String bransi,
                              @RequestParam String tecrubeYili){

        Teacher teacher = new Teacher();


        teacher.setAdi(adi);
        teacher.setSoyadi(soyadi);
        teacher.setBransi(bransi);
        teacher.setTecrubeYili(tecrubeYili);

        System.out.println(teacher);

        return "teacherForm.html";

    }
}
