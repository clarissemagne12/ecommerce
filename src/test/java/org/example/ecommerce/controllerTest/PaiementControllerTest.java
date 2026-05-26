package org.example.ecommerce.controllerTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PaiementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreatePaiement() throws Exception {

        String paiementJson = """
                {
                    "montant":25000
                }
                """;

        mockMvc.perform(post("/api/paiements")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(paiementJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllPaiements() throws Exception {

        mockMvc.perform(get("/api/paiements"))
                .andExpect(status().isOk());
    }
}