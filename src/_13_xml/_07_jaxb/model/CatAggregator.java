package _13_xml._07_jaxb.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@XmlRootElement(name = "cats")
@XmlAccessorType(XmlAccessType.FIELD)
public class CatAggregator {
    @Getter
    @Setter
    @XmlElement(name = "cat")
    private List<CatJaxb> cats;
}
