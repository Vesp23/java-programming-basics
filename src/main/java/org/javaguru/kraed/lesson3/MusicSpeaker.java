package org.javaguru.kraed.lesson3;

public class MusicSpeaker {
    private String model;
    private int volume;
    private boolean isOn;

    public MusicSpeaker(String model, int volume, boolean isOn) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void volumeIncrease(){
        if (this.isOn){
            this.volume = this.volume + 1;
        }
    }

    public void turnOff(){
        this.isOn = false;
        this.volume = 0;
    }

    public void  status(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Is on:" + this.isOn());
        System.out.println("volume:" + this.getVolume());
    }
}
