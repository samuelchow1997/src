package address.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Record {
	//Attributes
	private  SimpleStringProperty brand, buyCurrency, category, name, sellCurrency, subCategory, supplier;
	private SimpleIntegerProperty  id, leadTime, minOrderQuantity, stockOnHand, stockOnOrder;
	private SimpleDoubleProperty buyPrice, sellPrice, targetBatchVolume, volume;
	


	//methods getter and setter


	public void setBrand(String brand) {
		this.brand.set(brand);
	}

	public void setBuyCurrency(String buyCurrency) {
		this.buyCurrency.set(buyCurrency);
	}

	public void setCategory(String category) {
		this.category.set(category);
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public void setSellCurrency(String sellCurrency) {
		this.sellCurrency.set(sellCurrency);
	}

	public void setSubCategory(String subCategory) {
		this.subCategory.set(subCategory);
	}

	public void setSupplier(String supplier) {
		this.supplier.set(supplier);
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public void setLeadTime(int leadTime) {
		this.leadTime.set(leadTime);
	}

	public void setMinOrderQuantity(int minOrderQuantity) {
		this.minOrderQuantity.set(minOrderQuantity);
	}

	public void setStockOnHand(int stockOnHand) {
		this.stockOnHand.set(stockOnHand);
	}

	public void setStockOnOrder(int stockOnOrder) {
		this.stockOnOrder.set(stockOnOrder);
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice.set(buyPrice);
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice.set(sellPrice);
	}
	
	public void setTargetBatchVolume(double targetBatchVolume) {
		this.targetBatchVolume.set(targetBatchVolume);
	}

	public void setVolume(double volume) {
		this.volume.set(volume);
	}

	public String getBrand() {
		return brand.get();
	}

	public String getBuyCurrency() {
		return buyCurrency.get();
	}

	public String getCategory() {
		return category.get();
	}

	public String getName() {
		return name.get();
	}

	public String getSellCurrency() {
		return sellCurrency.get();
	}

	public String getSubCategory() {
		return subCategory.get();
	}

	public String getSupplier() {
		return supplier.get();
	}

	public int getId() {
		return id.get();
	}

	public int getLeadTime() {
		return leadTime.get();
	}

	public int getMinOrderQuantity() {
		return minOrderQuantity.get();
	}

	public int getStockOnHand() {
		return stockOnHand.get();
	}

	public int getStockOnOrder() {
		return stockOnOrder.get();
	}

	public double getBuyPrice() {
		double d = buyPrice.get();
		return d;
	}

	public double getSellPrice() {
		return sellPrice.get();
	}

	public double getTargetBatchVolume() {
		return targetBatchVolume.get();
	}

	public double getVolume() {
		return volume.get();
	}

}