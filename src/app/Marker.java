package app;

/**
 * Super class for any markers that would be visible on the map for users
 * 
 * @author Robin Resendes
 */
public class Marker {

    protected double longitude;
    protected double latitude;
    protected int markerColor;

    /**
     * Returns the longitude.
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Returns the latitude.
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the marker color.
     * @return the marker color
     */
    public int getMarkerColor() {
        return markerColor;
    }

    /**
     * Constructs the marker. Used only by subclasses.
     * @param longitude
     * @param latitude
     */
    protected Marker(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Updates the size of the marker based on certain conditions. 
     */
    public void updateMarkerSize(){
    }
    
}
