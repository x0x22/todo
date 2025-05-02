package com.study.scheduler.domain.scheduler.dto.request;

import com.study.scheduler.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateScheduleRequestDTO extends BaseEntity {

	@NotBlank
	private String title;

	private String content;


}
