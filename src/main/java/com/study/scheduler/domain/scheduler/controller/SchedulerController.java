package com.study.scheduler.domain.scheduler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.scheduler.domain.scheduler.dto.request.CreateScheduleRequestDTO;
import com.study.scheduler.domain.scheduler.dto.response.CreateScheduleResponseDTO;
import com.study.scheduler.domain.scheduler.service.SchedulerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class SchedulerController {

	private final SchedulerService schedulerService;

	@PostMapping
	public ResponseEntity<CreateScheduleResponseDTO> createSchedule (@RequestBody @Valid CreateScheduleRequestDTO dto){



	}
}
