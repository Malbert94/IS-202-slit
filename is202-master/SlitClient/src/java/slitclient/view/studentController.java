package slitclient.view;
import Data.ModulData;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.persistence.Column;
import slitclient.manager.ModulManager;


public class studentController implements Initializable{
    
    @FXML
    private TableView<ModulData> forsideTableView;
    
    @FXML
    private TableColumn<ModulData, String> columnModul;
            
    @FXML
    private TableColumn<ModulData, String> columnFrist;
    
    @FXML 
    private TableColumn<ModulData, String> columnInnhold;
    
    public ObservableList<ModulData> modulData;
 

    @Override
    public void initialize(URL u, ResourceBundle b) {
        ModulManager mmanager = new ModulManager();
        
        columnModul.setCellValueFactory(new PropertyValueFactory<ModulData, String> ("modul_nummer"));
        columnFrist.setCellValueFactory(new PropertyValueFactory<ModulData, String> ("frist"));
        columnInnhold.setCellValueFactory(new PropertyValueFactory<ModulData, String> ("innhold"));
                 
        this.modulData = FXCollections.observableArrayList();
        
        this.modulData.addAll(mmanager.getModuler());
        
        this.forsideTableView.setItems(modulData);
        
        
        
        
        
    }
   
   
    
   
    }


