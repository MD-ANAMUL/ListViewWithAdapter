package com.example.listviewwithadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterForListView extends BaseAdapter {

    Context contextAd;
    int[] items_images;
    String[] items_list;

    public AdapterForListView(Context contextAd, int[] items_images, String[] items_list) {
        this.contextAd = contextAd;
        this.items_images = items_images;
        this.items_list = items_list;
    }


    public AdapterForListView() {
//        empty constructor
    }

    @Override
    public int getCount() {
        return items_list.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) contextAd.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_items_sample_designe, viewGroup, false);

        }

        ImageView itemImageView = convertView.findViewById(R.id.sample_image_view);
        itemImageView.setImageResource(items_images[i]);
        TextView itemTextView = convertView.findViewById(R.id.sample_txt_view);
        itemTextView.setText(items_list[i]);

        return convertView;
    }
}
