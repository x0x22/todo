package com.study.scheduler.domain.scheduler.service;

import org.springframework.stereotype.Service;

import com.study.scheduler.domain.scheduler.dto.request.CreateScheduleRequestDTO;
import com.study.scheduler.domain.scheduler.dto.response.CreateScheduleResponseDTO;

@Service
public interface SchedulerService {

	CreateScheduleResponseDTO createSchedule(Long id,Long userId, CreateScheduleRequestDTO dto);

}
