package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Day2F3Activity extends AppCompatActivity {
    Button btn;
    CheckBox chk1, chk2, chk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f3);
        chk1 = (CheckBox)findViewById(R.id.checkBox4);
        chk2 = (CheckBox)findViewById(R.id.checkBox5);
        chk3 = (CheckBox)findViewById(R.id.checkBox6);

        btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chk1.setChecked(true);
                chk2.setClickable(false);
                chk3.setChecked(true);

                String nilai = "";
                if(chk1.isChecked()){
                    nilai = "checked";
                } else {
                    nilai = "not checked";
                }

                Log.d("DAY2", "Nilai: " + nilai);

                Log.d("DAY2", chk1.isChecked() ? "checked" : "not checked");
            }
        });
    }
}
