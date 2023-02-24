package org.example.command.undo;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastExecutedCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i < 7; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        lastExecutedCommand = new NoCommand();
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
        if (slotNumber >= 0 && slotNumber < 7) {
            onCommands[slotNumber] = onCommand;
            offCommands[slotNumber] = offCommand;
        } else {
            throw new IllegalArgumentException("Slot number is out of boundaries");
        }
    }

    public void onButtonWasPressed(int slotNumber) {
        onCommands[slotNumber].execute();
        lastExecutedCommand = onCommands[slotNumber];
    }

    public void offButtonWasPressed(int slotNumber) {
        offCommands[slotNumber].execute();
        lastExecutedCommand = offCommands[slotNumber];
    }

    public void undoButtonWasPressed() {
        lastExecutedCommand.undo();
    }

}
