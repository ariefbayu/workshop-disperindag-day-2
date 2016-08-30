package org.akupeduli.workshophari2.paketadapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.annotation.IntegerRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.akupeduli.workshophari2.R;

import java.util.List;

/**
 * Created by ariefbayu on 8/30/16.
 */

public class SpinGambarAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<Integer> listGambar;
    private TypedArray isiGambar;

    public SpinGambarAdapter(Context context, List<Integer> listGambar, TypedArray isiGambar){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.listGambar = listGambar;
        this.isiGambar = isiGambar;
    }
    @Override
    public int getCount() {
        return this.listGambar.size();
    }

    @Override
    public Object getItem(int i) {
        return this.isiGambar.getString(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int posisi, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.layout_gambar, null);
        ImageView gambar = (ImageView) view.findViewById(R.id.gambar);
        gambar.setImageResource(listGambar.get(posisi));
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(isiGambar.getString(posisi));
        return view;
    }
}
