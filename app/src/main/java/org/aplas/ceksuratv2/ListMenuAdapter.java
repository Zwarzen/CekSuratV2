package org.aplas.ceksuratv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ListViewHolder>{
    private ArrayList<Menu> listMenu;

    public ListMenuAdapter(ArrayList<Menu> list){
        this.listMenu = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_menu, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Menu menu = listMenu.get(position);
        Glide.with(holder.itemView.getContext())
                .load(menu.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(menu.getName());

    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_menu);
            tvName = itemview.findViewById(R.id.tv_item_name);
        }
    }
}
