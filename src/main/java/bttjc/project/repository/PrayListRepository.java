package bttjc.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bttjc.project.entity.PrayList;

@Repository
public interface PrayListRepository extends JpaRepository<PrayList, Long> {
}