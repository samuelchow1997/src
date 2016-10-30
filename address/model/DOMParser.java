package address.model;
import java.io.File; 
import java.io.IOException; 
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.ParserConfigurationException; 
import org.w3c.dom.Document; 
import org.w3c.dom.NodeList; 
import org.xml.sax.SAXException; 

public class DOMParser { 
  DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); 
  
  //Load and parse XML file into DOM 
  public Document parse(String filePath) { 
     Document document = null; 
     try { 
        //DOM parser instance 
        DocumentBuilder builder = builderFactory.newDocumentBuilder(); 
        //parse an XML file into a DOM tree 
        document = builder.parse(new File(filePath)); 
     } catch (ParserConfigurationException e) { 
        e.printStackTrace();  
     } catch (SAXException e) { 
        e.printStackTrace(); 
     } catch (IOException e) { 
        e.printStackTrace(); 
     } 
     return document; 
  } 
	
  public static Record[] getRecordArray() { 
        DOMParser parser = new DOMParser(); 
        Document document = parser.parse("/Users/samuel/Documents/workspace/InventoryApplication_2/src/address/model/SampleData.xml"); 
        //get root element 
        NodeList record = document.getElementsByTagName("record");
        Record [] recordArray = new Record[record.getLength()];
        for(int i = 1,j=0; j< record.getLength(); i++,j++)
        {
       	 recordArray[j] = new Record();
       	 recordArray[j].setBrand(document.getElementsByTagName("Brand").item(i).getTextContent());
       	 recordArray[j].setBuyCurrency (document.getElementsByTagName("BuyCurrency").item(i).getTextContent());
       	 recordArray[j].setBuyPrice (Double.parseDouble(document.getElementsByTagName("BuyPrice").item(i).getTextContent()));
       	 recordArray[j].setCategory (document.getElementsByTagName("Category").item(i).getTextContent());
       	 recordArray[j].setId (Integer.parseInt(document.getElementsByTagName("Id").item(i).getTextContent()));
       	 recordArray[j].setLeadTime (Integer.parseInt(document.getElementsByTagName("LeadTime").item(i).getTextContent()));
       	 recordArray[j].setMinOrderQuantity (Integer.parseInt(document.getElementsByTagName("MinOrderQuantity").item(i).getTextContent()));
       	 recordArray[j].setName (document.getElementsByTagName("Name").item(i).getTextContent());
       	 recordArray[j].setSellCurrency (document.getElementsByTagName("SellCurrency").item(i).getTextContent());
       	 recordArray[j].setSellPrice (Double.parseDouble(document.getElementsByTagName("SellPrice").item(i).getTextContent()));
       	 recordArray[j].setStockOnHand (Integer.parseInt(document.getElementsByTagName("StockOnHand").item(i).getTextContent()));
       	 recordArray[j].setStockOnOrder (Integer.parseInt(document.getElementsByTagName("StockOnOrder").item(i).getTextContent()));
       	 recordArray[j].setSubCategory (document.getElementsByTagName("SubCategory").item(i).getTextContent());
       	 recordArray[j].setSupplier (document.getElementsByTagName("Supplier").item(i).getTextContent());
       	 recordArray[j].setTargetBatchVolume (Double.parseDouble(document.getElementsByTagName("TargetBatchVolume").item(i).getTextContent()));
       	 recordArray[j].setVolume (Double.parseDouble(document.getElementsByTagName("Volume").item(i).getTextContent()));
       }
        return recordArray;
  }
}
