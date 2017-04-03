package com.hellstudios.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Arrays;

/**
 * @author strel
 */
public class Field {

    private static final int FIELD_SIZE = 3;
    private FieldType[] field;


    public Field() {
        field = new FieldType[FIELD_SIZE * FIELD_SIZE];
        Arrays.fill(field, FieldType.EMPTY);
    }


    public void render(SpriteBatch batch) {
        if (batch == null) {
            return;
        }

        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                batch.draw(
                        TexturesHandler.getInstance().getTexture(
                                TextureType.getTextureType(field[i * FIELD_SIZE + j].ordinal(), 0)
                        ),
                        i * 140, j * 140
                );
            }
        }
    }
}
