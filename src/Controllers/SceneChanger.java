package Controllers;

import Models.SmartTV;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    /**
     * Changes scene to the requested FXML file.
     * @param event
     * @param viewName name of the view
     * @param title title of the new window
     * @throws IOException
     */
    public void changeScene(ActionEvent event, String viewName, String title) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Changes the scene to the passed in FXML file, but also handles data sent between scenes.
     * @param event
     * @param viewName name of FXML file
     * @param title title of the new window
     * @param itemList data, passed in between views
     * @param controllerInterface instance of new view controller
     * @throws IOException
     */
    public void changeScene(ActionEvent event, String viewName, String title, ObservableList<SmartTV> itemList, ControllerInterface controllerInterface) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(viewName));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        controllerInterface = loader.getController();
        controllerInterface.preloadData(itemList);

        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
