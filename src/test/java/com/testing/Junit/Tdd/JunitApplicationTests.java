package com.testing.Junit.Tdd;

import com.testing.Junit.Tdd.Players;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertEquals(new Players(). getPlayer("ronaldo"),"ronaldo");
	}

}
