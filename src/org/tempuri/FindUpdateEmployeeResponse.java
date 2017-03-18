/**
 * FindUpdateEmployeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FindUpdateEmployeeResponse  implements java.io.Serializable {
    private org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult findUpdateEmployeeResult;

    public FindUpdateEmployeeResponse() {
    }

    public FindUpdateEmployeeResponse(
           org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult findUpdateEmployeeResult) {
           this.findUpdateEmployeeResult = findUpdateEmployeeResult;
    }


    /**
     * Gets the findUpdateEmployeeResult value for this FindUpdateEmployeeResponse.
     * 
     * @return findUpdateEmployeeResult
     */
    public org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult getFindUpdateEmployeeResult() {
        return findUpdateEmployeeResult;
    }


    /**
     * Sets the findUpdateEmployeeResult value for this FindUpdateEmployeeResponse.
     * 
     * @param findUpdateEmployeeResult
     */
    public void setFindUpdateEmployeeResult(org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult findUpdateEmployeeResult) {
        this.findUpdateEmployeeResult = findUpdateEmployeeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindUpdateEmployeeResponse)) return false;
        FindUpdateEmployeeResponse other = (FindUpdateEmployeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findUpdateEmployeeResult==null && other.getFindUpdateEmployeeResult()==null) || 
             (this.findUpdateEmployeeResult!=null &&
              this.findUpdateEmployeeResult.equals(other.getFindUpdateEmployeeResult())));
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
        if (getFindUpdateEmployeeResult() != null) {
            _hashCode += getFindUpdateEmployeeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindUpdateEmployeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">FindUpdateEmployeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findUpdateEmployeeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FindUpdateEmployeeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>FindUpdateEmployeeResponse>FindUpdateEmployeeResult"));
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
