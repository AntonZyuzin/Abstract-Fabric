package com.company;

public class Application {
    private Window window;

    public Application(FactoryUI factory){
        window = factory.open();
    }

    public void repaint(){
        window.repaint();
    }
    public void toggleExpand(){
        window.toggleExpand();
    }
}
