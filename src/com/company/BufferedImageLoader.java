package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by akupp_000 on 6/4/2017.
 */
public class BufferedImageLoader
{
    private BufferedImage image;
    public BufferedImage loadImage(String path){
        try {
            image = ImageIO.read(getClass().getResource(path));
        }
        catch (IOException e){

        }
        return image;
    }
}
