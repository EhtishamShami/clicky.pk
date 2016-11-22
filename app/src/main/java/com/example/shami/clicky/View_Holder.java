package com.example.shami.clicky;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.support.v7.widget.CardView;


/**
 * Created by Shami on 11/14/2016.
 */
public class View_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    ImageView imageView;

    View_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        title = (TextView) itemView.findViewById(R.id.title);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}