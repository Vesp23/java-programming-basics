package org.javaguru.kraed.lesson3;

public class SpeakerApp {
    public static void main(String[] args) {
        MusicSpeaker speaker1 = new MusicSpeaker("Sony", 0, false);
        speaker1.status();

        speaker1.turnOn();
        speaker1.volumeIncrease();
        speaker1.volumeIncrease();
        speaker1.volumeIncrease();
        speaker1.volumeIncrease();
        speaker1.volumeIncrease();

        speaker1.status();
        speaker1.turnOff();

        speaker1.status();
    }
}
