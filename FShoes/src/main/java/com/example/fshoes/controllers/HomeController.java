package com.example.fshoes.controllers;

import com.example.fshoes.entity.ChatLieuVai;
import com.example.fshoes.repository.ChatLieuVaiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
//@RequestMapping("/home")
public class HomeController {
    @Autowired
    ChatLieuVaiRepo chatLieuVaiRepo;
    @GetMapping("/admin")
    public String index(Model model) {
        return "admin/index";
    }
    @GetMapping("/admin/chatlieuvai")
    public String loadFragment(Model model) {
        model.addAttribute("chatLieuVai", new ChatLieuVai());
        model.addAttribute("listChatLieuVai", chatLieuVaiRepo.findAll());
        return "admin/chatLieuVai/index" ;
    }
    @PostMapping("/chatlieuvai/add")
    public String addChatLieuVai(@ModelAttribute("chatLieuVai") ChatLieuVai chatLieuVai){
        chatLieuVai.setCreatedAt(LocalDateTime.now());
        chatLieuVaiRepo.save(chatLieuVai);
        return "redirect:/thuoctinhsanpham/chatlieuvai";
    }

    @GetMapping("/thuoctinhsanpham/chatlieuvai/delete/{id}")

    public  String deleteChatLieuVai(@PathVariable("id") Long id) {
           ChatLieuVai lieuVai = chatLieuVaiRepo.findById(id).get();
            lieuVai.setTrangThai(3);
            chatLieuVaiRepo.save(lieuVai);
            return "redirect:/thuoctinhsanpham/chatlieuvai";

    }
    @GetMapping("/thuoctinhsanpham/chatlieuvai/edit/{id}")
    public String editChatLieuVai(@PathVariable("id") Long id, Model model) {
        ChatLieuVai chatLieuVai = chatLieuVaiRepo.findById(id).get();
        model.addAttribute("chatLieuVai", chatLieuVai);
        model.addAttribute("listChatLieuVai", chatLieuVaiRepo.findAll());
        return "thuoctinhsanpham/chatLieuVai";
    }
    @PostMapping("/thuoctinhsanpham/chatlieuvai/update")
    public String updateChatLieuVai(@ModelAttribute("chatLieuVai") ChatLieuVai chatLieuVai){
        chatLieuVai.setUpdatedAt(LocalDateTime.now());
        chatLieuVaiRepo.save(chatLieuVai);
        return "redirect:/thuoctinhsanpham/chatlieuvai";
    }
}
