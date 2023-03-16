package com.project.scriptlang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller

public class admin {

    @GetMapping("/admin")
    public String showAdminPanel(Model model) {
        List<kullanici> users = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                kullanici user = new kullanici();
                user.setFname(userData[0]);
                user.setLname(userData[1]);
                user.setPass(userData[2]);

                users.add(user);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("users", users);
        return "admin";
    }



}

