package com.coffeeshop.java17;

public class RoleAccess {

    enum Role {
        ADMIN, USER, GUEST
    }

    public static void main(String[] args) {
        Role role = Role.ADMIN;

        String access = switch (role) {
            case ADMIN -> "Full Access";
            case USER -> "Limited Access";
            case GUEST -> "Read Only";
        };

        System.out.println(access);
    }
}