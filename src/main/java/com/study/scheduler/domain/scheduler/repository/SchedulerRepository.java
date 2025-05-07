package com.study.scheduler.domain.scheduler.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.study.scheduler.domain.scheduler.entity.Scheduler;

public interface SchedulerRepository extends JpaRepository<Scheduler,Long> {
}
