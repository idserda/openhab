package org.openhab.binding.plex.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openhab.io.net.http.SecureHttpContext;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlexWebhookServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger logger = LoggerFactory.getLogger(PlexWebhookServlet.class);

    private static final String SERVLET_NAME = "/plex";

    private HttpService httpService;

    public void setHttpService(HttpService httpService) {
        this.httpService = httpService;
    }

    public void unsetHttpService(HttpService httpService) {
        this.httpService = null;
    }

    protected void activate() {
        try {
            logger.debug("Starting Plex webhook servlet at " + SERVLET_NAME);

            Hashtable<String, String> props = new Hashtable<String, String>();
            httpService.registerServlet(SERVLET_NAME, this, props, createHttpContext());

        } catch (Exception ex) {
            logger.error("Error during Plex webhook servlet startup", ex);
        }
    }

    protected void deactivate() {
        httpService.unregister(SERVLET_NAME);
    }

    private HttpContext createHttpContext() {
        HttpContext defaultHttpContext = httpService.createDefaultHttpContext();
        return new SecureHttpContext(defaultHttpContext, "openHAB.org");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("Incoming post from Plex webhook");

        StringBuffer jb = new StringBuffer();
        String line = null;
        BufferedReader reader = req.getReader();
        while ((line = reader.readLine()) != null) {
            jb.append(line);
            logger.debug(line);
        }

        // String json = req.getParameter("payload");
        //
        // Gson gson = new Gson();
        // Event event = gson.fromJson(json, Event.class);
        // if (event != null) {
        // logger.debug("Event: " + event.getEvent());
        // }
    }

}
