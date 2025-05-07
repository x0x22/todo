package com.study.scheduler.domain.scheduler.service;

import org.springframework.stereotype.Service;

import com.study.scheduler.domain.scheduler.dto.request.CreateScheduleRequestDTO;
import com.study.scheduler.domain.scheduler.dto.response.CreateScheduleResponseDTO;
import com.study.scheduler.domain.scheduler.entity.Scheduler;
import com.study.scheduler.domain.scheduler.repository.SchedulerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchedulerServiceImpl implements SchedulerService{

	private final SchedulerRepository schedulerRepository;

	@Override
	public CreateScheduleResponseDTO createSchedule(Long userId, CreateScheduleRequestDTO dto) {

		Scheduler scheduler = new Scheduler(dto);
		Scheduler save = schedulerRepository.save(scheduler);
		return new CreateScheduleResponseDTO(save);
	}
}
