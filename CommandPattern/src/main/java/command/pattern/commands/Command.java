package command.pattern.commands;

import command.pattern.CommandInvoker;
import command.pattern.OperationReceiver;

/**
 * Abstract command class
 */
public abstract class Command {
    protected OperationReceiver operationReceiver;
    protected CommandInvoker invoker;

    public Command(OperationReceiver t, CommandInvoker i) {
        operationReceiver = t;
        invoker = i;
    }

    public abstract void undo();

    public abstract boolean execute();
}
