package com.campusdual.fundme.restcontroller;

import com.campusdual.fundme.api.INotificationService;
import com.campusdual.fundme.model.dto.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fundme/controller/rest/notifications")
public class NotificationRestController {

    @Autowired
    private INotificationService notificationService;

    @PostMapping(value = "/get")
    public NotificationDTO queryNotification (@RequestBody NotificationDTO notification) { return this.notificationService.getNotification(notification); }

    @GetMapping(value = "/all")
    public List<NotificationDTO> queryAllNotifications() { return this.notificationService.getAllNotifications(); }

    @PostMapping(value = "/add")
    public int insertNotification (@RequestBody NotificationDTO notification) { return this.notificationService.insertNotification(notification); }

    @PutMapping(value = "/update")
    public int updateNotification (@RequestBody NotificationDTO notification) { return this.notificationService.updateNotification(notification); }

    @PostMapping(value = "/delete")
    public int deleteNotification (@RequestBody NotificationDTO notification) { return this.notificationService.deleteNotification(notification); }

}