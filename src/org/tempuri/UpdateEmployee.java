/**
 * UpdateEmployee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateEmployee  implements java.io.Serializable {
    private java.lang.String sosnr;

    private java.lang.String name;

    private java.lang.String adress;

    private java.lang.String lastname;

    private java.lang.String worktitle;

    public UpdateEmployee() {
    }

    public UpdateEmployee(
           java.lang.String sosnr,
           java.lang.String name,
           java.lang.String adress,
           java.lang.String lastname,
           java.lang.String worktitle) {
           this.sosnr = sosnr;
           this.name = name;
           this.adress = adress;
           this.lastname = lastname;
           this.worktitle = worktitle;
    }


    /**
     * Gets the sosnr value for this UpdateEmployee.
     * 
     * @return sosnr
     */
    public java.lang.String getSosnr() {
        return sosnr;
    }


    /**
     * Sets the sosnr value for this UpdateEmployee.
     * 
     * @param sosnr
     */
    public void setSosnr(java.lang.String sosnr) {
        this.sosnr = sosnr;
    }


    /**
     * Gets the name value for this UpdateEmployee.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UpdateEmployee.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the adress value for this UpdateEmployee.
     * 
     * @return adress
     */
    public java.lang.String getAdress() {
        return adress;
    }


    /**
     * Sets the adress value for this UpdateEmployee.
     * 
     * @param adress
     */
    public void setAdress(java.lang.String adress) {
        this.adress = adress;
    }


    /**
     * Gets the lastname value for this UpdateEmployee.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this UpdateEmployee.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the worktitle value for this UpdateEmployee.
     * 
     * @return worktitle
     */
    public java.lang.String getWorktitle() {
        return worktitle;
    }


    /**
     * Sets the worktitle value for this UpdateEmployee.
     * 
     * @param worktitle
     */
    public void setWorktitle(java.lang.String worktitle) {
        this.worktitle = worktitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateEmployee)) return false;
        UpdateEmployee other = (UpdateEmployee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sosnr==null && other.getSosnr()==null) || 
             (this.sosnr!=null &&
              this.sosnr.equals(other.getSosnr()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.adress==null && other.getAdress()==null) || 
             (this.adress!=null &&
              this.adress.equals(other.getAdress()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.worktitle==null && other.getWorktitle()==null) || 
             (this.worktitle!=null &&
              this.worktitle.equals(other.getWorktitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSosnr() != null) {
            _hashCode += getSosnr().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAdress() != null) {
            _hashCode += getAdress().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getWorktitle() != null) {
            _hashCode += getWorktitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateEmployee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateEmployee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sosnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sosnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "adress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("worktitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "worktitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
