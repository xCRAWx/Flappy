package com.skull.flappybird.states;

//MenuState es un estado del game.

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.skull.flappybird.FlappyBird;

public class MenuState extends State{

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gameStateManager){
        super(gameStateManager);
        camera.setToOrtho(false, FlappyBird.WIDTH / 2, FlappyBird.HEIGHT / 2);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));

        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch spritebatch) {
        spritebatch.setProjectionMatrix(camera.combined);
        spritebatch.begin();

        spritebatch.draw(background, 0,0); //x0, y0 toma como punto de partida la punta inferior izquierda.

        spritebatch.draw(playButton, camera.position.x - playButton.getWidth() / 2, camera.position.y);

        spritebatch.end();
    }

    @Override
    public void dispose() { //elimina elementos que no estamos usando en el juego y liberar memoria.
        background.dispose();
        playButton.dispose();
        System.out.println("MENU STATE DISPOSED");
    }
}
