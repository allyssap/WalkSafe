package app;

/**
 * The marker subclass for the user marker. Shows the user their position and orientation relative to what is around them.
 */
public class UserMarker extends Marker{
    private double orientation;

    /**
     * Returns the orientation.
     * @return the orientation
     */
    public double getOrientation() {
        return orientation;
    }


    /**
     * Constructs the user marker.
     * @param longitude
     * @param latitude
     * @param orientation
     */
    public UserMarker(double longitude, double latitude, double orientation){
        super(longitude, latitude);
        this.orientation = orientation;
    }

    /**
     * Updates the location of the user marker. Mostly to be used in a map tick.
     * @param latitude
     * @param longitude
     */
    public void updateLocation(double latitude, double longitude){
    }

    /**
     * Updates the orientation of the user marker. Mostly to be used in a map tick.
     * @param angle
     */
    public void updateOrientation(double angle){
    }
}
