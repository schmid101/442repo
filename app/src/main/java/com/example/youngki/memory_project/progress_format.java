package com.example.youngki.memory_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class progress_format extends ArrayAdapter<progress_column> {

    private LayoutInflater mInflater;
    private ArrayList<progress_column> scores;
    private int mViewResourceId;

    public progress_format(Context context, int textViewResourceId, ArrayList<progress_column> curscor) {
        super(context, textViewResourceId, curscor);
        this.scores = curscor;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        progress_column current = scores.get(position);

        if (scores != null) {
            TextView firstName = (TextView) convertView.findViewById(R.id.textLtr);
            TextView lastName = (TextView) convertView.findViewById(R.id.textNum);
            TextView favFood = (TextView) convertView.findViewById(R.id.textAcc);
            TextView streak = (TextView) convertView.findViewById(R.id.textStreak);
            if (firstName != null) {
                firstName.setText(current.getFirstName());
            }
            if (lastName != null) {
                lastName.setText((current.getLastName()));
            }
            if (favFood != null) {
                favFood.setText((current.getFavFood()));
            }
            if (streak != null) {
                streak.setText((current.getStreak()));
            }
        }

        return convertView;
    }
}
