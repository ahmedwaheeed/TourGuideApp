package waheed.nanodegree.udacity.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SClubsFragment extends Fragment {

    public SClubsFragment() {
        // Required empty public constructor
    }

    ArrayList<Place> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sclubs,container,false);

        data = new ArrayList<>();
        //Add data to the arraylist here
        data.add(new Place(getString(R.string.AlAhly),getString(R.string.ahly_owner),getString(R.string.ahly_location),R.drawable.ahly));
        data.add(new Place(getString(R.string.ElZamalek),getString(R.string.zmalek_owner),getString(R.string.zamalek_location),R.drawable.zamalek));
        data.add(new Place(getString(R.string.almasry),getString(R.string.almasry_owner),getString(R.string.almasry_location),R.drawable.masry));
        data.add(new Place(getString(R.string.ismaily),getString(R.string.isamily_owner),getString(R.string.ismaily_locaton),R.drawable.ismaily));
        data.add(new Place(getString(R.string.smouha),getString(R.string.smouha_owner),getString(R.string.smouha_location),R.drawable.smouha));
        data.add(new Place(getString(R.string.degla),getString(R.string.degla_owner),getString(R.string.degla_location),R.drawable.degla));

        CustomArrayAdapter customArrayAdapter = new CustomArrayAdapter(getActivity(),data);

        ListView listView = rootView.findViewById(R.id.listview);

        listView.setAdapter(customArrayAdapter);

        return rootView;
    }

}
