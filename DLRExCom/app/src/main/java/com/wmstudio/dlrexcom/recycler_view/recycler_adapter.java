package com.wmstudio.dlrexcom.recycler_view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wmstudio.dlrexcom.R;
import java.util.List;

public class recycler_adapter extends RecyclerView.Adapter<view_holder> {
    List<String> true_scores;
    List<String> false_scores;

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_layout,viewGroup,false);
        return new view_holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder view_holder, int i) {
        String true_score = true_scores.get(i);
        view_holder.true_score.setText(true_score);
        String false_score = false_scores.get(i);
        view_holder.false_score.setText(false_score);

    }
    public recycler_adapter(List<String> true_scores,List<String> false_scores) {
        this.true_scores = true_scores;
        this.false_scores = false_scores;
    }

    @Override
    public int getItemCount() {
        return true_scores.size();
    }
}
