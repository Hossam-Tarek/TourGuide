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
public class ModernFragment extends Fragment
{

    public ModernFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.cairo_tower, R.string.cairo_tower_description,
                R.drawable.cairo_tower));
        places.add(new Place(R.string.egyptian_museum, R.string.egyptian_museum_description,
                R.drawable.egyptient_museum));
        places.add(new Place(R.string.khan_el_khalili, R.string.khan_el_khalili_description,
                R.drawable.khan_el_khalili));
        places.add(new Place(R.string.abdeen_palace, R.string.abdeen_palace_description,
                R.drawable.abdeen_palace));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
