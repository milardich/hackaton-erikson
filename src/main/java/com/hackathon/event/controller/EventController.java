package com.hackathon.event.controller;

import com.hackathon.event.dto.EventRequestDto;
import com.hackathon.event.dto.TeamResponseDto;
import com.hackathon.event.dto.TeamUpResponseDto;
import com.hackathon.event.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @PostMapping("/event")
    public void save(@RequestBody EventRequestDto eventRequestDto){
        eventService.save(eventRequestDto);
    }

    @PutMapping("/event/{eventId}/team-up")
    public TeamUpResponseDto teamUp(@PathVariable Long eventId){
        return eventService.teamUp(eventId);
    }
}
