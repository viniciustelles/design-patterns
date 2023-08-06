package br.com.design.patterns.command.commands;

import br.com.design.patterns.command.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	private GenericLight light;
	
	
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
