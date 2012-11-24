import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


public class Scratch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        try{
	        DocumentBuilder builder = factory.newDocumentBuilder();
	        File input = new File("testXML.txt");
	        InputSource is = new InputSource(new BufferedReader(new FileReader(input)));
	        Document doc = builder.parse(is);
	        NodeList NPS = doc.getElementsByTagName("NP");
	        for(int x = 0; x < NPS.getLength(); x++)
			{
				System.out.println(NPS.item(x).getTextContent());
			}
	        }
	        catch(Exception e)
	        {
	        	
	        	e.printStackTrace();
	        }

	}

}
