package org.example.ecommerce.services;

import org.example.ecommerce.entities.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationInterface {

    Notification save(Notification notification);

    Notification update(Notification notification);

    List<Notification> findAll();

    Optional<Notification> findById(Long id);

    void deleteById(Long id);
}