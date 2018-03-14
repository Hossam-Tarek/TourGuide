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
public class HistoricFragment extends Fragment
{


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.pyramids, R.string.pyramids_description, R.drawable.pyramids));
        places.add(new Place(R.string.abu_simble_temple, R.string.abu_simbel_description,
                R.drawable.abu_simple_temple));
        places.add(new Place(R.string.citadel_of_qaitbay, R.string.qaitbay_description,
                R.drawable.citadel_of_quaitbay));
        places.add(new Place(R.string.luxor_temple, R.string.luxor_temple_description,
                R.drawable.luxor_temple));
        places.add(new Place(R.string.philae_temple, R.string.philae_description,
                R.drawable.philae_temple));
        places.add(new Place(R.string.vally_kings, R.string.vally_kings_description,
                R.drawable.vally_of_the_kings));
        places.add(new Place(R.string.karnak_temple, R.string.karnak_temple_description,
                R.drawable.karnak_temple));
        places.add(new Place(R.string.edfu_temple, R.string.edfu_temple_description,
                R.drawable.edfu_temple));

        ListView listView = rootView.findViewById(R.id.list);

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        listView.setAdapter(adapter);

        return rootView;
    }

}
