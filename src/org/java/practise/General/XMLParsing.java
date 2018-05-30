package org.java.practise.General;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XMLParsing {

	public static void main(String ags[]) throws Exception
	{
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document doc = b.parse(new File("Data.xml"));
		//Now, there are a few ways to do this, but simply, you can use the xpath API to find the nodes you want and update their content

		XPath xPath = XPathFactory.newInstance().newXPath();
		Node startDateNode = (Node) xPath.compile("/data/startdate").evaluate(doc, XPathConstants.NODE);
		startDateNode.setTextContent("29/07/2015");
		
		xPath = XPathFactory.newInstance().newXPath();
		Node endDateNode = (Node) xPath.compile("/data/enddate").evaluate(doc, XPathConstants.NODE);
		endDateNode.setTextContent("29/07/2015");
		//Then save the Document back to the file...

		Transformer tf = TransformerFactory.newInstance().newTransformer();
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		tf.setOutputProperty(OutputKeys.METHOD, "xml");
		tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

		DOMSource domSource = new DOMSource(doc);
		StreamResult sr = new StreamResult(new File("Data.xml"));
		tf.transform(domSource, sr);

	}
	
}
