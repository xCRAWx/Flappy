package com.skull.flappybird.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

//Esta clase es la maneja o administra los estados que tengo en el game (menu, jugando, juego terminado...)
public class GameStateManager {

    private Stack<State> states; //pila

  //Constructos, inicia la pila de estados
    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){  //metodo para poner un estado
        states.push(state);
    }

    //metodo para eliminar un estado
    public void pop(){
        states.pop().dispose();
    }

    public void set(State state){
        states.pop().dispose();               //elimino el estado en el que esta
        states.push(state);         //pusheo el estado que estoy recibiendo

    }

    public void update(float dt){   //Delta Time, tiempo real de ejecucion del juego
        states.peek().update(dt);   //Selecciona el estado en el que se encuentra y actualiza con el dt

    }

    public void render(SpriteBatch sb){ //renderizo los estados //Spritebatch (contenedor que ayuda a guardar cosas importantes)
        states.peek().render(sb);
    }
}
