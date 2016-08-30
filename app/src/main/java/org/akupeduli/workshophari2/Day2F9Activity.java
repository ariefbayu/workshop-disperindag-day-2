package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Day2F9Activity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f9);

        spinner = (Spinner)findViewById(R.id.spinner2);

        List<CharSequence> isiSpinner = new ArrayList<>();
        isiSpinner.add("Januari");
        isiSpinner.add("Februari");
        isiSpinner.add("Maret");

        ArrayAdapter<CharSequence> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_item,
                        isiSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
