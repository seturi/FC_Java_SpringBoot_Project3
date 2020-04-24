package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multi-form / text-plain


    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestParam SearchParam searchParam) {

        return searchParam;
    }
}
