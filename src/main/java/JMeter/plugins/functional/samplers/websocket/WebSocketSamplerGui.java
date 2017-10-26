/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JMeter.plugins.functional.samplers.websocket;

import java.awt.BorderLayout;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.config.gui.ArgumentsPanel;
import org.apache.jmeter.samplers.gui.AbstractSamplerGui;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

/**
 *
 * @author Maciej Zaleski
 */
public class WebSocketSamplerGui extends AbstractSamplerGui {

    private WebSocketSamplerPanel webSocketSamplerPanel;
    private static final Logger log = LoggingManager.getLoggerForClass();

    public WebSocketSamplerGui() {
        init();
        initFields();

        setLayout(new BorderLayout(0, 5));
        setBorder(makeBorder());

        add(makeTitlePanel(), BorderLayout.NORTH);
        add(webSocketSamplerPanel, BorderLayout.CENTER);
    }

    @Override
    public String getStaticLabel() {
        return "WebSocket Sampler";
    }

    @Override
    public String getLabelResource() {
        return "Label Resource";
    }

    @Override
    public void configure(TestElement element) {
        super.configure(element);
        if (element instanceof WebSocketSampler) {
            WebSocketSampler webSocketSamplerTestElement = (WebSocketSampler) element;
            webSocketSamplerPanel.setServerAddress(webSocketSamplerTestElement.getServerAddress());
            webSocketSamplerPanel.setServerPort(webSocketSamplerTestElement.getServerPort());
            webSocketSamplerPanel.setImplementation(webSocketSamplerTestElement.getImplementation());
            webSocketSamplerPanel.setProtocol(webSocketSamplerTestElement.getProtocol());
            webSocketSamplerPanel.setContextPath(webSocketSamplerTestElement.getContextPath());
            webSocketSamplerPanel.setContentEncoding(webSocketSamplerTestElement.getContentEncoding());
            webSocketSamplerPanel.setConnectPayload(webSocketSamplerTestElement.getConnectPayload());
            webSocketSamplerPanel.setSendPayload(webSocketSamplerTestElement.getResponsePayload());
            webSocketSamplerPanel.setResponseTimeout(String.valueOf(webSocketSamplerTestElement.getResponseTimeout()));
            webSocketSamplerPanel.setConnectionTimeout(String.valueOf(webSocketSamplerTestElement.getConnectionTimeout()));
            webSocketSamplerPanel.setIgnoreSslErrors(webSocketSamplerTestElement.isIgnoreSslErrors());
            webSocketSamplerPanel.setStreamingConnection(webSocketSamplerTestElement.isStreamingConnection());
            webSocketSamplerPanel.setStompProtocol(webSocketSamplerTestElement.isStompProtocol());
            webSocketSamplerPanel.setConnectionId(webSocketSamplerTestElement.getConnectionId());
            webSocketSamplerPanel.setConnectPattern(webSocketSamplerTestElement.getConnectPattern());
            webSocketSamplerPanel.setResponsePattern(webSocketSamplerTestElement.getResponsePattern());
            webSocketSamplerPanel.setCloseConncectionPattern(webSocketSamplerTestElement.getCloseConncectionPattern());
            webSocketSamplerPanel.setProxyAddress(webSocketSamplerTestElement.getProxyAddress());
            webSocketSamplerPanel.setProxyPassword(webSocketSamplerTestElement.getProxyPassword());
            webSocketSamplerPanel.setProxyPort(webSocketSamplerTestElement.getProxyPort());
            webSocketSamplerPanel.setProxyUsername(webSocketSamplerTestElement.getProxyUsername());
            webSocketSamplerPanel.setMessageBacklog(String.valueOf(webSocketSamplerTestElement.getMessageBacklog()));

            Arguments queryStringParameters = webSocketSamplerTestElement.getQueryStringParameters();
            if (queryStringParameters != null) {
                webSocketSamplerPanel.getAttributePanel().configure(queryStringParameters);
            }
        }
    }

    @Override
    public TestElement createTestElement() {
        WebSocketSampler preproc = new WebSocketSampler();
        configureTestElement(preproc);
        return preproc;
    }

    @Override
    public void modifyTestElement(TestElement te) {
        configureTestElement(te);
        if (te instanceof WebSocketSampler) {
            WebSocketSampler webSocketSamplerTestElement = (WebSocketSampler) te;
            webSocketSamplerTestElement.setServerAddress(webSocketSamplerPanel.getServerAddress());
            webSocketSamplerTestElement.setServerPort(webSocketSamplerPanel.getServerPort());
            webSocketSamplerTestElement.setImplementation(webSocketSamplerPanel.getImplementation());
            webSocketSamplerTestElement.setProtocol(webSocketSamplerPanel.getProtocol());
            webSocketSamplerTestElement.setContextPath(webSocketSamplerPanel.getContextPath());
            webSocketSamplerTestElement.setContentEncoding(webSocketSamplerPanel.getContentEncoding());
            webSocketSamplerTestElement.setConnectPayload(webSocketSamplerPanel.getConnectPayload());
            webSocketSamplerTestElement.setSendPayload(webSocketSamplerPanel.getSendPayload());
            webSocketSamplerTestElement.setConnectionTimeout(webSocketSamplerPanel.getConnectionTimeout());
            webSocketSamplerTestElement.setResponseTimeout(webSocketSamplerPanel.getResponseTimeout());
            webSocketSamplerTestElement.setIgnoreSslErrors(webSocketSamplerPanel.isIgnoreSslErrors());
            webSocketSamplerTestElement.setStreamingConnection(webSocketSamplerPanel.isStreamingConnection());
			webSocketSamplerTestElement.setStompProtocol(webSocketSamplerPanel.isStompProtocol());
            webSocketSamplerTestElement.setConnectionId(webSocketSamplerPanel.getConnectionId());
            webSocketSamplerTestElement.setConnectPattern(webSocketSamplerPanel.getConnectPattern());
            webSocketSamplerTestElement.setResponsePattern(webSocketSamplerPanel.getResponsePattern());
            webSocketSamplerTestElement.setCloseConncectionPattern(webSocketSamplerPanel.getCloseConncectionPattern());
            webSocketSamplerTestElement.setProxyAddress(webSocketSamplerPanel.getProxyAddress());
            webSocketSamplerTestElement.setProxyPassword(webSocketSamplerPanel.getProxyPassword());
            webSocketSamplerTestElement.setProxyPort(webSocketSamplerPanel.getProxyPort());
            webSocketSamplerTestElement.setProxyUsername(webSocketSamplerPanel.getProxyUsername());
            webSocketSamplerTestElement.setMessageBacklog(webSocketSamplerPanel.getMessageBacklog());

            ArgumentsPanel queryStringParameters = webSocketSamplerPanel.getAttributePanel();
            if (queryStringParameters != null) {
                webSocketSamplerTestElement.setQueryStringParameters((Arguments)queryStringParameters.createTestElement());
            }
        }
    }

    @Override
    public void clearGui() {
        super.clearGui();
        initFields();
    }

    private void init() {
        webSocketSamplerPanel = new WebSocketSamplerPanel();
    }

    private void initFields() {
        webSocketSamplerPanel.initFields();
    }
}
