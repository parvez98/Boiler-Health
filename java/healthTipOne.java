package edu.purdue.parvezs.boileruphealth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class healthTipOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.healthone, container, false);

        ImageButton imageButton = (ImageButton)rootView.findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager()
                        .beginTransaction();

                transaction.replace(R.id.healthone, new healthTipTwo());
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                //transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return rootView;

    }

}
