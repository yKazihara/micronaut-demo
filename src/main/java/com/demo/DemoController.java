package com.demo;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/demo")
public class DemoController {
    @Get
    @View("demo")
    public HttpStatus showDemoPage() {
        return HttpStatus.OK;
    }
}
