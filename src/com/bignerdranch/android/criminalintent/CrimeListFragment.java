package com.bignerdranch.android.criminalintent;

import android.support.v4.app.ListFragment;

public class CrimeListFragment extends ListFragment {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
    }

}
