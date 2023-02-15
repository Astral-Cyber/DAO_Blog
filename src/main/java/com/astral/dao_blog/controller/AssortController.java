package com.astral.dao_blog.controller;

import com.astral.dao_blog.entity.assort;
import com.astral.dao_blog.service.AssortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssortController {

    final AssortService assortService;
    @Autowired
    public AssortController(AssortService assortService){
        this.assortService=assortService;
    }
    @GetMapping("/admin/allSorts")
    public List<assort> allSorts(){
        return assortService.allAssort();
    }

    @PostMapping("/admin/newSort")
    public String newSort(@RequestBody String name){
        return assortService.newAssort(name);
    }
}
