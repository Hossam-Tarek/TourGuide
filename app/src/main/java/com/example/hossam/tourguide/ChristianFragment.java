package com.example.hossam.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChristianFragment extends Fragment {


    public ChristianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.hanging_church, R.string.hanging_church_description,
                R.drawable.the_hanging_church));
        places.add(new Place(R.string.catherine_monastery, R.string.saint_catherine_description,
                R.drawable.saint_catherine_monastery));
        places.add(new Place(R.string.wadi_el_natrun, R.string.wadi_el_natrun_description,
                R.drawable.wadi_el_natrun));
        places.add(new Place(R.string.white_monastery, R.string.wadi_el_natrun_description,
                R.drawable.white_monastery));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
