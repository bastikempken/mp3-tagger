package de.kempkensebastian.mp3tagger.context;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import de.kempkensebastian.mp3tagger.utils.DummyBean;

@RunWith(MockitoJUnitRunner.class)
public class BeanFacadeTest {

    @Mock
    private ApplicationContext applicationContext;

    @InjectMocks
    private BeanFacade beanFacade;

    @Before
    public void setUp() throws Exception {
        beanFacade.setApplicationContext(applicationContext);
        Mockito.when(applicationContext.getBean(DummyBean.class)).thenReturn(new DummyBean());
    }

    @Test
    public void testGetBean() throws Exception {
        @SuppressWarnings("static-access")
        DummyBean bean = beanFacade.getBean(DummyBean.class);
        assertThat(bean, is(notNullValue()));
    }

}
