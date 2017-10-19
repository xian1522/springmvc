package springmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.UriUtils;


public class HomeControllerTest {
	@Test
	public void testHomePage() throws Exception{
		UriUtils.decode("going going", "utf-8");
//		HomeController controller = new HomeController();
//		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
//		mockMvc.perform(MockMvcRequestBuilders.get("/homepage")).andExpect(MockMvcResultMatchers.view().name("index"));
	}
}
