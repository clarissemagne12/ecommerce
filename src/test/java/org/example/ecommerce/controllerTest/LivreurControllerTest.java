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
public class LivreurControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateLivreur() throws Exception {

        String livreurJson = """
                {
                    "nom":"Paul",
                    "telephone":"690000000",
                    "email":"paul@gmail.com"
                }
                """;

        mockMvc.perform(post("/api/livreurs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(livreurJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllLivreurs() throws Exception {

        mockMvc.perform(get("/api/livreurs"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetLivreurById() throws Exception {

        mockMvc.perform(get("/api/livreurs/1"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldDeleteLivreur() throws Exception {

        mockMvc.perform(delete("/api/livreurs/1"))
                .andExpect(status().isOk());
    }
}