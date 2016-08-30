package org.akupeduli.workshophari2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Day2F4Activity extends AppCompatActivity {
    CheckBox chkMerah, chkKuning, chkHijau;
    Button btnCek;
    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f4);

        chkMerah = (CheckBox)findViewById(R.id.chkMerah);
        chkKuning = (CheckBox)findViewById(R.id.chkKuning);
        chkHijau = (CheckBox)findViewById(R.id.chkHijau);

        btnCek = (Button)findViewById(R.id.btnCek);
        txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasil = "<b>Warna Terpilih:</b><i>";
                if(chkMerah.isChecked()){
                    hasil += "merah, ";
                }
                if(chkKuning.isChecked()){
                    hasil += "kuning, ";
                }
                if(chkHijau.isChecked()){
                    hasil += "hijau, ";
                }
                hasil += "</i>";
                txtDisplay.setText(Html.fromHtml(hasil));
            }
        });

    }

}
