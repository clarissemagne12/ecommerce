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
public class ProduitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateProduit() throws Exception {

        String produitJson = """
                {
                    "nom":"Laptop",
                    "prix":500000
                }
                """;

        mockMvc.perform(post("/api/produits")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(produitJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllProduits() throws Exception {

        mockMvc.perform(get("/api/produits"))
                .andExpect(status().isOk());
    }
}