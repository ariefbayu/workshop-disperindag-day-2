package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioActivity extends AppCompatActivity {
    Button btnCek;
    RadioGroup rdgSekolah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        rdgSekolah = (RadioGroup)findViewById(R.id.rdgSekolah);

        btnCek = (Button)findViewById(R.id.btnCek);
        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioButtonID = rdgSekolah.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) rdgSekolah.findViewById(radioButtonID);

                String selectedtext = radioButton.getText().toString();
                Log.d("LOG", "Selected Text:" + selectedtext);
            }
        });
    }
}
