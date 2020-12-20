package com.company;

public class WindowsFactory implements FactoryUI {
    @Override
    public Window open() {
        return new WindowsWindow();
    }
}
