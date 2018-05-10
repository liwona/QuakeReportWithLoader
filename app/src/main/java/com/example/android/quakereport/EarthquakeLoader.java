package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Loads a list of earthquakes by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.v("In onStartLoading","before forceLoad is called");
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Earthquake> loadInBackground() {
//        if (urls.length < 1 || urls[0] == null) {
//            return null;
//        }
        if (mUrl == null) {
            Log.v("In loadInBackground","in the loop");
            return null;
        }
        Log.v("In loadInBackground","before data are fetched");
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        Log.v("In loadInBackground","after data are fetched");
        return earthquakes;
    }
}
