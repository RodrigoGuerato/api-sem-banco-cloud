package br.com.edusync.api.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "Hello World", notes = "Primeira API Construida")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Não estamos no dia bom")
    })
    @RequestMapping(value = "/ola", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World !!";
    }

}
