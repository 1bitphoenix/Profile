package com.example.rituka.profile;

/**
 * Created by rituka on 6/10/17.
 */

public class User {
    String name;
    String branch;

    public User(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}
