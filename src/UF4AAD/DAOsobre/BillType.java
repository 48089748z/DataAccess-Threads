//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 07:37:37 PM CEST 
//


package UF4AAD.DAOsobre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nif_client" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price_each" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price_total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billType", propOrder = {
    "nifClient",
    "idProduct",
    "priceEach",
    "priceTotal",
    "iva"
})
public class BillType {

    @XmlElement(name = "nif_client", required = true)
    protected String nifClient;
    @XmlElement(name = "id_product", required = true)
    protected String idProduct;
    @XmlElement(name = "price_each", required = true)
    protected String priceEach;
    @XmlElement(name = "price_total", required = true)
    protected String priceTotal;
    @XmlElement(required = true)
    protected String iva;

    /**
     * Gets the value of the nifClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNifClient() {
        return nifClient;
    }

    /**
     * Sets the value of the nifClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNifClient(String value) {
        this.nifClient = value;
    }

    /**
     * Gets the value of the idProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProduct() {
        return idProduct;
    }

    /**
     * Sets the value of the idProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProduct(String value) {
        this.idProduct = value;
    }

    /**
     * Gets the value of the priceEach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceEach() {
        return priceEach;
    }

    /**
     * Sets the value of the priceEach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceEach(String value) {
        this.priceEach = value;
    }

    /**
     * Gets the value of the priceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTotal() {
        return priceTotal;
    }

    /**
     * Sets the value of the priceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTotal(String value) {
        this.priceTotal = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIva() {
        return iva;
    }

    /**
     * Sets the value of the iva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIva(String value) {
        this.iva = value;
    }

}