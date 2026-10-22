package com.Sena;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejemplocontroller {
@RequestMapping("/ejemplo")
public String hello (){
return "hello mundo";
}
}