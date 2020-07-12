package com.demo;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.Random;

@Controller("/demo")
public class DemoController {
    @Get
    @View("demo")
    public HttpResponse showDemoPage() {
        Random random = new Random();
        char randomChar = (char)(random.nextInt(26) + 'a');

        Demo demoObject = new Demo();
        demoObject.demoText = String.valueOf(randomChar);

        return HttpResponse.ok(CollectionUtils.mapOf("demo", demoObject));
    }
}
