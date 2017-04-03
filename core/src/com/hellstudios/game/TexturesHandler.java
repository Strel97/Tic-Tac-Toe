package com.hellstudios.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author strel
 */
public class TexturesHandler {

    private static TexturesHandler instance;

    private Texture textureAtlas;
    private TextureRegion[] textures;


    public static TexturesHandler getInstance() {
        if (instance == null) {
            instance = new TexturesHandler();
        }

        return instance;
    }

    public TextureRegion getTexture(TextureType type) {
        return textures[type.getOrdinal() + type.getColor() * 3];
    }

    private TexturesHandler() {
        textureAtlas = new Texture("tic-tac-toe.bmp");
        textures = new TextureRegion[TextureType.getTextures().size()];

        for (TextureType type : TextureType.getTextures()) {
            textures[type.getOrdinal() + type.getColor() * 3] = new TextureRegion(textureAtlas,
                    140 * type.getOrdinal(), 140 * type.getColor(),
                    140, 140
            );
        }
    }

    public void dispose() {
        textureAtlas.dispose();
    }
}
