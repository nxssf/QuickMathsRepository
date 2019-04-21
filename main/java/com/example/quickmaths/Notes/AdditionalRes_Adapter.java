package com.example.quickmaths.Notes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.quickmaths.R;

import java.util.ArrayList;

public class AdditionalRes_Adapter extends RecyclerView.Adapter<AdditionalRes_Adapter.Resource_ViewHolder> {
    private RecyclerViewListener mListener;
    private ArrayList<Resources> mResource;


    //Constructor
    public AdditionalRes_Adapter(ArrayList<Resources> rs, RecyclerViewListener r){
        mResource = rs;
        mListener = r;
    }
    //Create interface that passes message from adapter to Activity
    //Interface listens to the click
    public interface RecyclerViewListener {
        void onClick(View v,int position);
    }

    //View holder class implement/create instance of onClickListener
    //Assign setOnClickListener to activity (schedule view)
    //Override onClick method
    //When the user clicks the view, the onClick method of OnClickListener is called
    //Send message back to Activity/Fragment
    public static class Resource_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name;
        public TextView topic;
        private RecyclerViewListener mListen;

        public Resource_ViewHolder (View v, RecyclerViewListener r){
            super(v);
            mListen = r;

            v.setOnClickListener(this);

            name = v.findViewById(R.id.name);
            topic = v.findViewById(R.id.topic);

        }

        @Override
        public void onClick(View v){mListen.onClick(v,getAdapterPosition());}
    }

    //Create a new view
    @Override
    public AdditionalRes_Adapter.Resource_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.resource_box,parent,false);
        return new Resource_ViewHolder(v,mListener);
    }

    //Replace contents of a view
    @Override
    public void onBindViewHolder(Resource_ViewHolder s, int position){
        Resources rs = mResource.get(position);
        s.name.setText(rs.getName());
        s.topic.setText(rs.getTopic());

    }

    @Override
    public int getItemCount(){
        return mResource.size();
    }

}
