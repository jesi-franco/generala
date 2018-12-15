package uy.edu.cei.generala.client.ui.panel;

import java.rmi.RemoteException;

import uy.edu.cei.generala.common.client.Observer;
import uy.edu.cei.generala.common.notifications.GameNotification;

public class LoginPanelController implements Observer {

	private LoginPanel panel;
	
	public LoginPanelController(LoginPanel loginPanel) {
		this.panel = loginPanel;
	}
	
	public void loginActionHandler() {
		this.panel.getPasswordField();
	}

	@Override
	public void update(GameNotification login) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
