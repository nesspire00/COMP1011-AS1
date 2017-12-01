package Controllers;

import Models.SmartTV;
import javafx.collections.ObservableList;

public interface ControllerInterface {

    /**
     * Forces all implementing classes to load the data, passed on from the previous view.
     * @param itemList
     */
    void preloadData(ObservableList<SmartTV> itemList);

}
