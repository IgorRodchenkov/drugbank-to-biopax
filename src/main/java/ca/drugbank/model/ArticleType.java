//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.06 at 04:04:57 PM EST 
//


package ca.drugbank.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for article-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="article-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pubmed-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "article-type", propOrder = {
    "pubmedId",
    "citation"
})
public class ArticleType {

    @XmlElement(name = "pubmed-id", required = true)
    protected String pubmedId;
    @XmlElement(required = true)
    protected String citation;

    /**
     * Gets the value of the pubmedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubmedId() {
        return pubmedId;
    }

    /**
     * Sets the value of the pubmedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubmedId(String value) {
        this.pubmedId = value;
    }

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitation() {
        return citation;
    }

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitation(String value) {
        this.citation = value;
    }

}