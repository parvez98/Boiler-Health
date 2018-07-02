package edu.purdue.parvezs.boileruphealth;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class exerciseAdapter extends RecyclerView.Adapter<exerciseAdapter.ExerciseViewHolder> {

    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Exercise> exerciseList;

    //getting the context and product list with constructor
    public exerciseAdapter(Context mCtx, List<Exercise> exerciseList) {
        this.mCtx = mCtx;
        this.exerciseList = exerciseList;
    }

    @Override
    public ExerciseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_view, null);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExerciseViewHolder holder, int position) {
        //getting the exercise of the specified position
        Exercise exercise = exerciseList.get(position);

        //binding the data with the viewholder views
        holder.textViewName.setText(exercise.getName());
        holder.textViewCount.setText(exercise.getCount());
        holder.textViewBenefits.setText(String.valueOf(exercise.getBenefits()));
        holder.textViewRandom.setText(String.valueOf(exercise.getRandom()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(exercise.getImage()));

    }


    @Override
    public int getItemCount() {
        return exerciseList.size();
    }


    class ExerciseViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewCount, textViewBenefits, textViewRandom;
        ImageView imageView;

        public ExerciseViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.name);
            textViewCount = itemView.findViewById(R.id.count);
            textViewBenefits = itemView.findViewById(R.id.benefits);
            textViewRandom = itemView.findViewById(R.id.random);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
