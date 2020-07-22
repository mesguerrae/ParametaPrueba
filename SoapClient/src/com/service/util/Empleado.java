/**
 * Empleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.util;

public class Empleado  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.lang.String cargo;

    private java.lang.String fecha_Nacimiento;

    private java.lang.String fecha_vincula;

    private java.lang.String nombres;

    private java.lang.String numero_Documento;

    private java.lang.Double salario;

    private java.lang.String tipo_Documento;

    public Empleado() {
    }

    public Empleado(
           java.lang.String apellidos,
           java.lang.String cargo,
           java.lang.String fecha_Nacimiento,
           java.lang.String fecha_vincula,
           java.lang.String nombres,
           java.lang.String numero_Documento,
           java.lang.Double salario,
           java.lang.String tipo_Documento) {
           this.apellidos = apellidos;
           this.cargo = cargo;
           this.fecha_Nacimiento = fecha_Nacimiento;
           this.fecha_vincula = fecha_vincula;
           this.nombres = nombres;
           this.numero_Documento = numero_Documento;
           this.salario = salario;
           this.tipo_Documento = tipo_Documento;
    }


    /**
     * Gets the apellidos value for this Empleado.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this Empleado.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the cargo value for this Empleado.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this Empleado.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the fecha_Nacimiento value for this Empleado.
     * 
     * @return fecha_Nacimiento
     */
    public java.lang.String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }


    /**
     * Sets the fecha_Nacimiento value for this Empleado.
     * 
     * @param fecha_Nacimiento
     */
    public void setFecha_Nacimiento(java.lang.String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }


    /**
     * Gets the fecha_vincula value for this Empleado.
     * 
     * @return fecha_vincula
     */
    public java.lang.String getFecha_vincula() {
        return fecha_vincula;
    }


    /**
     * Sets the fecha_vincula value for this Empleado.
     * 
     * @param fecha_vincula
     */
    public void setFecha_vincula(java.lang.String fecha_vincula) {
        this.fecha_vincula = fecha_vincula;
    }


    /**
     * Gets the nombres value for this Empleado.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this Empleado.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the numero_Documento value for this Empleado.
     * 
     * @return numero_Documento
     */
    public java.lang.String getNumero_Documento() {
        return numero_Documento;
    }


    /**
     * Sets the numero_Documento value for this Empleado.
     * 
     * @param numero_Documento
     */
    public void setNumero_Documento(java.lang.String numero_Documento) {
        this.numero_Documento = numero_Documento;
    }


    /**
     * Gets the salario value for this Empleado.
     * 
     * @return salario
     */
    public java.lang.Double getSalario() {
        return salario;
    }


    /**
     * Sets the salario value for this Empleado.
     * 
     * @param salario
     */
    public void setSalario(java.lang.Double salario) {
        this.salario = salario;
    }


    /**
     * Gets the tipo_Documento value for this Empleado.
     * 
     * @return tipo_Documento
     */
    public java.lang.String getTipo_Documento() {
        return tipo_Documento;
    }


    /**
     * Sets the tipo_Documento value for this Empleado.
     * 
     * @param tipo_Documento
     */
    public void setTipo_Documento(java.lang.String tipo_Documento) {
        this.tipo_Documento = tipo_Documento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidos==null && other.getApellidos()==null) || 
             (this.apellidos!=null &&
              this.apellidos.equals(other.getApellidos()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.fecha_Nacimiento==null && other.getFecha_Nacimiento()==null) || 
             (this.fecha_Nacimiento!=null &&
              this.fecha_Nacimiento.equals(other.getFecha_Nacimiento()))) &&
            ((this.fecha_vincula==null && other.getFecha_vincula()==null) || 
             (this.fecha_vincula!=null &&
              this.fecha_vincula.equals(other.getFecha_vincula()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.numero_Documento==null && other.getNumero_Documento()==null) || 
             (this.numero_Documento!=null &&
              this.numero_Documento.equals(other.getNumero_Documento()))) &&
            ((this.salario==null && other.getSalario()==null) || 
             (this.salario!=null &&
              this.salario.equals(other.getSalario()))) &&
            ((this.tipo_Documento==null && other.getTipo_Documento()==null) || 
             (this.tipo_Documento!=null &&
              this.tipo_Documento.equals(other.getTipo_Documento())));
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
        if (getApellidos() != null) {
            _hashCode += getApellidos().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getFecha_Nacimiento() != null) {
            _hashCode += getFecha_Nacimiento().hashCode();
        }
        if (getFecha_vincula() != null) {
            _hashCode += getFecha_vincula().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getNumero_Documento() != null) {
            _hashCode += getNumero_Documento().hashCode();
        }
        if (getSalario() != null) {
            _hashCode += getSalario().hashCode();
        }
        if (getTipo_Documento() != null) {
            _hashCode += getTipo_Documento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Empleado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://util.service.com", "Empleado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_Nacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "fecha_Nacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_vincula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "fecha_vincula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_Documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "numero_Documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "salario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://util.service.com", "tipo_Documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
