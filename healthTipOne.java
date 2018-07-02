package edu.purdue.parvezs.boileruphealth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class healthTipOne extends Fragment {

    List<Exercise> exerciseList;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.healthone, container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        exerciseList = new ArrayList<>();

        exerciseList.add(
                new Exercise(
                        1,
                        "Squats",
                        10,
                        "Tones thighs",
                        0.0,
                        R.drawable.dairy
                ));

        /*exerciseList.add(
                new Exercise(
                        2,
                        "Lunges",
                        20,
                        "Tones stomach",
                        0.0,
                        R.drawable.dairy
                ));

        exerciseList.add(
                new Exercise(
                        3,
                        "Wall Sit",
                        1,
                        "Spinal Cord",
                        0.0,
                        R.drawable.dairy
                ));*/

        exerciseAdapter adapter = new exerciseAdapter(getContext(), exerciseList);

        recyclerView.setAdapter(adapter);
        
        return rootView;

    }

}
