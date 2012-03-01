package dardo.eve.backend.models;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:config/applicationContext.xml")
public class TestMessage {

	@Autowired
	private ObjectMapper mapper;
	
	private static final Logger logger = Logger.getLogger(TestMessage.class);
	
	@Test
	public void testInject()
	{
		assertNotNull(mapper);
	}
	
	@Test
	public void testJsonOutput() throws JsonGenerationException, JsonMappingException, IOException
	{
		Message msg = new Message();
		msg.setContent("this is content");
		logger.info(mapper.writeValueAsString(msg));
	}
}
