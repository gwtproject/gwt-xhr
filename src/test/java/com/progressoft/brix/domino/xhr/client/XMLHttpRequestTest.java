package com.progressoft.brix.domino.xhr.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

import java.util.logging.Logger;

public class XMLHttpRequestTest extends GWTTestCase {

    private static final Logger LOGGER = Logger.getLogger(XMLHttpRequestTest.class.getCanonicalName());
    private static final int UNSENT = 0;

    @Override
    public String getModuleName() {
        return "com.progressoft.brix.domino.xhr.XMLHttpRequestTest";
    }

    public void testCreateXmlHttpRequest() {
        XMLHttpRequest xmlHttpRequest = XMLHttpRequest.create();
        xmlHttpRequest.open("GET", getTestBaseURL()+"/test");
        xmlHttpRequest.send();
        assertNotNull(xmlHttpRequest);
        assertEquals(xmlHttpRequest.getStatus(), UNSENT);
    }

    private static String getTestBaseURL() {
        return GWT.getModuleBaseURL() + "testRequest/";
    }
}
