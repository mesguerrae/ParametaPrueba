package com.service.soap;

public class SaveEmpleadoImplProxy implements com.service.soap.SaveEmpleadoImpl {
  private String _endpoint = null;
  private com.service.soap.SaveEmpleadoImpl saveEmpleadoImpl = null;
  
  public SaveEmpleadoImplProxy() {
    _initSaveEmpleadoImplProxy();
  }
  
  public SaveEmpleadoImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaveEmpleadoImplProxy();
  }
  
  private void _initSaveEmpleadoImplProxy() {
    try {
      saveEmpleadoImpl = (new com.service.soap.SaveEmpleadoImplServiceLocator()).getSaveEmpleadoImpl();
      if (saveEmpleadoImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saveEmpleadoImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saveEmpleadoImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saveEmpleadoImpl != null)
      ((javax.xml.rpc.Stub)saveEmpleadoImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.soap.SaveEmpleadoImpl getSaveEmpleadoImpl() {
    if (saveEmpleadoImpl == null)
      _initSaveEmpleadoImplProxy();
    return saveEmpleadoImpl;
  }
  
  public boolean addEmpleado(com.service.util.Empleado p) throws java.rmi.RemoteException{
    if (saveEmpleadoImpl == null)
      _initSaveEmpleadoImplProxy();
    return saveEmpleadoImpl.addEmpleado(p);
  }
  
  
}