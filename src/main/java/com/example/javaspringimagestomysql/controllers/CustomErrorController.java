package com.example.javaspringimagestomysql.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

// Will display error page thats in resources/templates/error.html
// Also add line to application.properties: server.error.whitelabel.enabled=false
@Controller
class CustomErrorController implements ErrorController {

    public CustomErrorController() {}

    @GetMapping(value = "/error")
    public String handleError(HttpServletRequest request) {

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer statusCode = Integer.valueOf(status.toString());

            // This will show the Tomcat error codes
//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "error-404";
//            }
//            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return "error-500";
//            }
        }
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}