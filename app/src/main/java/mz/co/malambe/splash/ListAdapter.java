package mz.co.malambe.splash;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by secreto on 1/19/18.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,parent,false);

        return new ListeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       ((ListeViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.titulo.length;
    }
    private class ListeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtTitulo,txtCantor;
        public ListeViewHolder(View itemView){
            super(itemView);
            txtCantor = (TextView)itemView.findViewById(R.id.txtCantor);
            txtTitulo = (TextView)itemView.findViewById(R.id.txtTitulo);
            itemView.setOnClickListener(this);

        }
        public void bindView(int position) {
          txtCantor.setText(OurData.cantor[position]);
          txtTitulo.setText(OurData.titulo[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }

}
