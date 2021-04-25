package waheed.nanodegree.udacity.android.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by waheed on 3/15/2018.
 */

public class CustomArrayAdapter extends ArrayAdapter<Place> {
    public CustomArrayAdapter( Context context,  List<Place> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place place = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.placeName);
        assert place != null;
        placeName.setText(place.getPlaceName());

        TextView placeOwner = (TextView) listItemView.findViewById(R.id.placeOwner);
        placeOwner.setText(place.getPlaceOwner());

        TextView placeLocation = (TextView) listItemView.findViewById(R.id.placeLocation);
        placeLocation.setText(place.getPlaceLocation());

        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.placeImage);

        if(place.placeImage != -1) {
            placeImage.setImageResource(place.getPlaceImage());
        }else{
            placeImage.setVisibility(View.GONE);
        }

        TextView placeTime = (TextView) listItemView.findViewById(R.id.placeTimeOut);

        if(place.placeTime != null){
            placeTime.setText(place.getPlaceTime());
        }else{
            placeTime.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
