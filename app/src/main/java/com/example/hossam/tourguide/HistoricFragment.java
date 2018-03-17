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
public class HistoricFragment extends Fragment
{


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.pyramids, R.string.pyramids_description,
                R.drawable.pyramids, new Location(29.976480, 31.131302)));
        places.add(new Place(R.string.abu_simble_temple, R.string.abu_simbel_description,
                R.drawable.abu_simple_temple, new Location(22.335498658, 31.621997512)));
        places.add(new Place(R.string.citadel_of_qaitbay, R.string.qaitbay_description,
                R.drawable.citadel_of_quaitbay, new Location(31.214011, 29.8856383)));
        places.add(new Place(R.string.luxor_temple, R.string.luxor_temple_description,
                R.drawable.luxor_temple, new Location(25.6999972, 32.636830786)));
        places.add(new Place(R.string.philae_temple, R.string.philae_description,
                R.drawable.philae_temple, new Location(24.021833246, 32.883829798)));
        places.add(new Place(R.string.valley_kings, R.string.valley_kings_description,
                R.drawable.vally_of_the_kings, new Location(25.746424, 32.605309)));
        places.add(new Place(R.string.karnak_temple, R.string.karnak_temple_description,
                R.drawable.karnak_temple, new Location( 25.719595, 32.655807)));
        places.add(new Place(R.string.edfu_temple, R.string.edfu_temple_description,
                R.drawable.edfu_temple, new Location(24.97332944, 32.870663184)));

        ListView listView = rootView.findViewById(R.id.list);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
