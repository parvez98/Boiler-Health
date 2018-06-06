package edu.purdue.parvezs.boileruphealth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Soha Parvez on 5/29/2018.
 */

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab1, container, false);

        ImageButton foodButton = (ImageButton)rootView.findViewById(R.id.food);
        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foodTab f = new foodTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, f);

                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton healthButton = (ImageButton)rootView.findViewById(R.id.health);
        healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                healthTab h = new healthTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, h);

                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton mentalButton = (ImageButton)rootView.findViewById(R.id.mentalHealth);
        mentalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mentalHealthTab m = new mentalHealthTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, m);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton medButton = (ImageButton)rootView.findViewById(R.id.medicine);
        medButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                medicineTab d = new medicineTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, d);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        return rootView;

    }
}
