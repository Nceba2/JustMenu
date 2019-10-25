import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.Reader;

public class ProductDataFilter implements IProductDataFilter {
    private JsonFileReader Reader;
    private JSONObject products;
    private JSONArray productSet;

    public ProductDataFilter(String file2) throws IOException, ParseException {
        Reader = new JsonFileReader();
        this.products = (JSONObject) Reader.doRead(file2).get("products");
    }

    public void setProductSet(String ProductSet)
    {
        this.productSet = (JSONArray) products.get(ProductSet);
    }
    public JSONArray getProductSet(){
        return productSet;
    }
}
