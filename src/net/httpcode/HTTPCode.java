package net.httpcode;


import java.util.HashMap;

public class HTTPCode {
	
	public String code(int hcode){
		
		HashMap<Integer, String> code = new HashMap<>();
		
		code.put(100, "Continue: Request received, please continue");
		code.put(101, "Switching Protocols: Switching to new protocol; obey Upgrade header");
		code.put(102, "Processing: WebDAV; RFC 2518");
		code.put(200, "OK: Request fulfilled, document follows");
		code.put(201, "Created: Document created, URL follows");
		code.put(202, "Accepted: Request accepted, processing continues off-line");
		code.put(203, "Non-Authoritative Information: Request fulfilled from cache");
		code.put(204, "No Content: Request fulfilled, nothing follows");
		code.put(205, "Reset Content: Clear input form for further input.");
		code.put(206, "Partial Content: Partial content follows.");
		code.put(207, "Multi-status: WebDAV; RFC 4918");
		code.put(208, "Already Reported: WebDAV; RFC 5842");
		code.put(226, "IM Used: RFC 3229");
		code.put(300, "Multiple Choices: Object has several resources -- see URI list");
		code.put(301, "Moved Permanently: Object moved permanently -- see URI list");
		code.put(302, "Found: Object moved temporarily -- see URI list");
		code.put(303, "See Other: Object moved -- see Method and URL list");
		code.put(304, "Not Modified: Document has not changed since given time");
		code.put(305, "Use Proxy: You must use proxy specified in Location to access this resource");
		code.put(306, "Switch Proxy: Subsequent requests should use the specified proxy");
		code.put(307, "Temporary Redirect: Object moved temporarily -- see URI list");
		code.put(308, "Permanent Redirect: Object moved permanently");
		code.put(400, "Bad Request: Bad request syntax or unsupported method");
		code.put(401, "Unauthorized: No permission -- see authorization schemes");
		code.put(402, "Payment Required: No payment -- see charging schemes");
		code.put(403, "Forbidden: Request forbidden -- authorization will not help");
		code.put(404, "Not Found: Nothing matches the given URI");
		code.put(405, "Method Not Allowed: Specified method is invalid for this resource.");
		code.put(406, "Not Acceptable: URI not available in preferred format.");
		code.put(407, "Proxy Authentication Required: You must authenticate with this proxy before proceeding.");
		code.put(408, "Request Timeout: Request timed out; try again later.");
		code.put(409, "Conflict: Request conflict.");
		code.put(410, "Gone: URI no longer exists and has been permanently removed.");
		code.put(411, "Length Required: Client must specify Content-Length.");
		code.put(412, "Precondition Failed: Precondition in headers is false.");
		code.put(413, "Request Entity Too Large: Entity is too large.");
		code.put(414, "Request-URI Too Long: URI is too long.");
		code.put(415, "Unsupported Media Type: Entity body in unsupported format.");
		code.put(416, "Requested Range Not Satisfiable: Cannot satisfy request range.");
		code.put(417, "Expectation Failed: Expect condition could not be satisfied.");
		code.put(418, "I'm a teapot: The HTCPCP server is a teapot");
		code.put(419, "Authentication Timeout: previously valid authentication has expired");
		code.put(420, "Method Failure / Enhance Your Calm: Spring Framework / Twitter");
		code.put(422, "Unprocessable Entity: WebDAV; RFC 4918");
		code.put(423, "Locked: WebDAV; RFC 4918");
		code.put(424, "Failed Dependency / Method Failure: WebDAV; RFC 4918");
		code.put(425, "Unordered Collection: Internet draft");
		code.put(426, "Upgrade Required: client should switch to a different protocol");
		code.put(428, "Precondition Required: RFC 6585");
		code.put(429, "Too Many Requests: RFC 6585");
		code.put(431, "Request Header Fields Too Large: RFC 6585");
		code.put(440, "Login Timeout: Microsoft");
		code.put(444, "No Response: Nginx");
		code.put(449, "Retry With: Microsoft");
		code.put(450, "Blocked by Windows Parental Controls: Microsoft");
		code.put(451, "Unavailable For Legal Reasons: Internet draft");
		code.put(494, "Request Header Too Large: Nginx");
		code.put(495, "Cert Error: Nginx");
		code.put(496, "No Cert: Nginx");
		code.put(497, "HTTP to HTTPS: Nginx");
		code.put(498, "Token expired/invalid: Esri");
		code.put(499, "Client Closed Request: Nginx");
		code.put(500, "Internal Server Error: Server got itself in trouble");
		code.put(501, "Not Implemented: Server does not support this operation");
		code.put(502, "Bad Gateway: Invalid responses from another server/proxy.");
		code.put(503, "Service Unavailable: The server cannot process the request due to a high load");
		code.put(504, "Gateway Timeout: The gateway server did not receive a timely response");
		code.put(505, "HTTP Version Not Supported: Cannot fulfill request.");
		code.put(506, "Variant Also Negotiates: RFC 2295");
		code.put(507, "Insufficient Storage: WebDAV; RFC 4918");
		code.put(508, "Loop Detected: WebDAV; RFC 5842");
		code.put(509, "Bandwidth Limit Exceeded: Apache bw/limited extension");
		code.put(510, "Not Extended: RFC 2774");
		code.put(511, "Network Authentication Required: RFC 6585");
		code.put(598, "Network read timeout error: Unknown");
		code.put(599, "Network connect timeout error: Unknown");
		
		String rtn = code.get(hcode);
		
		return rtn;
	
	}
}
