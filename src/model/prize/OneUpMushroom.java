/**
 * the purpose of this class is to provide the behaviors and attributes of a one-up mushroom game object
 */

package model.prize;

import manager.GameEngine;
import model.hero.Mario;

import java.awt.image.BufferedImage;

public class OneUpMushroom extends BoostItem{

    public OneUpMushroom(double x, double y, BufferedImage style) {
        super(x, y, style);
        setPoint(200);
    }

    @Override
    public void onTouch(Mario mario, GameEngine engine) {
        mario.acquirePoints(getPoint());
        mario.setRemainingLives(mario.getRemainingLives() + 1);
        engine.playOneUp();
    }

//    @Override
//    public void onReveal(GameEngine engine) {
//        engine.playPowerUpAppears();
//    }
}
