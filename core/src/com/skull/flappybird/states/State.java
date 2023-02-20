package com.skull.flappybird.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class State {

    protected OrthographicCamera camera; //muestra solo una parte del juego.
    protected Vector3 mouse; //Donde hace click o donde posiciona el puntero.
    protected GameStateManager gsm;

    protected State(GameStateManager gameStateManager){
        this.gsm = gameStateManager;
        camera = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt); //Actualiza el game en tiempo real
    public abstract void render(SpriteBatch spritebatch); //Carga elementos para el game
    public abstract void dispose();


}
