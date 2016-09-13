package com.neighborly.swapnilpatil.neighborly;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private List<Categories> categoryList;

    public CategoryAdapter(List<Categories> categoryList) {
        this.categoryList = categoryList;
    }


    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder categoryViewHolder, int i) {
        Categories ci = categoryList.get(i);
        categoryViewHolder.vName.setText(ci.name);

        //categoryViewHolder.vSurname.setText(ci.surname);
        //categoryViewHolder.vEmail.setText(ci.email);
        //categoryViewHolder.vTitle.setText(ci.name + " " + ci.surname);
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.cards, viewGroup, false);

        return new CategoryViewHolder(itemView);
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        protected TextView vName;
        protected RelativeLayout relativeLayout;
        protected CardView cardView;
        //protected TextView vSurname;
        //protected TextView vEmail;
        //protected TextView vTitle;

        public CategoryViewHolder(View v) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.txtName);
            cardView = (CardView) v.findViewById(R.id.card_view);
            //relativeLayout = (RelativeLayout) v.findViewById(R.id.cardList);
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(v.getContext(),UserActivity.class);
                    v.getContext().startActivity(intent);
                }
            });
            //vSurname = (TextView)  v.findViewById(R.id.txtSurname);
            //vEmail = (TextView)  v.findViewById(R.id.txtEmail);
            //vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}