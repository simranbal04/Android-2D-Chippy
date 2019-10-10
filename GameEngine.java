package com.example.android_2d_chippy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameEngine extends SurfaceView implements Runnable {

    // android debug variables
    final static String TAG="CHIPPY";

    //screen size
    int schreenHeight;
    int screenWidth;

    //game state
    boolean gameIsRunning;

    //threading
    Thread gameThread;
    Bitmap background;
    int bgXPosition = 0;
    int backgroundRightSide = 0;

    //drawing variables
    SurfaceHolder holder;
    Canvas canvas;
    Paint paintbrush;

    int blocklives = 5;

    Player player;

    int Core_Live = 10;

    Player enemy;
    int SQUARE_WIDTH = 15;


    // game specific variables
    EnemyPixel[] enemyPixels = new EnemyPixel[30];
    EnemyPixel skull;

    //sprites
    //game state
    public GameEngine(Context context, int w, int h) {
        super(context);

        this.holder = this.getHolder();
        this.paintbrush = new Paint();

        this.schreenHeight = h;
        this.screenWidth = w;

        this.background = BitmapFactory.decodeResource(context.getResources(),R.drawable.background);

        this.background = Bitmap.createScaledBitmap(
                this.background,
                this.screenWidth,
                this.schreenHeight,
                false
        );


        this.bgXPosition = 0;

        this.player = new Player(getContext(),100, 100);
    }

    @Override
    public void run() {

    }
}
