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
        System.out.println("넘어오는 문자열 값은_허정선? " + todoRequest.getTodoItem());
        String pretest = todoRequest.getTodoItem();
        String test = todoRequest.setTodoItem(pretest);
        return test;
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
        }
    }
}