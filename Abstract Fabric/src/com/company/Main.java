package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.repaint();
        app.toggleExpand();
    }

    private static Application configureApplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название системы");
        String osName = sc.nextLine().toLowerCase();;
        Application app;
        FactoryUI factory;
        if (osName.contains("Linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}
