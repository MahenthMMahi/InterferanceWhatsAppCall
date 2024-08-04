package org.example;

public class VideoCall implements WhatsAppCall{
    @Override
    public void calls() {
        System.out.println("WhatsApp Video Call");
    }

    @Override
    public void mute() {
        System.out.println("WhatsApp Video Call muted");
    }

    @Override
    public void disconnect() {
        System.out.println("WhatsApp Video Call disconnected");
    }
}
