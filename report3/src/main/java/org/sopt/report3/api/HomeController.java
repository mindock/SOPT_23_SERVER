package org.sopt.report3.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String getNowDate() {
        return new Date().toString();
    }
}
