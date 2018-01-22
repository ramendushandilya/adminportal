package com.admin.controller;

import com.admin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by failedOptimus on 20-01-2018.
 */

@Controller
public class ResourceController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book/removeList", method = RequestMethod.POST)
    public String removeList(
            @RequestBody ArrayList<String> bookIdList,
            Model model
            ) {
        for(String id : bookIdList) {
            String bookId = id.substring(8);
            bookService.removeOne(Long.parseLong(bookId));
        }
        return "deleteSuccess";
    }
}