package viewers;

import java.util.LinkedList;

import hazards.Hazard;
/**
 * Powers the view that the user will be seeing inside of the actual application
 * 
 * @author Robin Resendes
 */
public class MapView implements Runnable{

    private double longitude;
    private double latitude;
    private double zoomLevel;

    private LinkedList<Hazard> hazards;

    /**
     * Returns the longitude.
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude.
     * @param longitude
     */
    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    /**
     * Returns the latitude.
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude.
     * @param latitude
     */
    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    /**
     * Returns the zoom level.
     * @return the zoom level
     */
    public double getZoomLevel() {
        return zoomLevel;
    }

    /**
     * Sets the zoom level.
     * @param zoomLevel the zoom level
     */
    public void setZoomLevel(double zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    /**
     * Constructs the MapView class.
     * @param hazards
     */
    public MapView(LinkedList<Hazard> hazards){
        this.longitude = 42.3149;
        this.latitude = 83.0364;
        this.zoomLevel = 100;

        this.hazards = hazards;

        
    }
    

    /**
     * Executes when the MapView thead is started.
     */
    @Override
    public void run() {
    }

    /** 
     * Starts the thread.
    */
    public void start(){
    }

    /**
     * Runs to whatever the tickspeed is set to.
     * Handles where the map is looking at, all markers on it, as well changing the zoom level.
     */
    private void mapTick(){
    } 

    /**
     * Adds a hazard marker to the map view.
     * @param hazard The hazard to be added.
     */
    public void addHazardMarker(Hazard hazard){
    }

    /**
     * Removes a hazard marker from the map view.
     * @param hazard The hazard to be removed.
     */
    public void removeHazardMarker(Hazard hazard){
    }

    /**
     * Renders the map at a different zoom level. Can be zoomed in and out. 
     * @param degree The degree in which the map is zoomed in or out. 
     */
    public void zoom(double degree){
    }
    
}
