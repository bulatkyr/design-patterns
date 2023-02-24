package org.example.command.simplecommand;

import org.example.command.receiver.GarageDoor;
import org.example.command.receiver.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        remote.setCommand(new LightOnCommand(light));

        remote.buttonWasPressed();

        remote.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        remote.buttonWasPressed();
    }
}
