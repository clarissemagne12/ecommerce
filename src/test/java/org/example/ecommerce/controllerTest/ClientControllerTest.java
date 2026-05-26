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
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateClient() throws Exception {

        String clientJson = """
                {
                    "nom":"Clarisse",
                    "email":"clarisse@gmail.com"
                }
                """;

        mockMvc.perform(post("/api/clients")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(clientJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllClients() throws Exception {

        mockMvc.perform(get("/api/clients"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldDeleteClient() throws Exception {

        mockMvc.perform(delete("/api/clients/1"))
                .andExpect(status().isOk());
    }
}