package com.example.backend.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @PostMapping("/addItem")
    public String addItem(@RequestBody TodoRequest todoRequest) {
        System.out.println("넘어오는 문자열 값은? " + todoRequest.getTodoItem());
        String pretest = todoRequest.getTodoItem();
        String test = todoRequest.setTodoItem(pretest);
        return test;
    }
    @PostMapping("/kjhstring")
    public String kjhstring(@RequestBody TokjhString tokjhString) {
        System.out.println("kjh넘어오는 문자열 값은? " + tokjhString.getkjhString());
        String pretestt = tokjhString.getkjhString();
        String testt = tokjhString.setkjhString(pretestt);
        return testt;
    }


    public static class TodoRequest {
        private String todoItem;

        public String getTodoItem() {
            return this.todoItem;
        }

        public String setTodoItem(String todoItem) {
            this.todoItem = todoItem;
            return todoItem;
        }
    }

<<<<<<< HEAD
    @PostMapping("/addContent")
    public String addContent(@RequestBody InputContent inputContent) {
        System.out.println("content 입력"+ inputContent.getInputContent());
        String preinput = inputContent.getInputContent();
        String input = inputContent.setInputContent(preinput);
        return input;
    }
    
    public static class InputContent {
        private String inputContent;

        public String getInputContent(){
            return this.inputContent;
        }
        
        public String setInputContent(String inputContent){
            this.inputContent = inputContent;
            return inputContent;
=======
    public static class TokjhString {
        private String kjhstring;

        public String getkjhString() {
            return this.kjhstring;
        }

        public String setkjhString(String kjhstring) {
            this.kjhstring = kjhstring;
            return kjhstring;
>>>>>>> 0a3dc87f8155cf7c86a1b8781fd4badffec6fab4
        }
    }
}