package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources;

public record FullNameResource(String name, String lastname) {
    public String fullName(){
        return name+" "+lastname;
    }
}
