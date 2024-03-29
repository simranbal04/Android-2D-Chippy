package com.example.android_2d_chippy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class EnemyPixel {
    private Bitmap image;
    private Rect hitbox;

    private int xPosition;
    private int yPosition;


    public EnemyPixel(Context context, int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        // 2. Set the default image - all enemies have same image
        this.image = BitmapFactory.decodeResource(context.getResources(),R.drawable.block);

        this.hitbox = new Rect(
                this.xPosition,
                this.yPosition,
                this.xPosition + this.image.getWidth(),
                this.yPosition + this.image.getHeight()
        );
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
}
