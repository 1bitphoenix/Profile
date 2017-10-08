package com.example.rituka.profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rituka on 7/10/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    public static final String TAG="Adapter";

    Context context;
    ArrayList<User> users;
   // View imageview;

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }



    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li=
                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=li.inflate(R.layout.list_card_view,parent,false);

        Log.d(TAG, "onCreateViewHolder: ");

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.UserViewHolder holder, int position) {
        holder.tvName.setText(users.get(position).getName());
        holder.tvBranch.setText(users.get(position).getBranch());
//        holder.rootview.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
        Picasso.with(context).load("R.drawable.imagename").into(holder.ivDp);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{

        ImageView ivDp;
        TextView tvName,tvBranch;
        View rootview;

        public UserViewHolder(View itemView) {
            super(itemView);
            this.ivDp = ivDp;
            this.tvName = tvName;
            this.tvBranch = tvBranch;
            rootview=itemView;
        }
    }
}
