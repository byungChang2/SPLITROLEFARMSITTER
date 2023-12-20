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
    @PostMapping("/kjhstring")
    public String kjhstring(@RequestBody TokjhString tokjhString) {
        System.out.println("넘어오는 문자열 값은111? " + tokjhString.getkjhString());
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

    public static class TokjhString {
        private String kjhstring;

        public String getkjhString() {
            return this.kjhstring;
        }

        public String setkjhString(String kjhstring) {
            this.kjhstring = kjhstring;
            return kjhstring;
        }
    }
}