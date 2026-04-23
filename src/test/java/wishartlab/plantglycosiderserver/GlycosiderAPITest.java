package wishartlab.plantglycosiderserver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GlycosiderAPITest {

  @Autowired private MockMvc mockMvc;

  @Test
  void testGenerateStructureAPI() throws Exception {
    // Testing the API using the example provided in the README
    mockMvc.perform(get("/api/generate/OC1=CC=CC=C1O")).andExpect(status().isOk());
  }
}
