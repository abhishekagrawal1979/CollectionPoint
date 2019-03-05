package com.johnlewis.collectionPoint

import com.johnlewis.collectionPoint.v1.CollectionPointApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@ContextConfiguration(classes = [CollectionPointApplication::class])
class CollectionPointApplicationTests {

	@Test
	fun contextLoads() {
	}

}
