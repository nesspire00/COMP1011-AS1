package Models;

import javafx.scene.image.Image;

public class SmartTV extends Television {
    private String operatingSystem, smartFeatures;

    /**
     * A constructor for SmartTV object, with inherited properties from super class and 2 of its own
     * @param storePrice
     * @param screenSize
     * @param modelNo
     * @param resolution
     * @param brand
     * @param features
     * @param panelType
     * @param operatingSystem
     * @param smartFeatures
     */
    public SmartTV(double storePrice, int screenSize, String modelNo, String resolution, String brand, String features, Television.panelType panelType, String operatingSystem, String smartFeatures) {
        super(storePrice, screenSize, modelNo, resolution, brand, features, panelType);
        this.operatingSystem = operatingSystem;
        this.smartFeatures = smartFeatures;
    }

    /**
     * Constructor for SmartTV object with an image.
     * @param storePrice
     * @param screenSize
     * @param modelNo
     * @param resolution
     * @param brand
     * @param features
     * @param panelType
     * @param operatingSystem
     * @param smartFeatures
     * @param image
     */
    public SmartTV(double storePrice, int screenSize, String modelNo, String resolution, String brand, String features, Television.panelType panelType, String operatingSystem, String smartFeatures, Image image) {
        super(storePrice, screenSize, modelNo, resolution, brand, features, panelType, image);
        this.operatingSystem = operatingSystem;
        this.smartFeatures = smartFeatures;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Checks that the OS is not empty.
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        if(!operatingSystem.equals("")){
            this.operatingSystem = operatingSystem;
        }
        else{
            throw new IllegalArgumentException("Operating system cannot be empty");
        }
    }

    public String getSmartFeatures() {
        return smartFeatures;
    }

    public void setSmartFeatures(String smartFeatures) {
        this.smartFeatures = smartFeatures;
    }
}
