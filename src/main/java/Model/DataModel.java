package Model;

import org.json.simple.JSONObject;

public class DataModel implements IDataModel {
    private JsonFileReader Reader;
    private JSONObject productSet;

    public DataModel()
    {
        Reader = new JsonFileReader();
    }

    public void setDataSet(String file2)
    {
        try {
            this.productSet = (JSONObject) Reader.doRead(file2).get("products");
        }catch (Exception e){
            this.productSet = null;
        }
    }
    public JSONObject getDataSet(){
        return productSet;
    }
}
