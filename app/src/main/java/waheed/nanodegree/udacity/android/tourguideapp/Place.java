package waheed.nanodegree.udacity.android.tourguideapp;

/**
 * Created by waheed on 3/15/2018.
 */

public class Place {

    private String placeName;
    private String placeOwner;
    private String placeLocation;
    int placeImage = -1;
    String placeTime = null;

    public Place(String placeName, String placeOwner, String placeLocation, int placeImage) {
        this.placeName = placeName;
        this.placeOwner = placeOwner;
        this.placeLocation = placeLocation;
        this.placeImage = placeImage;
    }

    public Place(String placeName, String placeOwner, String placeLocation, String placeTime){
        this.placeName = placeName;
        this.placeOwner = placeOwner;
        this.placeLocation = placeLocation;
        this.placeTime = placeTime;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceOwner() {
        return placeOwner;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public String getPlaceTime() {
        return placeTime;
    }
}
