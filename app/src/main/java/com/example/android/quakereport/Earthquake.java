package com.example.android.quakereport;

/**
 * Created by Iwona on 04.05.2018.
 */

public class Earthquake {

    /** Magnitude volume of earthquake */
    private double mMagnitude;

    /** Location of earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website of the earthquake */
    private String mUrl;


    /**
     * Create a new Earthquake object.
     *
     * @param earthquakeMagnitude is magnitude (size) of earthquake
     * @param earthquakeLocation is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double earthquakeMagnitude, String earthquakeLocation, long timeInMilliseconds,
                      String url){
        mMagnitude = earthquakeMagnitude;
        mLocation = earthquakeLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the time of the earthquake
     */
    public long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }

    /**
     * @return URL of the earthquake
     */
    public String getmUrl() {
        return mUrl;
    }
}
