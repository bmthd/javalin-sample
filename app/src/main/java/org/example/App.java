/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import io.javalin.Javalin;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        var app = Javalin.create().get("/", ctx -> ctx.result("Hello World")).start(7000);
    }
}
