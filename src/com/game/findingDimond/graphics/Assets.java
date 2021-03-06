package com.game.findingDimond.graphics;

import java.awt.image.BufferedImage;

/**
 *
 * @GAME
 */
public class Assets {
    
    private static final int width = 32, height = 32;
    
    public static BufferedImage dirt, grass, stone, tree, dimond, menuBackground;
    public static BufferedImage[] player_down, player_up, player_left, player_right;
    public static BufferedImage[] btn_start;
    
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Sheet.png"));
        SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/Dsecond.png"));
        
//        btn_start = new BufferedImage[2];
//        btn_start[0] = sheet.crop(0, height * 3, width, height);
//        btn_start[1] = sheet.crop(width * 2, height * 3, width, height);
        
        player_down = new BufferedImage[2];
        player_up = new BufferedImage[2];
        player_left = new BufferedImage[2];
        player_right = new BufferedImage[2];
        
        player_down[0] = sheet.crop(0, 0, width, height);
        player_down[1] = sheet.crop(width * 2, height, width, height);
        player_up[0] = sheet.crop(width, height, width, height);
        player_up[1] = sheet.crop(width * 3, height, width, height);
        player_left[0] = sheet.crop(width * 6, height, width, height);
        player_left[1] = sheet.crop(width * 7, height, width, height);
        player_right[0] = sheet.crop(width * 4, height, width, height);
        player_right[1] = sheet.crop(width * 5, height, width, height);
        
        dirt = sheet.crop(width, 0, width, height);
        grass = sheet.crop(width * 2, 0, width, height);
        stone = sheet.crop( width * 3, 0, width, height);
        tree = sheet.crop(0, height, width, height);
        dimond = sheet.crop(width * 4, 0, width, height);
        menuBackground = sheet1.crop(0, 0, 128 * 3, 128 * 2);
    }
    
}
