package com.coffeeshop.designPatterns;

interface Notification {
    void send();
}

class Email implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}

class SMS implements Notification {
    public void send() {
        System.out.println("SMS sent");
    }
}

class NotificationFactory {
    public static Notification getNotification(String type) {
        if (type.equals("EMAIL")) return new Email();
        if (type.equals("SMS")) return new SMS();
        return null;
    }
}