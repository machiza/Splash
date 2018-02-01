package mz.co.malambe.splash;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by secreto on 1/27/18.
 */

public class ListMusicAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_music,parent,false);

        return new ListMusicAdapter.ListeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListMusicAdapter.ListeViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.titulo.length;
    }
    private class ListeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtTitulo,txtCantor,txtDuracao;
        public ListeViewHolder(View itemView){
            super(itemView);
            txtCantor = (TextView)itemView.findViewById(R.id.txtCantor);
            txtTitulo = (TextView)itemView.findViewById(R.id.txtTitulo);
            txtDuracao = (TextView)itemView.findViewById(R.id.txtDuracao);
            itemView.setOnClickListener(this);

        }
        public void bindView(int position) {
            txtCantor.setText(OurData.cantor[position]);
            txtTitulo.setText(OurData.titulo[position]);
            txtDuracao.setText(OurData.duracao[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
