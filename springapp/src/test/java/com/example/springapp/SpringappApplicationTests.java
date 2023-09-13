package com.example.springapp;


import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {

	@Autowired
	private  MockMvc mockMvc ;

	@Test
	void AddStudent() throws Exception{	
	

		String st = "{\"studentId\": 1000,\"studentName\": \"Demo\", \"tamil\": \"100\",\"english\": \"90\",\"maths\":\"20\" ,\"science\":\"20\",\"socialScience\":\"20\"}";
		 mockMvc.perform(MockMvcRequestBuilders.post("/")
		 				.contentType(MediaType.APPLICATION_JSON)
		 				.content(st)
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$").value(true))
						.andReturn();
	}

	
	@Test
	void getStudentById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/1000")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(jsonPath("$.tamil").value("100"))
				.andReturn();
	}
	

	@Test
    void getAllStudents() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
                .andReturn();
    }
	
}