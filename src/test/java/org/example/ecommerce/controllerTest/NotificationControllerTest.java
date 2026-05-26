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
public class NotificationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateNotification() throws Exception {

        String notificationJson = """
                {
                    "message":"Nouvelle commande créée"
                }
                """;

        mockMvc.perform(post("/api/notifications")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(notificationJson))
                .andExpect(status().isOk());
    }

    @Test
    void shouldGetAllNotifications() throws Exception {

        mockMvc.perform(get("/api/notifications"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldDeleteNotification() throws Exception {

        mockMvc.perform(delete("/api/notifications/1"))
                .andExpect(status().isOk());
    }
}