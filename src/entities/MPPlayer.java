package entities;

import org.lwjgl.util.vector.Vector3f;

import models.TexturedModel;

public class MPPlayer extends Entity{ 
	
	public MPPlayer(TexturedModel model, int index, Vector3f position, float rotX, float rotY, float rotZ,
			float scale) {
		super(model, index, position, rotX, rotY, rotZ, scale);
	}

	
	
}
