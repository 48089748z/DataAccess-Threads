//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 07:02:46 PM CET 
//


package UF1AAD.ExamenUF1;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SOLAR_SYSTEMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOLAR_SYSTEMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PLANETS" type="{}PLANETSType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOLAR_SYSTEMType", propOrder = {
    "planets"
})
@XmlRootElement(name = "SOLAR_SYSTEM")
public class SOLARSYSTEMType {

    @XmlElement(name = "PLANETS", required = true)
    protected PLANETSType planets;

    /**
     * Gets the value of the planets property.
     * 
     * @return
     *     possible object is
     *     {@link PLANETSType }
     *     
     */
    public PLANETSType getPLANETS() {
        return planets;
    }

    /**
     * Sets the value of the planets property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLANETSType }
     *     
     */
    public void setPLANETS(PLANETSType value) {
        this.planets = value;
    }

}
