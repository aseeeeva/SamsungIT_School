package com.morning.solya_0hvv578.password;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

public class Regist extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
    }

    public void reg(View view) {
        EditText name = findViewById(R.id.editText3);
        EditText pass = findViewById(R.id.editText4);

        Intent intent = new Intent(Regist.this, MainActivity.class);
        intent.putExtra("password", pass.getText().toString());
        intent.putExtra("login", name.getText().toString());
        startActivity(intent);
    }
}
