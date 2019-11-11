package Model;

import org.json.simple.JSONArray;

public interface IProductModel {

    void setProductSet(String file2);

    JSONArray getProductSet(String products);

    String getProduct(String attribute, String productset, int id);
}
