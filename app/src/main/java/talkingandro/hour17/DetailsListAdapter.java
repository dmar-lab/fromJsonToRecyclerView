package talkingandro.hour17;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

//import talkingandro.hour17.DetailsListPojo;
//import talkingandro.hour17.Detail;

public class DetailsListAdapter extends RecyclerView.Adapter<DetailsListAdapter.MyViewHolder> {

    private List<Detail> dataSet;
    Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView age;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.name = itemView.findViewById(R.id.name);
            this.age = itemView.findViewById(R.id.age);
        }
    }

    public DetailsListAdapter(List<Detail> data, Context context) {
        this.dataSet = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_details_row, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        holder.name.setText(dataSet.get(listPosition).getName());
        holder.age.setText(String.valueOf(dataSet.get(listPosition).getAge()));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
