package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/energibesparelser")
    public String energibesparelser(){ return "energibesparelser"; }

    @GetMapping("/tao-ordningen")
    public String taoOrdningen(){ return "tao-ordningen"; }

    @GetMapping("/driftsstatus")
    public String driftsstatus(){ return "driftsstatus"; }

}
