// { autofold
package com.tu.code.junit5;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
// }
class MessengerTest {

	private static final String CLIENT_EMAIL = "someone@somewhere.com";
	private static final String MSG_CONTENT = "Dear SomeOne Welcome";

	@Mock
	private Template template;
	@Mock
	private Client client;
	@Mock
	private MailServer mailServer;
	@Mock
	private TemplateEngine templateEngine;

	@InjectMocks
	private Messenger messenger = new Messenger();

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldSendEmail() {
		when(client.getEmail()).thenReturn(CLIENT_EMAIL);
		when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);
		messenger.sendMessage(client, template);
		verify(mailServer).send("a@A.com", MSG_CONTENT);
	}

}
