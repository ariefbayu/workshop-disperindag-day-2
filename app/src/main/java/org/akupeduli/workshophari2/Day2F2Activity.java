package org.akupeduli.workshophari2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Day2F2Activity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2_f2);

        text = (TextView)findViewById(R.id.textView3);
        text.setText(
                Html.fromHtml("Text <i>isi</i> dari <b>program</b>")
        );
    }
}
