package com.example.marcelo.layoutspro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends Activity  implements View.OnKeyListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_UP) {
            return true;
        }
        return false;
    }

    public void botaoTable(View v) {
        Intent i = new Intent(this, TableActivity.class);
        startActivity(i);
    }

    public void botaoGrid(View v) {
        Intent i = new Intent(this, GridCalculadora.class);
        startActivity(i);
    }
    public void botaoCardapio (View v) {
        Intent i = new Intent(this, CardapioActivity.class);
        startActivity(i);
    }
}
