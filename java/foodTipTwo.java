package edu.purdue.parvezs.boileruphealth;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class foodTipTwo extends Fragment {

    String[] foods = {"Eggs", "Almonds", "Milk", "Greek Yoghurt", "Chicken Breast", "Peanuts", "Pistachios", "Walnuts", "Oats"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.foodtwo, container, false);

        final ListView listView = (ListView)rootView.findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_multiple_choice, foods);
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
