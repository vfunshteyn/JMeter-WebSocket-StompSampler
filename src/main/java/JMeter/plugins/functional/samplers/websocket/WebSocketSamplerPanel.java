/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JMeter.plugins.functional.samplers.websocket;

import org.apache.jmeter.config.gui.ArgumentsPanel;
import org.apache.jmeter.protocol.http.gui.HTTPArgumentsPanel;
import org.apache.jorphan.logging.LoggingManager;
import org.apache.log.Logger;

/**
 * @author Maciej Zaleski
 */
public class WebSocketSamplerPanel extends javax.swing.JPanel {
	private static final Logger log = LoggingManager.getLoggerForClass();
	private HTTPArgumentsPanel attributePanel;

	/**
	 * Creates new form WebSocketSamplerPanel
	 */
	public WebSocketSamplerPanel() {
		initComponents();

		attributePanel = new HTTPArgumentsPanel();
		querystringAttributesPanel.add(attributePanel);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		serverAddressTextField = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		serverPortTextField = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		connectionTimeoutTextField = new javax.swing.JTextField();
		jLabel17 = new javax.swing.JLabel();
		responseTimeoutTextField = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		contextPathTextField = new javax.swing.JTextField();
		protocolTextField = new javax.swing.JTextField();
		contentEncodingTextField = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		connectionIdTextField = new javax.swing.JTextField();
		querystringAttributesPanel = new javax.swing.JPanel();
		ignoreSslErrorsCheckBox = new javax.swing.JCheckBox();
		jScrollPane1 = new javax.swing.JScrollPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		connectPayloadEditorPane = new javax.swing.JEditorPane();
		sendPayloadEditorPane = new javax.swing.JEditorPane();
		jLabel14 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		implementationComboBox = new javax.swing.JComboBox();
		streamingConnectionCheckBox = new javax.swing.JCheckBox();
		stompCheckBox = new javax.swing.JCheckBox();
		jPanel5 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		connectPatternTextField = new javax.swing.JTextField();
		responsePatternTextField = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		closeConncectionPatternTextField = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		messageBacklogTextField = new javax.swing.JTextField();
		jPanel6 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		proxyAddressTextField = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		proxyPortTextField = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		proxyUsernameTextField = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		proxyPasswordTextField = new javax.swing.JTextField();

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Web Server"));

		jLabel1.setText("Server Name or IP:");

		jLabel2.setText("Port Number:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(serverAddressTextField)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1)
										.addComponent(serverAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2)
										.addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Timeout (milliseconds)"));

		jLabel3.setText("Connection:");

		jLabel17.setText("Response:");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(connectionTimeoutTextField)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel17)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(responseTimeoutTextField)
								.addContainerGap())
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(connectionTimeoutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel17)
										.addComponent(responseTimeoutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("WebSocket Request"));

		jLabel4.setText("Protocol [ws/wss]:");

		jLabel5.setText("Path:");

		jLabel6.setText("Content encoding:");

		protocolTextField.setToolTipText("");

		jLabel8.setText("Connection Id:");

		querystringAttributesPanel.setLayout(new javax.swing.BoxLayout(querystringAttributesPanel, javax.swing.BoxLayout.LINE_AXIS));

		ignoreSslErrorsCheckBox.setText("Ignore SSL certificate errors");

		jScrollPane1.setViewportView(connectPayloadEditorPane);
		jScrollPane2.setViewportView(sendPayloadEditorPane);

		jLabel14.setText("Connect Message");
		jLabel18.setText("Send Message");

		jLabel15.setText("Implementation:");

		implementationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RFC6455 (v13)" }));

