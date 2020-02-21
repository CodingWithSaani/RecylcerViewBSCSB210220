package com.tutorials180.recylcerviewbscsb210220.RVAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorials180.recylcerviewbscsb210220.ModelClasses.SocialMediaPostModel;
import com.tutorials180.recylcerviewbscsb210220.R;

import java.util.ArrayList;

public class OurAdapter extends RecyclerView.Adapter<OurAdapter.OurViewHolder>{

    private ArrayList<SocialMediaPostModel> objectArrayList;
    private Context context;

    public OurAdapter(ArrayList<SocialMediaPostModel> objectArrayList,
                      Context context) {
        this.objectArrayList = objectArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public OurViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View singleRow= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row,parent,false);

        OurViewHolder objectOurViewHolder=new OurViewHolder(singleRow);
        return objectOurViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OurViewHolder holder, int position) {
        SocialMediaPostModel object=objectArrayList.get(position);
        holder.contentPicIV.setImageResource(object.getPicReference());

        holder.userNameTV.setText(object.getUser());


    }

    @Override
    public int getItemCount() {
        return objectArrayList.size();
    }


    public class OurViewHolder extends RecyclerView.ViewHolder
    {

        ImageView contentPicIV;
        TextView userNameTV;

        public OurViewHolder(@NonNull View singleRow) {
            super(singleRow);
            contentPicIV=singleRow.findViewById(R.id.singleRow_contentPicIV);
            userNameTV=singleRow.findViewById(R.id.singleRow_userNameTV);
        }
    }
}
