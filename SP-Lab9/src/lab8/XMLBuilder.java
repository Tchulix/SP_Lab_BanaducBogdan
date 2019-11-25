package lab8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.annotation.*;

public class XMLBuilder implements Builder {
	private String filename;
	private Element document = null;
	public XMLBuilder(String filename) {
		this.filename = filename;
	}
	
	public Element getResult() {
		return document;
	}
	
	public void build() {
		try {
			ObjectMapper mapper = new XmlMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),HashMap.class);
			document = processMap(map);
			} catch (JsonParseException e) {
			e.printStackTrace();
			} catch (JsonMappingException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	private Element processMap(HashMap<String, Object> map) {
		String className = map.get("class").toString();
		Element element = null;
		if (className.equals("Section")) {
			element = buildSection(map);
		}
		else if (className.equals("Paragraph")) {
			element = buildParagraph(map);
		}
		else if (className.equals("Image")) {
			element = buildImage(map);
		}
		else if (className.equals("ImageProxy")) {
			element = buildImageProxy(map);
		}
		else if (className.equals("Table")) {
			element = buildTable(map);
		}
		return element;
	}

	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("title"));
		LinkedHashMap<String, Object> children = (LinkedHashMap)map.get("children");
		for (Map.Entry<String, Object> entry : children.entrySet()) {
			HashMap<String, Object> exmap = new HashMap<String, Object>();
			exmap.put(entry.getKey(), entry.getValue());
			Element e = this.processMap(exmap);
			if (e != null) {
				try {
				section.add(e);
				} catch (Exception var5) {
				var5.printStackTrace();
				}	
		}
			
	}
		return section;
	}
	public Element buildParagraph(HashMap<String, Object> map) {
		Element paragraph = new Paragraph((String)map.get("text"));
		return paragraph;
		
	}
	public Element buildImage(HashMap<String, Object> map) {
		Element image = new Image((String)map.get("url"));
		return image;
		
	}
	public Element buildImageProxy(HashMap<String, Object> map) {
		Element imageProxy = new ImageProxy((String)map.get("url"));
		return imageProxy;
		
	}
	public Element buildTable(HashMap<String, Object> map) {
		Element table = new Table((String)map.get("url"));
		return table;
	}
}
