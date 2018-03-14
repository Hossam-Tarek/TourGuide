package com.example.hossam.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IslamicFragment extends Fragment {


    public IslamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.al_azhar, R.string.al_azhar_description,
                R.drawable.al_azhar, new Location(30.045702, 31.262669)));
        places.add(new Place(R.string.salah_citadel, R.string.salah_citadel_description,
                R.drawable.salah_el_din_citadel, new Location(30.029860, 31.261041)));
        places.add(new Place(R.string.amr_mosque, R.string.amr_mosque_description,
                R.drawable.amr_ibn_al_as, new Location(30.010094, 31.233040)));
        places.add(new Place(R.string.tulun_mosque, R.string.tulun_mosque_description,
                R.drawable.ahmed_ibn_tulun, new Location(30.028645, 31.249362)));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
