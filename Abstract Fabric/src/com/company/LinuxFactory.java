package com.company;

public class LinuxFactory implements FactoryUI {
    @Override
    public Window open() {
        return new LinuxWindow();
    }
}
