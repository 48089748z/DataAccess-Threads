//
// This file was UF1AAD.CarrersBarcelonaJAXB by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.27 at 04:22:15 PM CET 
//


package UF1AAD.CarrersBarcelonaJAXB;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * UF1AAD.CarrersBarcelonaJAXB in the UF1AAD.CarrersBarcelonaJAXB package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory
{
    //xjc File.xsd     Comanda para hacer en el terminal en la carpeta donde este el xsd y asi generar los .class o .java

    private final static QName _ROWSET_QNAME = new QName("", "ROWSET");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: UF1AAD.CarrersBarcelonaJAXB
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ROWSETType }
     * 
     */
    public ROWSETType createROWSETType() {
        return new ROWSETType();
    }

    /**
     * Create an instance of {@link ROWType }
     * 
     */
    public ROWType createROWType() {
        return new ROWType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ROWSETType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ROWSET")
    public JAXBElement<ROWSETType> createROWSET(ROWSETType value) {
        return new JAXBElement<ROWSETType>(_ROWSET_QNAME, ROWSETType.class, null, value);
    }

}
