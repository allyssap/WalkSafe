package app;
import java.awt.*;

/**
 * The marker subclass for hazard markers. Tells the user where the hazards are on the map in a red colour. 
 * 
 * @author Robin Resendes
 */
public class HazardMarker extends Marker{

    Hazard hazard;
    String description;
    int hazardLevel;
    Image hazardImage;

    /**
     * Returns the hazard.
     * @return the hazard
     */
    public Hazard getHazard() {
        return hazard;
    }

    /**
     * Returns the description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the hazard level.
     * @return the hazard level
     */
    public int getHazardLevel() {
        return hazardLevel;
    }

    /**
     * Sets the hazard level.
     * @param hazardLevel
     */
    public void setHazardLevel(int hazardLevel) {
        this.hazardLevel = hazardLevel;
    }

    /**
     * Returns the image for the hazard
     * @return hazard image
     */
    public Image getHazardImage() {
        return hazardImage;
    }
    
    /**
     * Constructs the hazard marker.
     * @param longitude
     * @param latitude
     */
    public HazardMarker(double longitude, double latitude){
        super(longitude, latitude);
        this.markerColor = 1; // value for red colour
    }

    /**
     * Uploads a new image to the hazard to be shown when the hazard marker is interacted with. 
     * @param path the path file to the image
     */
    public void uploadHazardImage(String path){
    }

}
