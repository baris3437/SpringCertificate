package com.baris.spring5.contract;

public interface IBlogWriter {
    String BLOG_NAME = "MyBlog";

    void writeArticle(String someInput);

    default public void newDefaultMethod() {
        System.out.println("New default method is added in interface");
    }

    static void hello(){
        System.out.println("Hello, New Static Method Here");
    }
}
