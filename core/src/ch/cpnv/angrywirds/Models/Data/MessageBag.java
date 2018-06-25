package ch.cpnv.angrywirds.Models.Data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import java.util.ArrayList;

public class MessageBag {
    private BitmapFont font;

    public static String message;
    public static float duration;

    static public void setMessage(String msg, float time) {
        message = msg;
        duration = time;
        Gdx.app.log("MESSAGEBAG", "Set message " + message);
    }

    public MessageBag() {
        font = new BitmapFont();
        font.setColor(Color.WHITE);
        font.getData().setScale(3);
    }

    public void draw(Batch batch) {
        if (duration > 0) {
            duration -= Gdx.graphics.getDeltaTime();
            font.draw(batch, message, 30, 60);
        } else {
            message = "";
        }
    }
}
