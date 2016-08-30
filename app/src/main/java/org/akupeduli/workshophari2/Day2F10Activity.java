package org.akupeduli.workshophari2;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import org.akupeduli.workshophari2.paketadapter.SpinGambarAdapter;

import java.util.ArrayList;
import java.util.List;

public class Day2F10Activity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f10);

        spinner = (Spinner)findViewById(R.id.spinner3);

        List<Integer> listGambar = new ArrayList<>();
        listGambar.add(R.drawable.g1);
        listGambar.add(R.drawable.g2);
        listGambar.add(R.drawable.g3);

        TypedArray isiGambar = getResources().obtainTypedArray(R.array.definisi_gambar);
        SpinGambarAdapter adapter = new SpinGambarAdapter(this, listGambar, isiGambar);
        spinner.setAdapter(adapter);


    }
}
