package de.kempkensebastian.mp3tagger.notification;

import org.springframework.stereotype.Component;

@Component
public class NotificationContentComposer {
	
	
	public NotificationContent getContent(NotificationID id){
		//TODO
		NotificationContent notificationContent = new NotificationContent();
		notificationContent.setHeader("TEST");
		notificationContent.setTitle("TEST");
		notificationContent.setText("TEST");
		
		return notificationContent;
	}

}
