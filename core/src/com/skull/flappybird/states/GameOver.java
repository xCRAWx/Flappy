package com.skull.flappybird.states;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.FitViewport;


public class GameOverScreen extends BaseScreen{

    private Stage stage;

    private Skin skin;

    private Image gameover;

    private TextButton retry;

    public GameOverScreen (MainGame game) {
        super(game);

        stage = new Stage(new FitViewport(640, 360));
        skin = new Skin(Gdx.files.internal("skin/skin.json"));
    }
}

