package com.nqs.gitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("nihao a ");
        System.out.println("nihao a 1");
        System.out.println("hot-fix test");
        System.out.println("master test");
        System.out.println("push test");
        System.out.println("pull test");

        SpringApplication.run(GitTestApplication.class, args);
    }

}
