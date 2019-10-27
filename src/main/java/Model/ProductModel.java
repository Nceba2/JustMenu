package Model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class ProductModel implements IProductModel {
    DataModel dataModel;

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
}
