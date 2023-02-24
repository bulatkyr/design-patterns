package org.example.command.simplecommand;

import org.example.command.receiver.Light;

public class RemoteLoaderWithLambda {

    public static void main(String[] args) {
        Light light = new Light();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0, () -> {
            light.on();
        }, () -> {
            light.off();
        });
    }
}
