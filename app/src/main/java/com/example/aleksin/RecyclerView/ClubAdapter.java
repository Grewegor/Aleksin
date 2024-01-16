package com.example.aleksin.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;

import java.util.List;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ClubViewHolder> {

    Context context;
    List<Club> clubList;
    OnClickShowListener mOnClickShowListener;

    public ClubAdapter(Context context, List<Club> clubList, OnClickShowListener onClickShowListener) {
        this.context = context;
        this.clubList = clubList;
        this.mOnClickShowListener = onClickShowListener;
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_club, parent, false);
        return new ClubViewHolder(view, mOnClickShowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder holder, int position) {
        String name = clubList.get(position).getName();
        int logo = clubList.get(position).getLogo();

        holder.tvClubname.setText(name);
        holder.imgClubLogo.setImageResource(logo);
    }

    @Override
    public int getItemCount() {
        return clubList.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvClubname;
        ImageView imgClubLogo;
        OnClickShowListener onClickShowListener;
        public ClubViewHolder(@NonNull View itemView, OnClickShowListener onClickShowListener) {
            super(itemView);
            tvClubname = itemView.findViewById(R.id.club_name);
            imgClubLogo = itemView.findViewById(R.id.club_logo);
            this.onClickShowListener = onClickShowListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClickShowListener.onClickShowListener(getAdapterPosition());
        }
    }

    public interface OnClickShowListener {
        void onClickShowListener(int position);
    }
}
