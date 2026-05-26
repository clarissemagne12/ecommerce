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
public class DetailCommandeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateDetailCommande() throws Exception {

        String detailCommandeJson = """
                {
                    "id":{
                        "commandeId":1,
                        "produitId":1
                    },
                    "quantite":2,
                    "prix":15000
                }
                """;

        mockMvc.perform(post("/api/detail-commandes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(detailCommandeJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllDetailCommandes() throws Exception {

        mockMvc.perform(get("/api/detail-commandes"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldDeleteDetailCommande() throws Exception {

        String idJson = """
                {
                    "commandeId":1,
                    "produitId":1
                }
                """;

        mockMvc.perform(delete("/api/detail-commandes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(idJson))
                .andExpect(status().isOk());
    }
}