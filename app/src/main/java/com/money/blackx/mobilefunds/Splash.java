package com.money.blackx.mobilefunds;

import com.money.blackx.mobilefunds.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        final Timer ti = new Timer();
        ti.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent t = new Intent(Splash.this, Main.class);
                t.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(t);
                this.cancel();
                Splash.this.finish();
            }

        },3000,3000);
    }
}
