package de.kempkensebastian.mp3tagger.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

@Component
public class NotificationManager {
	
	@Autowired
	private NotificationContentComposer notificationContentComposer;
	
	public void showNotification(NotificationID id){
		Notification notification = new Notification();
		notification.setNotificationID(id);
		Alert alert = null;
		switch(notification.getNotificationID().getNotificationType()){
		case ERROR:
			alert = handleError(notification);
			break;
		case INFORMATION:
			alert = handleInformation(notification);
			break;
		}
		alert.showAndWait();
	}

	private Alert handleError(Notification notification) {
		Alert alert = new Alert(AlertType.ERROR);
		NotificationContent content = notificationContentComposer.getContent(notification.getNotificationID());
		alert.setHeaderText(content.getHeader());
		alert.setTitle(content.getTitle());
		alert.setContentText(content.getText());
		return alert;
	}
	
	private Alert handleInformation(Notification notification) {
		Alert alert = new Alert(AlertType.INFORMATION);
		NotificationContent content = notificationContentComposer.getContent(notification.getNotificationID());
		alert.setHeaderText(content.getHeader());
		alert.setTitle(content.getTitle());
		alert.setContentText(content.getText());
		return alert;
	}
}
