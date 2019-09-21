package com.blocksolid.retrofittutorial.model;

public class GitHubUser {
/*
"name": "Sathya Babu ",
  "company": "Edureka",
  "blog": "www.edureka.co",
  "location": "Bangalore",

 "bio": "Been in IT for over two decades, Consulting, Development, and corporate training.",
 */
    private String name;
    private String company;
    private String blog;
    private String bio;

    public String getName() {
        return name;
    }

    public String getBlog() {
        return blog;
    }

    public String getCompany() {
        return company;
    }

    public String getBio() {
        return bio;
    }
}
