package com.m16yusuf.diappaja10118370.controler;

//Nama : Muhammad Yusuf
//Kelas : IF-9
//NIM : 10118370
//tanggal : Selasa, 10 Agustus 2021
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.m16yusuf.diappaja10118370.R;
import com.m16yusuf.diappaja10118370.model.MainModel;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
        holder.jdl.setText(model.getTitle());
        holder.des.setText(model.getDescription());
        holder.alam.setText(model.getAddress());
        holder.lati.setText(model.getLatitude());
        holder.longtu.setText(model.getLongitude());

        Glide.with(holder.gmbr.getContext())
                .load(model.getUrl())
                .placeholder(R.drawable.common_google_signin_btn_icon_dark)
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.gmbr);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        ImageView gmbr;
        TextView jdl,des,alam,lati,longtu;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            gmbr = (ImageView)itemView.findViewById(R.id.gambar1);
            jdl = (TextView)itemView.findViewById(R.id.judul);
            des = (TextView)itemView.findViewById(R.id.deskripsi);
            alam = (TextView)itemView.findViewById(R.id.alamat);
            lati = (TextView)itemView.findViewById(R.id.latitudeOncard);
            longtu = (TextView)itemView.findViewById(R.id.longitudeOncard);

        }
    }

}
