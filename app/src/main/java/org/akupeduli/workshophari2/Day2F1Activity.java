package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Day2F1Activity extends AppCompatActivity {
    Button tombol;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f1);

        text1 = (TextView)findViewById(R.id.textView1);
        text2 = (TextView)findViewById(R.id.textView2);

        tombol = (Button)findViewById(R.id.tombolCek);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LOGD1", "Text: " + text1.getText().toString());

                text2.setText("Ini baru dari baris kedua");
            }
        });
    }
}
