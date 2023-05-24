package com.develhope.testUnit;


import com.develhope.testUnit.UserController;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AbstractAssert.setPrintAssertionsDescription;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestUnitApplicationTests {

@Autowired
	UserFakeService userService;



	@Test
	void userWithNoNullValues(){
		assertDoesNotThrow(() -> userService.returnUserWithId());
	}

	@Test
	void userEffectiveUpdate(){
		assertNotEquals(userService.returnUserWithId(),userService.updateUser());
	}

	@Test
	void deleteUser(){
		assertNull(userService.deleteUserWithId());
	}

	@Test
	void createUser(){
		User user=new User(1,"Federico","Urbani");
		assertEquals(user.getId(),userService.createUser("Federico","Urbani").getId());
	}

}
