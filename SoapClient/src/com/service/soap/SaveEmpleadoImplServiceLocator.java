/**
 * SaveEmpleadoImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service.soap;

public class SaveEmpleadoImplServiceLocator extends org.apache.axis.client.Service implements com.service.soap.SaveEmpleadoImplService {

    public SaveEmpleadoImplServiceLocator() {
    }


    public SaveEmpleadoImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaveEmpleadoImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaveEmpleadoImpl
    private java.lang.String SaveEmpleadoImpl_address = "http://localhost:8086/Soap/services/SaveEmpleadoImpl";

    public java.lang.String getSaveEmpleadoImplAddress() {
        return SaveEmpleadoImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaveEmpleadoImplWSDDServiceName = "SaveEmpleadoImpl";

    public java.lang.String getSaveEmpleadoImplWSDDServiceName() {
        return SaveEmpleadoImplWSDDServiceName;
    }

    public void setSaveEmpleadoImplWSDDServiceName(java.lang.String name) {
        SaveEmpleadoImplWSDDServiceName = name;
    }

    public com.service.soap.SaveEmpleadoImpl getSaveEmpleadoImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaveEmpleadoImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaveEmpleadoImpl(endpoint);
    }

    public com.service.soap.SaveEmpleadoImpl getSaveEmpleadoImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.service.soap.SaveEmpleadoImplSoapBindingStub _stub = new com.service.soap.SaveEmpleadoImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaveEmpleadoImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaveEmpleadoImplEndpointAddress(java.lang.String address) {
        SaveEmpleadoImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.service.soap.SaveEmpleadoImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.service.soap.SaveEmpleadoImplSoapBindingStub _stub = new com.service.soap.SaveEmpleadoImplSoapBindingStub(new java.net.URL(SaveEmpleadoImpl_address), this);
                _stub.setPortName(getSaveEmpleadoImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SaveEmpleadoImpl".equals(inputPortName)) {
            return getSaveEmpleadoImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.service.com", "SaveEmpleadoImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.service.com", "SaveEmpleadoImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaveEmpleadoImpl".equals(portName)) {
            setSaveEmpleadoImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
