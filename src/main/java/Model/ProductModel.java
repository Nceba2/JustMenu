package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ProductModel implements IProductModel {
    DataModel dataModel;

    private String products;
    private JSONArray productsArry;
    private JSONObject product;

    public ProductModel(){
        dataModel = new DataModel();
    }

    @Override
    public void setProductSet(String file) {
            dataModel.setDataSet(file);
            this.product = dataModel.getDataSet();
    }

    @Override
    public JSONArray getProductSet(String products) {
        try{
            return (JSONArray) product.get(products);
        }catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getProduct(String attribute, String productset, int id) {
        //method must return name or price, or any of the product's columns

       JSONObject _product;
        try{
            switch (productset) {
                case "k":
                    products = "kota";
                    productsArry = (JSONArray) product.get(products);
                    _product = (JSONObject) productsArry.get(id);
                    return String.valueOf(_product.get(attribute));
                case "d":
                    products = "drinks";
                    productsArry = (JSONArray) product.get(products);
                    _product = (JSONObject) productsArry.get(id);
                    return String.valueOf(_product.get(attribute));
                case "o":
                    products = "others";
                    productsArry = (JSONArray) product.get(products);
                    _product = (JSONObject) productsArry.get(id);
                    return String.valueOf(_product.get(attribute));
                default:
                    return null;
            }

        }catch (Exception e)
        {
            return null;
        }
    }
}
