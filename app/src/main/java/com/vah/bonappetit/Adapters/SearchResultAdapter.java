package com.vah.bonappetit.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.vah.bonappetit.Listeners.CustomOnClickListener;
import com.vah.bonappetit.Models.RandomRecipe;
import com.vah.bonappetit.Models.Result;
import com.vah.bonappetit.R;

import java.util.List;

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultViewHolder> {
    Context context;
    List<Result> list;
    CustomOnClickListener listener;

    public SearchResultAdapter(Context context, List<Result> list, CustomOnClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SearchResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchResultViewHolder(LayoutInflater.from(context).inflate(R.layout.list_result, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchResultViewHolder holder, int position) {
        holder.textView_title.setText(list.get(position).title);
        holder.textView_title.setSelected(true);
        Picasso.get().load(list.get(position).getImage()).into(holder.imageView_food);
        holder.home_list_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(String.valueOf(list.get(holder.getAdapterPosition()).getId()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class SearchResultViewHolder extends RecyclerView.ViewHolder {

    TextView textView_title;
    ImageView imageView_food;
    CardView home_list_container;

    public SearchResultViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_title = itemView.findViewById(R.id.textView_title);
        imageView_food = itemView.findViewById(R.id.imageView_food);
        home_list_container = itemView.findViewById(R.id.home_list_container);
    }
}
