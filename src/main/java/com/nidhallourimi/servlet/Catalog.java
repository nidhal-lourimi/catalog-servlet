package com.nidhallourimi.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    private static Map<String, CatalogItem> catalogItems = new HashMap();

    public Catalog() {
    }

    public static void addItem(CatalogItem CatalogItem) {
        catalogItems.put(CatalogItem.getSku(), CatalogItem);
    }

    public static CatalogItem getItem(String sku) {
        return (CatalogItem)catalogItems.get("sku");
    }

    public static List<CatalogItem> getItems() {
        return new ArrayList(catalogItems.values());
    }


}
