package address.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Record {
	//Attributes
	private StringProperty brand, buyCurrency, category, name, sellCurrency, subCategory, supplier;
	private IntegerProperty  id, leadTime, minOrderQuantity, stockOnHand, stockOnOrder;
	private DoubleProperty buyPrice, sellPrice, targetBatchVolume, volume;
	
	//methods getter and setter
	public final void setId(int id) {
		this.id.set(id);
	}
	public IntegerProperty getId() {
		return id;
	}
	public final void setLeadTime(int leadTime) {
		this.leadTime.set(leadTime);
	}
	public IntegerProperty getLeadTime() {
		return leadTime;
	}
	public final void setMinOrderQuantity(int minOrderQuantity) {
		this.minOrderQuantity.set(minOrderQuantity);
	}
	public IntegerProperty getMinOrderQuantity() {
		return minOrderQuantity;
	}
	public final void setStockOnHand(int stockOnHand) {
		this.stockOnHand.set(stockOnHand);
	}
	public IntegerProperty getStockOnHand() {
		return stockOnHand;
	}
	public final void setStockOnOrder(int stockOnOrder) {
		this.stockOnOrder.set(stockOnOrder);
	}
	public IntegerProperty getStockOnOrder() {
		return stockOnOrder;
	}
	public final void setBuyPrice(double buyPrice) {
		this.buyPrice.set(buyPrice);
	}
	public DoubleProperty getBuyPrice() {
		return buyPrice;
	}
	public final void setSellPrice(double sellPrice) {
		this.sellPrice.set(sellPrice);
	}
	public DoubleProperty getSellPrice() {
		return sellPrice;
	}
	public final void setTargetBatchVolume(double targetBatchVolume) {
		this.targetBatchVolume.set(targetBatchVolume);
	}
	public DoubleProperty getTargetBatchVolume() {
		return targetBatchVolume;
	}
	public final void setVolume(double volume) {
		this.volume.set(volume);
	}
	public DoubleProperty getVolume() {
		return volume;
	}
	public final void setBrand(String brand) {
		this.brand.set(brand);
	}
	public StringProperty getBrand() {
		return brand;
	}
	public final void setBuyCurrency(String buyCurrency) {
		this.buyCurrency.set(buyCurrency);
	}
	public StringProperty getBuyCurrency() {
		return buyCurrency;
	}
	public final void setCategory(String category) {
		this.category.set(category);
	}
	public StringProperty getCategory() {
		return category;
	}
	public final void setName(String name) {
		this.name.set(name);
	}
	public StringProperty getName() {
		return name;
	}
	public final void setSellCurrency(String sellCurrency) {
		this.sellCurrency.set(sellCurrency);
	}
	public StringProperty getSellCurrency() {
		return sellCurrency;
	}
	public final void setSubCategory(String subCategory) {
		this.subCategory.set(subCategory);
	}
	public StringProperty getSubCategory() {
		return subCategory;
	}
	public final void setSupplier(String supplier) {
		this.supplier.set(supplier);
	}
	public StringProperty getSupplier() {
		return supplier;
	}
}