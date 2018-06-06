package edu.purdue.parvezs.boileruphealth;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Soha Parvez on 5/30/2018.
 */

public class foodTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food, container, false);

        /*ViewPager mPager =(ViewPager) rootView.findViewById(R.id.pager);
        SlidePagerAdapter mPagerAdapter = new SlidePagerAdapter(getFragmentManager());
        mPager.setAdapter(mPagerAdapter);*/

        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction();
        /*
         * When this container fragment is created, we fill it with our first
         * "real" fragment
         */
        transaction.replace(R.id.foodLayout, new foodTipOne());

        transaction.commit();

        return rootView;
    }

    public class SlidePagerAdapter extends FragmentPagerAdapter{

        public SlidePagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position){
            if(position == 0){
                return new foodTipOne();
            }else if(position == 1){
                return new foodTipTwo();
            }
            return null;
        }

        @Override
        public int getCount(){
            return 2;
        }
    }
}
