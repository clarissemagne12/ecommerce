package org.example.ecommerce.controllers;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.entities.Notification;
import org.example.ecommerce.repositories.NotificationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationRepository notificationRepository;

    @GetMapping
    public List<Notification> getAll() {
        return notificationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Notification getById(@PathVariable Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Notification save(@RequestBody Notification notification) {
        return notificationRepository.save(notification);
    }

    @PutMapping("/{id}")
    public Notification update(@PathVariable Long id, @RequestBody Notification notification) {
        notification.setId(id);
        return notificationRepository.save(notification);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        notificationRepository.deleteById(id);
    }
}