package Models;

import javafx.scene.image.Image;

public class Television {
    private double storePrice;
    private int screenSize;
    private String modelNo, resolution, brand, features;
    private panelType panelType;
    private Image tvImage;

    public enum panelType{
        CRT, OLED, PLASMA, LCD, LED, AMOLED;
    }

    /**
     * Default constructor for Television object without an image.
     * @param storePrice
     * @param screenSize
     * @param modelNo
     * @param resolution
     * @param brand
     * @param features
     * @param panelType
     */
    public Television(double storePrice, int screenSize, String modelNo, String resolution, String brand, String features, panelType panelType) {
        setStorePrice(storePrice);
        setScreenSize(screenSize);
        setModelNo(modelNo);
        setResolution(resolution);
        setBrand(brand);
        setFeatures(features);
        setPanelType(panelType);
    }

    /**
     * Alternative constructor for Television object that can store an image.
     * @param storePrice
     * @param screenSize
     * @param modelNo
     * @param resolution
     * @param brand
     * @param features
     * @param panelType
     * @param tvImage
     */
    public Television(double storePrice, int screenSize, String modelNo, String resolution, String brand, String features, panelType panelType, Image tvImage) {
        setStorePrice(storePrice);
        setScreenSize(screenSize);
        setModelNo(modelNo);
        setResolution(resolution);
        setBrand(brand);
        setFeatures(features);
        setPanelType(panelType);
        this.tvImage = tvImage;
    }

    public double getStorePrice() {
        return storePrice;
    }

    /**
     * Checks that the price is not negative or 0
     * @param storePrice
     */
    public void setStorePrice(double storePrice) {
        if(storePrice > 0){
            this.storePrice = storePrice;
        }
        else{
            throw new IllegalArgumentException("The store price cannot be negative or 0");
        }

    }

    public int getScreenSize() {
        return screenSize;
    }

    /**
     * Checks if entered screen size is in range of 15-80"
     * @param screenSize
     */
    public void setScreenSize(int screenSize) {
        if(screenSize >= 15 && screenSize <= 80){
            this.screenSize = screenSize;
        }
        else{
            throw new IllegalArgumentException("The screen size has to be in rage of 15 - 80");
        }
    }

    public String getModelNo() {
        return modelNo;
    }

    /**
     * Checks that the modelNumber is not empty
     * @param modelNo
     */
    public void setModelNo(String modelNo) {
        if(!modelNo.equals("")){
            this.modelNo = modelNo;
        }
        else{
            throw new IllegalArgumentException("The model number cannot be empty");
        }
    }

    public String getResolution() {
        return resolution;
    }

    /**
     * Checks that the resolution is not empty.
     * @param resolution
     */
    public void setResolution(String resolution) {
        if(!resolution.equals("")){
            this.resolution = resolution;
        }
        else{
            throw new IllegalArgumentException("The resolution cannot be empty");
        }
    }

    public String getBrand() {
        return brand;
    }

    /**
     * Checks that the brand is not empty.
     * @param brand
     */
    public void setBrand(String brand) {
        if(!brand.equals("")){
            this.brand = brand;
        }
        else{
            throw new IllegalArgumentException("The brand cannot be empty");
        }
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public Television.panelType getPanelType() {
        return panelType;
    }

    public void setPanelType(Television.panelType panelType) {
        this.panelType = panelType;
    }

    public Image getTvImage() {
        return tvImage;
    }

    public void setTvImage(Image tvImage) {
        this.tvImage = tvImage;
    }
}
