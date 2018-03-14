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
                R.drawable.the_hanging_church, new Location(30.005267, 31.230183)));
        places.add(new Place(R.string.catherine_monastery, R.string.saint_catherine_description,
                R.drawable.saint_catherine_monastery, new Location(28.555967, 33.976037)));
        places.add(new Place(R.string.wadi_el_natrun, R.string.wadi_el_natrun_description,
                R.drawable.wadi_el_natrun, new Location(30.371526, 30.269564)));
        places.add(new Place(R.string.white_monastery, R.string.wadi_el_natrun_description,
                R.drawable.white_monastery, new Location(26.534761, 31.645694)));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
