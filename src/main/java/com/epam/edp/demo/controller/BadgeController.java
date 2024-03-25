package com.epam.edp.demo.controller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing badges.
 */
@CrossOrigin
@RestController
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * GET /badges : get all the badges.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of badges in the body
     */
    @GetMapping("/badges")
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
