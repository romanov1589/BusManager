package com.romanov.BusManager.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Api(
        name="Web API",
        description = "Provides a list of methods for web",
        stage= ApiStage.RC)
public class WebController {

    @GetMapping("/")
    @ApiMethod(description = "Get index page")
    public String getIndexPage() {
        return "index";
    }
}
