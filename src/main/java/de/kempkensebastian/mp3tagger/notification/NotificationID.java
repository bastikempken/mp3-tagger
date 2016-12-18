package de.kempkensebastian.mp3tagger.notification;

public enum NotificationID {
	
	NOTIFY_001(NotificationType.INFORMATION),
	
	JUNIT_INFORMATION(NotificationType.INFORMATION),
	
	JUNIT_ERROR(NotificationType.ERROR);
	
	private NotificationType notificationType;
	

	private NotificationID(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}


	
}
