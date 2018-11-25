package com.morning.solya_0hvv578.password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> passw = new ArrayList<>();
    ArrayList<String> namee = new ArrayList<>();

    String log = null;
    String pas = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passw.add("1234");
        namee.add("name");
        Intent intent = getIntent();
        log = intent.getStringExtra("login");
        pas = intent.getStringExtra("password");
        if (log != null && pas != null) {
            EditText name = findViewById(R.id.editText);
            EditText pass = findViewById(R.id.editText2);
            name.setText(log);
            pass.setText(pas);
        }
    }

    public void onClick(View view) {
        EditText name = findViewById(R.id.editText);
        EditText pass = findViewById(R.id.editText2);
        TextView text = findViewById(R.id.textView);
        if (namee.indexOf(name.getText().toString()) > -1 && passw.indexOf(pass.getText().toString()) > -1) {
            text.setTextColor(getResources().getColor(R.color.green));
            text.setText("Верно");
            name.setText("");
            pass.setText("");
        } else {
            Intent intent = new Intent(MainActivity.this, Regist.class);
            startActivity(intent);
        }
    }
}
