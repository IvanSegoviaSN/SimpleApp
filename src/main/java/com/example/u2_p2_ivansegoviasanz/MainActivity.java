package com.example.u2_p2_ivansegoviasanz;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber, editTextNumber2, editTextNumber3;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);

        textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextNumber.getText().equals("") || editTextNumber2.getText().equals("") || editTextNumber3.getText().equals(""))
                    return;

                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int num3 = Integer.parseInt(editTextNumber3.getText().toString());

                textView.setText(Integer.toString((num1 * num2) / num3));
            }
        });
    }
}