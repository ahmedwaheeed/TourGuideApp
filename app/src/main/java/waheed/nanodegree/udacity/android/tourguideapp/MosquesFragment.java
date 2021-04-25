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


public class MosquesFragment extends Fragment {

    public MosquesFragment() {
        // Required empty public constructor
    }

    ArrayList<Place> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mosques,container,false);

        data = new ArrayList<>();
        //Add data to the arraylist here
        data.add(new Place(getString(R.string.mohamedali_mo),getString(R.string.mohamedali_m_owner),
                getString(R.string.mohamedali_mo_location),getString(R.string.mohamedali_mo_time)));
        data.add(new Place(getString(R.string.tulun_mo),getString(R.string.tulun_mo_owner),
                getString(R.string.tulun_mo_location),getString(R.string.tulun_mo_time)));
        data.add(new Place(getString(R.string.azhar_mo),getString(R.string.azhar_mo_owner),
                getString(R.string.azhar_mo_location),getString(R.string.azhar_mo_time)));
        data.add(new Place(getString(R.string.aqsun_mo),getString(R.string.aqsun_mo_owner),
                getString(R.string.aqsun_mo_location),getString(R.string.aqsun_mo_time)));

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(getActivity(),data);

        ListView listView = rootView.findViewById(R.id.listview);

        listView.setAdapter(customArrayAdapter);

        return rootView;
    }


}
