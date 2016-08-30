package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Day2F6Activity extends AppCompatActivity {
    RadioGroup grupKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f6);

        grupKelamin = (RadioGroup)findViewById(R.id.grupKelamin);

        ((Button)findViewById(R.id.button4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.d("LOG2", String.valueOf(grupKelamin.getCheckedRadioButtonId()));
                if(grupKelamin.getCheckedRadioButtonId() != -1) {
                    int idx = grupKelamin.getCheckedRadioButtonId();
                    RadioButton button = (RadioButton) findViewById(idx);

                    Log.d("DAY2", "Checked Value: " + button.getText());
                } else {
                    Log.d("DAY2", "Tidak ada radio button terpilih");
                }
            }
        });
    }
}
