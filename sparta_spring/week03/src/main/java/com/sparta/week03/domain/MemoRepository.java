package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> { //JpaRepository 상속, Memo라는 녀석의 id가 Long인 녀석
    List<Memo> findAllByOrderByModifiedAtDesc(); // 생성시간 최신순을 정렬해주셈
}
