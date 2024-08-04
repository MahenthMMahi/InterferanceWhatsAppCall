package org.example;

public class AudioCall implements WhatsAppCall{
    @Override
    public void calls() {
        System.out.println("WhatsApp audio call");
    }

    @Override
    public void mute() {
        System.out.println("WhatsApp audio call muted..");
    }

    @Override
    public void disconnect() {
        System.out.println("WhatsApp audio call disconnected");
    }
}
