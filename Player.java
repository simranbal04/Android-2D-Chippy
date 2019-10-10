package com.example.android_2d_chippy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;

import java.util.ArrayList;

public class Player {

    private Bitmap image;
    private Rect hitbox;

    public int xPosition;
    public int yPosition;
    public  int width;
    private int speed;

    private ArrayList<Rect> bullets = new ArrayList<> ();
    private  final int Bullet_Width = 5;

    public  Player(Context context, int x, int y)
    {
        //1. set up the initial position of the enemy
        this.xPosition = x;
        this.yPosition = y;

        //2. set the default hitbox - all enemies have same hitbox
        this.hitbox = new Rect (
                this.xPosition,
                this.yPosition,
                this.xPosition + this.image.getWidth(),
                this.yPosition + this.image.getHeight()
        );
//
    }
    public Player(Context context, int x, int y, int width, int speed) {
        this.xPosition = x;
        this.yPosition = y;
        this.width = width;
        this.speed = speed;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Rect> getBullets() {
        return bullets;
    }

    public void setBullets(ArrayList<Rect> bullets) {
        this.bullets = bullets;
    }

    public int getBullet_Width() {
        return Bullet_Width;
    }

    // Make a new bullet
    public void spawnBullet () {
        // make bullet come out of middle of enemy
        Rect bullet = new Rect(this.xPosition,
                this.yPosition + this.image.getWidth() / 2,
                this.xPosition + Bullet_Width,
                this.yPosition + this.image.getHeight());

        this.bullets.add(bullet);
    }

    public void updateHitbox() {
        this.hitbox.left = this.xPosition;
        this.hitbox.top = this.yPosition;
        this.hitbox.right = this.xPosition + this.image.getWidth();
        this.hitbox.bottom = this.yPosition + this.image.getHeight();
    }


}
