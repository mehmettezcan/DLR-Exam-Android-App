package com.wmstudio.dlrexcom.recycler_view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.wmstudio.dlrexcom.R;

public class view_holder extends RecyclerView.ViewHolder {

    TextView true_score,false_score;

    public view_holder(@NonNull View itemView) {
        super(itemView);
        true_score = itemView.findViewById(R.id.true_score);
        false_score = itemView.findViewById(R.id.false_score);
    }
}
