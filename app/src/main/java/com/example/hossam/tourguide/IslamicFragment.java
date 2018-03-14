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
                R.drawable.al_azhar));
        places.add(new Place(R.string.salah_citadel, R.string.salah_citadel_description,
                R.drawable.salah_el_din_citadel));
        places.add(new Place(R.string.amr_mosque, R.string.amr_mosque_description,
                R.drawable.amr_ibn_al_as));
        places.add(new Place(R.string.tulun_mosque, R.string.tulun_mosque_description,
                R.drawable.ahmed_ibn_tulun));

        ListView listView = rootView.findViewById(R.id.list);

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        listView.setAdapter(adapter);

        return rootView;
    }

}
