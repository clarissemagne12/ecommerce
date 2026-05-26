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
public class CommandeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateCommande() throws Exception {

        String commandeJson = """
                {
                    "statut":"EN_ATTENTE"
                }
                """;

        mockMvc.perform(post("/api/commandes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(commandeJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllCommandes() throws Exception {

        mockMvc.perform(get("/api/commandes"))
                .andExpect(status().isOk());
    }
}