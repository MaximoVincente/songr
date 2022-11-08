package com.vincenteSongr.songr;

import com.vincenteSongr.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testToString() {
		Album sut = new Album("The Razors Edge", "AC/DC", 12, 2802, "imgURL");
		assertEquals(sut.toString(), "Album The Razors Edge from AC/DC and its 12 hit songs!");
	}
	@Test
	void testAddAlbum(){
		Album sut = new Album("The Razors Edge", "AC/DC", 12, 2802, "imgURL");
		assertNotNull(sut);
	}
}
