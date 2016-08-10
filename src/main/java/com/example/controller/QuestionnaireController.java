/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QuestionnaireController {

    @RequestMapping("/questionnaire")
    public String index() {
        return "Yes you are on the right path";
    }

}
