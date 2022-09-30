package com.nidhallourimi.servlet;

public class CatalogItem {
    private String name;
    private String manufacturer;
    private String sku;

    public CatalogItem(String name, String manufacturer, String sku) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.sku = sku;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

}
