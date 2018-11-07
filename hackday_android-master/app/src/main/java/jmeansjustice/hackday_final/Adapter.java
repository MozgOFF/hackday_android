package jmeansjustice.hackday_final;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Users> users;

    Adapter(List<Users> users){ this.users = users;}

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_card_name);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View  v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_card, viewGroup
                , false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Users currentUser = users.get(i);
        viewHolder.name.setText(currentUser.getmName());
    }

    @Override
    public int getItemCount() {return users.size();}
}
