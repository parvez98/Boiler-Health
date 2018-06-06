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

public class Tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);

        ImageButton menButton = (ImageButton)rootView.findViewById(R.id.men);
        menButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                menTab m = new menTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, m);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton womenButton = (ImageButton)rootView.findViewById(R.id.women);
        womenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                womenTab w = new womenTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, w);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton precautionsButton = (ImageButton)rootView.findViewById(R.id.precaution);
        precautionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                precautionsTab p = new precautionsTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, p);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        ImageButton helpButton = (ImageButton)rootView.findViewById(R.id.localHelp);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                localHelpTab l = new localHelpTab();

                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                transaction.replace(R.id.main_content, l);


                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        return rootView;
    }
}
