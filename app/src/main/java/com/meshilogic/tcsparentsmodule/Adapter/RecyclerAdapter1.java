package com.meshilogic.tcsparentsmodule.Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.meshilogic.tcsparentsmodule.R;

import java.util.List;

public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.ViewHolder> {

    private List<LauncherActivity.ListItem> listItems;
    private Context context;

    public RecyclerAdapter1(List<LauncherActivity.ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);
                return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LauncherActivity.ListItem listItem = listItems.get(position);

        holder.siblingName.setText(listItem.getSiblingName());
        holder.siblingName.setText(listItem.);
        }

    @Override
    public int getItemCount() {
        return listItems.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView siblingPhoto;
        public TextView siblingName;

        public ViewHolder(View itemView) {
            super(itemView);
            siblingPhoto = (ImageView) itemView.findViewById(R.id.siblingPhoto);
            siblingName = (TextView) itemView.findViewById(R.id.tvsiblingName);
        }
    }

}
