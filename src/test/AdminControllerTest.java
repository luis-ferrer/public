package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import impl.AdminControlerImpl;
import impl.UserControllerImpl;

public class AdminControllerTest {

	private AdminControlerImpl adminControlerImplBAD;
	private AdminControlerImpl adminControlerImplGOOD;

	@Before
	public void setUp() throws Exception {
		adminControlerImplBAD =  new AdminControlerImpl(new UserControllerImpl());
		adminControlerImplGOOD =  new AdminControlerImpl(new HardcodedUserController());
	}

	
	@Test
	public void testUserControllerIsNotImplementetYet() {
		//iandsoiasda
		assertNull(adminControlerImplBAD.recoverUserInfo(1));
	}
	
	@Test
	public void testAdminControllerWorks() {
		assertEquals("LUIS", adminControlerImplGOOD.recoverUserInfo(1).getName());
	}

}
