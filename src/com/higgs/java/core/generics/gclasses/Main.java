package com.higgs.java.core.generics.gclasses;

import com.higgs.java.core.common.model.Book;
import com.higgs.java.core.common.model.User;

public class Main {
    public static void main(String[] args) {
        User user = getUser().getData();
        Book book = getBook().getData();
    }

    private static HttpResponse<User> getUser() {
        // User can be got from ...
        User user = new User("Quy", 23);

        HttpResponse response = new HttpResponse<User>("200", "Get user successfully", user);

        return response;
    }

    private static HttpResponse<Book> getBook() {
        // User can be got from ...
        Book book = new Book("SCJP 6", 2.3);

        HttpResponse response = new HttpResponse<Book>("200", "Get user successfully", book);

        return response;
    }
}
