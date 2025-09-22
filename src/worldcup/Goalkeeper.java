package worldcup;

import java.util.Random;

/**
 * Class to define the goalkeeper
 */
public class Goalkeeper extends Player {
	private boolean globes;

	/**
	 * @return the globes
	 */
	public boolean isGlobes() {
		return globes;
	}

	/**
	 * @param globes the globes to set
	 */
	public void setGlobes(boolean globes) {
		this.globes = globes;
	}

	public boolean block(Ball ball) {
		String[] effects = { "with success", "without success" };

		Random rand = new Random();
		String effect = effects[rand.nextInt(effects.length)];

		System.out.println("catching " + effect);

		boolean action;

		if (effect.equalsIgnoreCase("with success")) {
			action = true;

		} else {
			action = false;
		}
		
		return action;

	}
}
