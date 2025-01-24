package _13_xml._05_sax;

import _13_xml._01_training.CatModel;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    @Getter
    private List<CatModel> cats;
    private CatModel cat;
    private String tagName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("cats")) {
            cats = new ArrayList<>();
        } else if (qName.equals("cat")) {
            cat = new CatModel();
            int id = Integer.parseInt(attributes.getValue("id"));
            cat.setId(id);
        } else {
            tagName = qName;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("cat")) {
            cats.add(cat);
            cat = null;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        var value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            switch (tagName) {
                case "name" : {
                    cat.setName(value);
                    break;
                }
                case "age" : {
                    cat.setAge(Integer.parseInt(value));
                    break;
                }
                default: break;
            }
            tagName = null;
        }
    }
}
