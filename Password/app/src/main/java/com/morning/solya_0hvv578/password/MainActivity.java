package com.morning.solya_0hvv578.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> passw = new ArrayList<>();
    ArrayList<String> namee = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        passw.add("1234");
        namee.add("name");
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
            text.setTextColor(getResources().getColor(R.color.red));
            text.setText("Вы ошиблись в логине или пароле");
        }
    }
}
