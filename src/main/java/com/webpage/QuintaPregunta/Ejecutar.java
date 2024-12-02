package com.webpage.QuintaPregunta;

public class Ejecutar {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void ejecutarCommans(){
        command.execute();
    }
}
