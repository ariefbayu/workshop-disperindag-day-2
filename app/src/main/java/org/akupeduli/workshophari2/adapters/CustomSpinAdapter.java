package org.akupeduli.workshophari2.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.akupeduli.workshophari2.R;

/**
 * Created by ariefbayu on 8/30/16.
 */

public class CustomSpinAdapter extends BaseAdapter {
    TypedArray penampungArray;
    Context context;
    LayoutInflater inflater;
    public CustomSpinAdapter(Context context, TypedArray aiSpinner){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.penampungArray = aiSpinner;
    }
    @Override
    public int getCount() {
        return penampungArray.length();
    }

    @Override
    public String getItem(int i) {
        return penampungArray.getString(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.spinner_custom_layout, null);
        TextView label = (TextView) view.findViewById(R.id.txtLabel);
        label.setText(getItem(i).toUpperCase());
        return view;
    }
}
