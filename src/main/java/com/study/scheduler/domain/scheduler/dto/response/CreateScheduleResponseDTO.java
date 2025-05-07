package com.study.scheduler.domain.scheduler.dto.response;

import com.study.scheduler.domain.scheduler.entity.Scheduler;

import lombok.Getter;

@Getter
public class CreateScheduleResponseDTO {

	private Long id;
	private String title;
	private String content;

	public CreateScheduleResponseDTO(Scheduler scheduler) {
		this.id = scheduler.getId();
		this.title = scheduler.getTitle();
		this.content = scheduler.getContent();
	}
}
