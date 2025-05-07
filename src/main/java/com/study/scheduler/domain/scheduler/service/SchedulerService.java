package com.study.scheduler.domain.scheduler.service;

import com.study.scheduler.domain.scheduler.dto.request.CreateScheduleRequestDTO;
import com.study.scheduler.domain.scheduler.dto.response.CreateScheduleResponseDTO;


public interface SchedulerService {

	CreateScheduleResponseDTO createSchedule(Long userId, CreateScheduleRequestDTO dto);

}
