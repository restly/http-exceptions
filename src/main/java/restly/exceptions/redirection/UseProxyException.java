package restly.exceptions.redirection;

import restly.HttpStatus;

/**
 * 305 Use Proxy
 * <p/>
 * <p>
 * The requested resource MUST be accessed through the proxy given by
 * the Location field. The Location field gives the URI of the proxy.
 * The recipient is expected to repeat this single request via the
 * proxy. 305 responses MUST only be generated by origin servers.
 * </p>
 * <pre>      Note: RFC 2068 was not clear that 305 was intended to redirect a
 *   single request, and to be generated by origin servers only.  Not
 *   observing these limitations has significant security consequences.
 * </pre>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class UseProxyException extends HttpRedirectionException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.USE_PROXY;

	public UseProxyException(String url) {
		super(HTTP_STATUS, url);
	}
}