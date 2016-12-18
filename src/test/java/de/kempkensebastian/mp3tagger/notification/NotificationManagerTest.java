package de.kempkensebastian.mp3tagger.notification;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.sun.javafx.tk.Toolkit;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

@SuppressWarnings("restriction")
@RunWith(PowerMockRunner.class)
@PrepareForTest({NotificationManager.class,Alert.class})
public class NotificationManagerTest {
	
	@InjectMocks
	private NotificationManager notoficationManager;

	@Mock
	private NotificationContentComposer notificationContentComposer;
	
	@Mock
	private Alert alert;
	
	@Mock
	private Toolkit toolkit;
	
	@Before
	public void setUp() throws Exception {
		Mockito.when(toolkit.isFxUserThread()).thenReturn(true);
		PowerMockito.whenNew(Alert.class).withParameterTypes(AlertType.class).withArguments(Matchers.any(AlertType.class)).thenReturn(alert);
		Mockito.when(notificationContentComposer.getContent(Matchers.any(NotificationID.class))).thenReturn(new NotificationContent());
	}
	
	@Test
	public void testInformationNotification(){
		notoficationManager.showNotification(NotificationID.JUNIT_INFORMATION);
		Mockito.verify(alert).showAndWait(); 
	}
	
	@Test
	public void testErrorNotification(){
		notoficationManager.showNotification(NotificationID.JUNIT_ERROR);
		Mockito.verify(alert).showAndWait(); 
	}

}
