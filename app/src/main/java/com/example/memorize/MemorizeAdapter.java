package com.example.memorize;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.List;

public class MemorizeAdapter extends BaseAdapter {
    private Context context;
    private List<MemorizeItem> items;

    public MemorizeAdapter(Context context, List<MemorizeItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        MemorizeItem item = items.get(position);

        TextView textViewLanguage1 = convertView.findViewById(R.id.text_view_language1);
        TextView textViewLanguage2 = convertView.findViewById(R.id.text_view_language2);
        TextView textViewPronunciation = convertView.findViewById(R.id.text_view_pronunciation);


        textViewLanguage1.setText(item.getTextLanguage1());
        textViewLanguage2.setText(item.getTextLanguage2());
        textViewPronunciation.setText(item.getGermanPronunciation());


        return convertView;
    }
}
