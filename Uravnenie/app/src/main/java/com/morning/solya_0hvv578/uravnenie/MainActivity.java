package com.morning.solya_0hvv578.uravnenie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Вызывается при нажатии пользователем на кнопку Решить */
    public void solveEquation(View view) {
        // ax+b=c
        try {
            double a = Double.parseDouble(((EditText)
                    findViewById(R.id.editText12)).getText().toString());
            double b = Double.parseDouble(((EditText)
                    findViewById(R.id.editText13)).getText().toString());
            double c = Double.parseDouble(((EditText)
                    findViewById(R.id.editText14)).getText().toString());
            TextView result = (TextView) findViewById(R.id.textView18);

            double d = Math.sqrt(b * b - 4 * a * c);

            result.setText("x1 = " + String.valueOf((-b + d) / 2 * a) + "\n" +
                    "x2 = " + String.valueOf((-b - d) / 2 * a));
        } catch (Exception e) {
            TextView result = (TextView) findViewById(R.id.textView18);
            result.setText("нет корней");
        }
    }
}
