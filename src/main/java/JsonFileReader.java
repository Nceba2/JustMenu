import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {

    public JSONObject doRead(String File) throws IOException, ParseException {
            FileReader reader = new FileReader(File);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            return jsonObject;
    }
}