package com.hellstudios.game;

import java.util.EnumSet;

/**
 * @author strel
 */
public enum TextureType {

    NONE(-1, -1),

    RED_EMPTY_FIELD(0, 0),
    RED_O(1, 0),
    RED_X(2, 0),

    BLUE_EMPTY_FIELD(0, 1),
    BLUE_O(1, 1),
    BLUE_X(2, 1);


    private int ordinal;
    private int color;

    private static EnumSet<TextureType> textures = EnumSet.range(RED_EMPTY_FIELD, BLUE_X);
    private static EnumSet<TextureType> red = EnumSet.range(RED_EMPTY_FIELD, RED_X);
    private static EnumSet<TextureType> blue = EnumSet.range(BLUE_EMPTY_FIELD, BLUE_X);

    TextureType(int ordinal, int color) {
        this.ordinal = ordinal;
        this.color = color;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public int getColor() {
        return color;
    }

    public static TextureType getTextureType(int ordinal, int color) {
        for (TextureType type : TextureType.values()) {
            if (ordinal == type.ordinal && color == type.color) {
                return type;
            }
        }

        return NONE;
    }

    public static EnumSet<TextureType> getTextures() {
        return textures;
    }

    public static EnumSet<TextureType> getRed() {
        return red;
    }

    public static EnumSet<TextureType> getBlue() {
        return blue;
    }
}
