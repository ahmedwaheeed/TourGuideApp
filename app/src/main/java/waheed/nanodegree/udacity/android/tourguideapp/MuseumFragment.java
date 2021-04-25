package waheed.nanodegree.udacity.android.tourguideapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    ArrayList<Place> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_museum,container,false);
        data = new ArrayList<>();
        //Add data to the arraylist here
        data.add(new Place(getString(R.string.Egyptian_m),getString(R.string.Egyptian_m_owner),
                getString(R.string.Egyptian_m_location),getString(R.string.Egy_time)));
        data.add(new Place(getString(R.string.Nubian_m),getString(R.string.Nubian_m_owner),
                getString(R.string.Nubian_m_location),getString(R.string.Nubian_time)));
        data.add(new Place(getString(R.string.Coptic_m),getString(R.string.coptic_m_owner),
                getString(R.string.coptic_m_location),getString(R.string.coptic_time)));
        data.add(new Place(getString(R.string.luxor_m),getString(R.string.luxor_m_owner),
                getString(R.string.luxor_m_location),getString(R.string.luxor_time)));
        data.add(new Place(getString(R.string.agri_m),getString(R.string.agri_m_owner),
                getString(R.string.agri_m_location),getString(R.string.agri_time)));

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(getActivity(),data);

        ListView listView = rootView.findViewById(R.id.listview);

        listView.setAdapter(customArrayAdapter);

        return rootView;
    }

}
