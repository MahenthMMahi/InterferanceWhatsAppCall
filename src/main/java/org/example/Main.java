package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AudioCall audioCall = new AudioCall();
        audioCall.calls();
        audioCall.mute();
        audioCall.disconnect();

        VideoCall videoCall = new VideoCall();
        videoCall.calls();
        videoCall.mute();
        videoCall.disconnect();
    }
}