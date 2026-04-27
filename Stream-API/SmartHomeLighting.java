package com.gla.Streamapi;

interface LightAction {
    void perform();
}

public class SmartHomeLighting {
    public static void main(String[] args) {

        LightAction motionLight = () -> System.out.println("Light ON due to motion");
        LightAction nightLight = () -> System.out.println("Dim light ON at night");
        LightAction voiceLight = () -> System.out.println("Light ON via voice command");

        motionLight.perform();
        nightLight.perform();
        voiceLight.perform();
    }
}