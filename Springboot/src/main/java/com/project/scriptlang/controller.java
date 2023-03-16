package com.project.scriptlang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.*;

@Controller
@SpringBootApplication
public class controller {

    @GetMapping("/")
    public String arayuz(){
        return "arayuz";
    }

    @PostMapping("/register")
    public String kayit(@ModelAttribute kullanici kullanici, Model model) throws IOException {
        System.out.println(kullanici.toString());
        model.addAttribute("fname",kullanici.getFname());
        FileWriter writer = new FileWriter("users.txt", true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(kullanici.getFname() + "," + kullanici.getLname() + ","  + kullanici.getPass());
        bw.newLine();
        bw.close();

        return "anasayfa";
    }
}
