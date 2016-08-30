package org.akupeduli.workshophari2;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.akupeduli.workshophari2.adapters.CustomSpinAdapter;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinnerCode;
    Spinner spinnerXML;
    Spinner spinnerCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerCode = (Spinner)findViewById(R.id.spinnerCode);

        List<String> data = new ArrayList<>();
        data.add("Senin");
        data.add("Selasa");
        data.add("Rabu");
        data.add("Kamis");
        data.add("Jumat");
        data.add("Sabtu");
        data.add("Minggu");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                data);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCode.setAdapter(dataAdapter);



//        spinnerXML = (Spinner) findViewById(R.id.spinnerXML);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this, R.array.contoh_isi_spinner, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerXML.setAdapter(adapter);

        TypedArray typedIsi = getResources().obtainTypedArray(R.array.isi_spinner_xml);
        CustomSpinAdapter spinAdapter = new CustomSpinAdapter(getApplicationContext(), typedIsi);
        spinnerCustom = (Spinner) findViewById(R.id.spinnerCustom);
        spinnerCustom.setAdapter(spinAdapter);
    }
}
