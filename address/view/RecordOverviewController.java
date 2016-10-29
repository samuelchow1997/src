package address.view;

import address.model.DOMParser;
import address.model.Record;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class RecordOverviewController {
	@FXML private TableView<Record> table;
    @FXML private TableColumn<Record, Number> idColumn;
    @FXML private TableColumn<Record, String> nameColumn;
    @FXML private TableColumn<Record, String> categoryColumn;
    @FXML private TableColumn<Record, String> subCategoryColumn;
    @FXML private TableColumn<Record, String> brandColumn;
    @FXML private TableColumn<Record, String> supplierColumn;
    @FXML private TableColumn<Record, Number> minOrderQuantityColumn;
    @FXML private TableColumn<Record, Number> targetBatchVolumeColumn;
    @FXML private TableColumn<Record, Number> volumeColumn;
    @FXML private TableColumn<Record, Number> sellPriceColumn;
    @FXML private TableColumn<Record, String> sellCurrencyColumn;
    @FXML private TableColumn<Record, Number> buyPriceColumn;
    @FXML private TableColumn<Record, String> buyCurrencyColumn;
    @FXML private TableColumn<Record, Number> stockOnHandColumn;
    @FXML private TableColumn<Record, Number> stockOnOrderColumn;
    @FXML private TableColumn<Record, Number> leadTimeColumn;

	public ObservableList<Record> getRecord()
	{
		DOMParser dom = new DOMParser();
		Record [] record = dom.getRecordArray();
		ObservableList<Record> records = FXCollections.observableArrayList();
		//for(int i=0;i<record.length;i++)
		{
		records.add(record[0]);
		}
		return records;
	}
	
	public void initialize(){
        idColumn.setCellValueFactory(cellData -> cellData.getValue().getId());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());
        categoryColumn.setCellValueFactory(cellData -> cellData.getValue().getCategory());
        subCategoryColumn.setCellValueFactory(cellData -> cellData.getValue().getSubCategory());
        supplierColumn.setCellValueFactory(cellData -> cellData.getValue().getSupplier());
        minOrderQuantityColumn.setCellValueFactory(cellData -> cellData.getValue().getMinOrderQuantity());
        targetBatchVolumeColumn.setCellValueFactory(cellData -> cellData.getValue().getTargetBatchVolume());
        volumeColumn.setCellValueFactory(cellData -> cellData.getValue().getVolume());
        sellPriceColumn.setCellValueFactory(cellData -> cellData.getValue().getSellPrice());
        sellCurrencyColumn.setCellValueFactory(cellData -> cellData.getValue().getSellCurrency());
        buyPriceColumn.setCellValueFactory(cellData -> cellData.getValue().getBuyPrice());
        buyCurrencyColumn.setCellValueFactory(cellData -> cellData.getValue().getBuyCurrency());
        stockOnHandColumn.setCellValueFactory(cellData -> cellData.getValue().getStockOnHand());
        stockOnOrderColumn.setCellValueFactory(cellData -> cellData.getValue().getStockOnOrder());
        leadTimeColumn.setCellValueFactory(cellData -> cellData.getValue().getLeadTime());
        table.setItems(getRecord());
	}
}
