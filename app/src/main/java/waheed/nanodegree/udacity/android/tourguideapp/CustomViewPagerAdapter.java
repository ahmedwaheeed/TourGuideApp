package waheed.nanodegree.udacity.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by waheed on 3/15/2018.
 */

public class CustomViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext ;
    public CustomViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new MuseumFragment();
        }else if(position == 1){
            return new ClubsFragment();
        }else if(position == 2){
            return new MosquesFragment();
        }else{
            return new SClubsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.Museums);
        }else if (position == 1){
            return mContext.getString(R.string.Clubs);
        }else if (position == 2){
            return mContext.getString(R.string.Mosques);
        }else {
            return mContext.getString(R.string.Resorts);
        }
    }
}
