
package servidor;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;
import servlets.ConfigListener;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.0 Generated
 * source version: 3.0
 * 
 */
@WebServiceClient(name = "PublicadorUsuarioService", targetNamespace = "http://servidor/")
public class PublicadorUsuarioService extends Service {

	private final static URL PUBLICADORUSUARIOSERVICE_WSDL_LOCATION;
	private final static WebServiceException PUBLICADORUSUARIOSERVICE_EXCEPTION;
	private final static QName PUBLICADORUSUARIOSERVICE_QNAME = new QName("http://servidor/",
			"PublicadorUsuarioService");

	static {
		URL url = null;
		WebServiceException e = null;
		try {
			url = new URL(ConfigListener.cfg.getProperty("usuarioControllerURL"));
		} catch (MalformedURLException ex) {
			e = new WebServiceException(ex);
		}
		PUBLICADORUSUARIOSERVICE_WSDL_LOCATION = url;
		PUBLICADORUSUARIOSERVICE_EXCEPTION = e;
	}

	public PublicadorUsuarioService() {
		super(__getWsdlLocation(), PUBLICADORUSUARIOSERVICE_QNAME);
	}

	public PublicadorUsuarioService(WebServiceFeature... features) {
		super(__getWsdlLocation(), PUBLICADORUSUARIOSERVICE_QNAME, features);
	}

	public PublicadorUsuarioService(URL wsdlLocation) {
		super(wsdlLocation, PUBLICADORUSUARIOSERVICE_QNAME);
	}

	public PublicadorUsuarioService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, PUBLICADORUSUARIOSERVICE_QNAME, features);
	}

	public PublicadorUsuarioService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public PublicadorUsuarioService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return returns PublicadorUsuario
	 */
	@WebEndpoint(name = "PublicadorUsuarioPort")
	public PublicadorUsuario getPublicadorUsuarioPort() {
		return super.getPort(new QName("http://servidor/", "PublicadorUsuarioPort"), PublicadorUsuario.class);
	}

	/**
	 * 
	 * @param features A list of {@link jakarta.xml.ws.WebServiceFeature} to
	 *                 configure on the proxy. Supported features not in the
	 *                 <code>features</code> parameter will have their default
	 *                 values.
	 * @return returns PublicadorUsuario
	 */
	@WebEndpoint(name = "PublicadorUsuarioPort")
	public PublicadorUsuario getPublicadorUsuarioPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://servidor/", "PublicadorUsuarioPort"), PublicadorUsuario.class, features);
	}

	private static URL __getWsdlLocation() {
		if (PUBLICADORUSUARIOSERVICE_EXCEPTION != null) {
			throw PUBLICADORUSUARIOSERVICE_EXCEPTION;
		}
		return PUBLICADORUSUARIOSERVICE_WSDL_LOCATION;
	}

}