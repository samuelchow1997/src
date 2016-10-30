package address.view;

import java.net.URL;
import java.util.ResourceBundle;
import address.model.DOMParser;
import address.model.Record;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class RecordOverviewController implements Initializable {
	@FXML private TableView<Record> table;
    @FXML private TableColumn<Record, Integer> idColumn;
    @FXML private TableColumn<Record, String> nameColumn;
    @FXML private TableColumn<Record, String> categoryColumn;
    @FXML private TableColumn<Record, String> subCategoryColumn;
    @FXML private TableColumn<Record, String> brandColumn;
    @FXML private TableColumn<Record, String> supplierColumn;
    @FXML private TableColumn<Record, Integer> minOrderQuantityColumn;
    @FXML private TableColumn<Record, Double> targetBatchVolumeColumn;
    @FXML private TableColumn<Record, Double> volumeColumn;
    @FXML private TableColumn<Record, Double> sellPriceColumn;
    @FXML private TableColumn<Record, String> sellCurrencyColumn;
    @FXML private TableColumn<Record, Double> buyPriceColumn;
    @FXML private TableColumn<Record, String> buyCurrencyColumn;
    @FXML private TableColumn<Record, Integer> stockOnHandColumn;
    @FXML private TableColumn<Record, Integer> stockOnOrderColumn;
    @FXML private TableColumn<Record, Integer> leadTimeColumn;
    
    public ObservableList<Record> getRecord(){
    
    	Record [] recordArray = DOMParser.getRecordArray();

	    ObservableList<Record> data = FXCollections.observableArrayList();
	    for(int i=0;i<recordArray.length;i++)
	    {
	    	data.add(recordArray[i]);
	    }
	    return data;
    }
	
	public void initialize(URL location, ResourceBundle resources) {
        idColumn.setCellValueFactory(new PropertyValueFactory<Record, Integer>("idColumn"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("nameColumn"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("categoryColumn"));
        subCategoryColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("subCategoryColumn"));
        supplierColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("supplierColumn"));
        minOrderQuantityColumn.setCellValueFactory(new PropertyValueFactory<Record, Integer>("minOrderQuantityColumn"));
        targetBatchVolumeColumn.setCellValueFactory(new PropertyValueFactory<Record, Double>("targetBatchVolumeColumn"));
        volumeColumn.setCellValueFactory(new PropertyValueFactory<Record, Double>("volumeColumn"));
        sellPriceColumn.setCellValueFactory(new PropertyValueFactory<Record, Double>("sellPriceColumn"));
        sellCurrencyColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("sellCurrencyColumn"));
        buyPriceColumn.setCellValueFactory(new PropertyValueFactory<Record, Double>("buyPriceColumn"));
        buyCurrencyColumn.setCellValueFactory(new PropertyValueFactory<Record, String>("buyCurrencyColumn"));
        stockOnHandColumn.setCellValueFactory(new PropertyValueFactory<Record, Integer>("stockOnHandColumn"));
        stockOnOrderColumn.setCellValueFactory(new PropertyValueFactory<Record, Integer>("stockOnOrderColumn"));
        leadTimeColumn.setCellValueFactory(new PropertyValueFactory<Record, Integer>("leadTimeColumn"));
        table.setItems(getRecord());
	}

}
