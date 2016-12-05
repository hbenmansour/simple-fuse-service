package com.redhat.empowered.businessservice;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630187
 * 2016-12-05T17:12:54.526+01:00
 * Generated source version: 3.1.5.redhat-630187
 * 
 */
@WebServiceClient(name = "personSoapHttpService", 
                  wsdlLocation = "classpath:wsdl/businessService.wsdl",
                  targetNamespace = "http://www.redhat.com/empowered/businessService") 
public class PersonSoapHttpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.redhat.com/empowered/businessService", "personSoapHttpService");
    public final static QName PersonSoapHttpPort = new QName("http://www.redhat.com/empowered/businessService", "personSoapHttpPort");
    static {
        URL url = PersonSoapHttpService.class.getClassLoader().getResource("wsdl/businessService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(PersonSoapHttpService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/businessService.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public PersonSoapHttpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonSoapHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonSoapHttpService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PersonSoapHttpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonSoapHttpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonSoapHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PersonPortType
     */
    @WebEndpoint(name = "personSoapHttpPort")
    public PersonPortType getPersonSoapHttpPort() {
        return super.getPort(PersonSoapHttpPort, PersonPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonPortType
     */
    @WebEndpoint(name = "personSoapHttpPort")
    public PersonPortType getPersonSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(PersonSoapHttpPort, PersonPortType.class, features);
    }

}
