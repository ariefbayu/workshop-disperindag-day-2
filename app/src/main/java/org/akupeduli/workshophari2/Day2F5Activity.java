package org.akupeduli.workshophari2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Day2F5Activity extends AppCompatActivity {
    EditText editText5, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f5);

        editText5 = (EditText)findViewById(R.id.editText5);
        editText3 = (EditText)findViewById(R.id.editText3);
        ((Button)findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LOG", "clicked");
                Toast.makeText(getApplicationContext(),
                        "Isi edit5: " + editText5.getText().toString(),
                        Toast.LENGTH_LONG).show();

                editText3.setText(editText5.getText());
                editText5.setText("asf124");
            }
        });
    }
}
