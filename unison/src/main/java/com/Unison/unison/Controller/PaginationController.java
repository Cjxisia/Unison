package com.Unison.unison.Controller;

import com.Unison.unison.Entity.boltEntity;
import com.Unison.unison.Entity.lastEntity;
import com.Unison.unison.Entity.refEntity;
import com.Unison.unison.Service.BoltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PaginationController {

    private final BoltService boltService;

    @Autowired
    public PaginationController(BoltService boltService){
        this.boltService = boltService;
    }

    @GetMapping("/")
    public String firstload(){
        return "View";
    }

    @PostMapping("/Distance")
    public String loadPage(@RequestBody Map<String, Integer> request, Model model) {
        int currentPage = request.get("currentPage");
        int buttonType = request.get("buttonType");

        System.out.println("Current Page: " + currentPage);
        System.out.println("Button Type: " + buttonType);

        // 서비스에서 currentPage에 해당하는 데이터 가져오기
        List<boltEntity> bolts = boltService.getBoltByNumber(currentPage, buttonType);
        List<lastEntity> lasts = boltService.getLastByNumber(buttonType);
        List<refEntity> refs = boltService.getRefByNumber(buttonType);

        model.addAttribute("bolts", bolts);
        model.addAttribute("lasts", lasts);
        model.addAttribute("refs", refs);
        model.addAttribute("currentPage", currentPage);
        return "View";
    }
}