		streamingConnectionCheckBox.setText("Streaming connection");
		stompCheckBox.setText("Stomp Protocol");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(querystringAttributesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jScrollPane1)
										.addComponent(jScrollPane2)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(jLabel15)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(implementationComboBox, 0, 1, Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jLabel4)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(protocolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jLabel6)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(contentEncodingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jLabel8)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(connectionIdTextField))
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel14)
														.addComponent(jLabel18)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(ignoreSslErrorsCheckBox)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(streamingConnectionCheckBox)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(stompCheckBox)))
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(jLabel5)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(contextPathTextField)))
								.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4)
										.addComponent(protocolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel6)
										.addComponent(contentEncodingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel8)
										.addComponent(connectionIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel15)
										.addComponent(implementationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5)
										.addComponent(contextPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ignoreSslErrorsCheckBox)
										.addComponent(streamingConnectionCheckBox)
										.addComponent(stompCheckBox))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(querystringAttributesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
								.addGap(8, 8, 8)
								.addComponent(jLabel14)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
								.addContainerGap()
								.addComponent(jLabel18)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
								.addContainerGap())
		);

		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("WebSocket Response"));

		jLabel7.setText("Connect pattern:");

		jLabel19.setText("Response pattern:");

		jLabel9.setText("Close connection pattern:");

		jLabel16.setText("Message backlog:");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel7)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(connectPatternTextField)
												.addGap(18, 18, 18)
												.addComponent(jLabel16)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(messageBacklogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel19)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(responsePatternTextField))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
												.addComponent(jLabel9)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(closeConncectionPatternTextField)))
								.addContainerGap())
		);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel16)
												.addComponent(messageBacklogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(connectPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel19)
										.addComponent(responsePatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9)
										.addComponent(closeConncectionPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Proxy Server (currently not supported by Jetty)"));

		jLabel10.setText("Server Name or IP:");

		proxyAddressTextField.setEnabled(false);

		jLabel11.setText("Port Number:");

		proxyPortTextField.setEnabled(false);

		jLabel12.setText("Username:");

		proxyUsernameTextField.setEnabled(false);

		jLabel13.setText("Password:");

		proxyPasswordTextField.setEnabled(false);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel6Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel10)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(proxyAddressTextField)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel11)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(proxyPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jLabel12)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(proxyUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(jLabel13)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(proxyPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
		);
		jPanel6Layout.setVerticalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel6Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(proxyUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel12))
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel11)
												.addComponent(proxyPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(proxyAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13)
												.addComponent(proxyPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
		);
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField closeConncectionPatternTextField;
	private javax.swing.JTextField connectionIdTextField;
	private javax.swing.JTextField connectionTimeoutTextField;
	private javax.swing.JTextField contentEncodingTextField;
	private javax.swing.JTextField contextPathTextField;
	private javax.swing.JCheckBox ignoreSslErrorsCheckBox;
	private javax.swing.JComboBox implementationComboBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField messageBacklogTextField;
	private javax.swing.JTextField protocolTextField;
	private javax.swing.JTextField proxyAddressTextField;
	private javax.swing.JTextField proxyPasswordTextField;
	private javax.swing.JTextField proxyPortTextField;
	private javax.swing.JTextField proxyUsernameTextField;
	private javax.swing.JPanel querystringAttributesPanel;
	private javax.swing.JEditorPane connectPayloadEditorPane;
	private javax.swing.JEditorPane sendPayloadEditorPane;
	private javax.swing.JTextField connectPatternTextField;
	private javax.swing.JTextField responsePatternTextField;
	private javax.swing.JTextField responseTimeoutTextField;
	private javax.swing.JTextField serverAddressTextField;
	private javax.swing.JTextField serverPortTextField;
	private javax.swing.JCheckBox streamingConnectionCheckBox;
	private javax.swing.JCheckBox stompCheckBox;
	// End of variables declaration//GEN-END:variables

	public void initFields() {
	}

	public void setCloseConncectionPattern(String closeConncectionPattern) {
		closeConncectionPatternTextField.setText(closeConncectionPattern);
	}

	public String getCloseConncectionPattern() {
		return closeConncectionPatternTextField.getText();
	}

	public void setConnectionId(String connectionId) {
		connectionIdTextField.setText(connectionId);
	}

	public String getConnectionId() {
		return connectionIdTextField.getText();
	}

	public void setContentEncoding(String contentEncoding) {
		contentEncodingTextField.setText(contentEncoding);
	}

	public String getContentEncoding() {
		return contentEncodingTextField.getText();
	}

	public void setContextPath(String contextPath) {
		contextPathTextField.setText(contextPath);
	}

	public String getContextPath() {
		return contextPathTextField.getText();
	}

	public void setProtocol(String protocol) {
		protocolTextField.setText(protocol);
	}

	public String getProtocol() {
		return protocolTextField.getText();
	}

	public void setProxyAddress(String proxyAddress) {
		proxyAddressTextField.setText(proxyAddress);
	}

	public String getProxyAddress() {
		return proxyAddressTextField.getText();
	}

	public void setProxyPassword(String proxyPassword) {
		proxyPasswordTextField.setText(proxyPassword);
	}

	public String getProxyPassword() {
		return proxyPasswordTextField.getText();
	}

	public void setProxyPort(String proxyPort) {
		proxyPortTextField.setText(proxyPort);
	}

	public String getProxyPort() {
		return proxyPortTextField.getText();
	}

	public void setProxyUsername(String proxyUsername) {
		proxyUsernameTextField.setText(proxyUsername);
	}

	public String getProxyUsername() {
		return proxyUsernameTextField.getText();
	}

	public void setConnectPattern(String connectPattern) {
		connectPatternTextField.setText(connectPattern);
	}

	public String getConnectPattern() {
		return connectPatternTextField.getText();
	}

	public void setResponsePattern(String responsePattern) {
		responsePatternTextField.setText(responsePattern);
	}

	public String getResponsePattern() {
		return responsePatternTextField.getText();
	}

	public void setResponseTimeout(String responseTimeout) {
		responseTimeoutTextField.setText(responseTimeout);
	}

	public String getResponseTimeout() {
		return responseTimeoutTextField.getText();
	}

	public void setConnectionTimeout(String connectionTimeout) {
		connectionTimeoutTextField.setText(connectionTimeout);
	}

	public String getConnectionTimeout() {
		return connectionTimeoutTextField.getText();
	}

	public void setServerAddress(String serverAddress) {
		serverAddressTextField.setText(serverAddress);
	}

	public String getServerAddress() {
		return serverAddressTextField.getText();
	}

	public void setServerPort(String serverPort) {
		serverPortTextField.setText(serverPort);
	}

	public String getServerPort() {
		return serverPortTextField.getText();
	}

	public void setConnectPayload(String connectPayload) {
		connectPayloadEditorPane.setText(connectPayload);
	}

	public String getConnectPayload() {
		return connectPayloadEditorPane.getText();
	}

	public void setSendPayload(String sendPayload) {
		sendPayloadEditorPane.setText(sendPayload);
	}

	public String getSendPayload() {
		return sendPayloadEditorPane.getText();
	}

	public void setStreamingConnection(Boolean streamingConnection) {
		streamingConnectionCheckBox.setSelected(streamingConnection);
	}

	public Boolean isStreamingConnection() {
		return streamingConnectionCheckBox.isSelected();
	}

	public Boolean isStompProtocol() {
		return stompCheckBox.isSelected();
	}

	public void setStompProtocol(final Boolean stompProtocol) {
		stompCheckBox.setSelected(stompProtocol);
	}

	public void setIgnoreSslErrors(Boolean ignoreSslErrors) {
		ignoreSslErrorsCheckBox.setSelected(ignoreSslErrors);
	}

	public Boolean isIgnoreSslErrors() {
		return ignoreSslErrorsCheckBox.isSelected();
	}

	public void setImplementation(String implementation) {
		implementationComboBox.setSelectedItem(implementation);
	}

	public String getImplementation() {
		return (String) implementationComboBox.getSelectedItem();
	}

	public void setMessageBacklog(String messageBacklog) {
		messageBacklogTextField.setText(messageBacklog);
	}

	public String getMessageBacklog() {
		return messageBacklogTextField.getText();
	}

	/**
	 * @return the attributePanel
	 */
	public ArgumentsPanel getAttributePanel() {
		return attributePanel;
	}
}
