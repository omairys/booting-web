package com.omairys.lil.sbet.landon.roomwebapp.controllers;

import com.omairys.lil.sbet.landon.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static RoomService roomservice;

    public RoomController(RoomService roomservice) {
        this.roomservice = roomservice;
    }

    @GetMapping
    public String getAllRoom(Model model){
        model.addAttribute("rooms", roomservice.getAllRooms());
        return "rooms";
    }
}
