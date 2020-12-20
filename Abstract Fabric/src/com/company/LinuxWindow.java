package com.company;

public class LinuxWindow implements Window{
    @Override
    public void repaint() {
        System.out.println("Окно перерисовано");
    }

    @Override
    public void toggleExpand() {
        System.out.println("Окно свернуто/развернуто");
    }
}
