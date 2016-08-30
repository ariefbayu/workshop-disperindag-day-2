package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Day2F7Activity extends AppCompatActivity {
    RadioGroup groupWisata;
    RadioButton buttonPantai;
    RadioButton buttonMataAir;
    LinearLayout layoutMataAir;
    LinearLayout layoutPantai;
    TextView textHasil;
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f7);

        textHasil = (TextView)findViewById(R.id.textHasil);

        layoutMataAir = (LinearLayout)findViewById(R.id.layoutMataAir);
        layoutPantai = (LinearLayout)findViewById(R.id.layoutPantai);

        buttonMataAir = (RadioButton)findViewById(R.id.radioMataAir);
        buttonPantai = (RadioButton)findViewById(R.id.radioPantai);

        groupWisata = (RadioGroup)findViewById(R.id.checkWisata);
        groupWisata.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(radioGroup.getCheckedRadioButtonId() == buttonPantai.getId()){
                    layoutPantai.setVisibility(View.VISIBLE);
                    layoutMataAir.setVisibility(View.GONE);
                }
                if(radioGroup.getCheckedRadioButtonId() == buttonMataAir.getId()){
                    layoutMataAir.setVisibility(View.VISIBLE);
                    layoutPantai.setVisibility(View.GONE);
                }
            }
        });

        btnSimpan = (Button)findViewById(R.id.button5);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(groupWisata.getCheckedRadioButtonId() == buttonPantai.getId()){
                    String nilai = "Anda memilih <b>wisata pantai</b> dengan tujuan: <i>";
                    CheckBox cp1 = (CheckBox)findViewById(R.id.checkPGoaCina);
                    CheckBox cp2 = (CheckBox)findViewById(R.id.checkPSempu);
                    CheckBox cp3 = (CheckBox)findViewById(R.id.checkPSendangBiru);

                    if(cp1.isChecked()){
                        nilai += "Goa Cina, ";
                    }
                    if(cp2.isChecked()){
                        nilai += "Sempu, ";
                    }
                    if(cp3.isChecked()){
                        nilai += "Sendang Biru, ";
                    }
                    textHasil.setText(Html.fromHtml(nilai + "</i>"));
                }
                if(groupWisata.getCheckedRadioButtonId() == buttonMataAir.getId()){
                    String nilai = "Anda memilih <b>wisata mata air</b> dengan tujuan: <i>";
                    CheckBox cp1 = (CheckBox)findViewById(R.id.checkSMaron);
                    CheckBox cp2 = (CheckBox)findViewById(R.id.checkSSirah);
                    CheckBox cp3 = (CheckBox)findViewById(R.id.checkSPitu);

                    if(cp1.isChecked()){
                        nilai += "Sumber Maron, ";
                    }
                    if(cp2.isChecked()){
                        nilai += "Sumber Sirah, ";
                    }
                    if(cp3.isChecked()){
                        nilai += "Sumber Pitu, ";
                    }
                    textHasil.setText(Html.fromHtml(nilai + "</i>"));
                }
            }
        });
    }
}
