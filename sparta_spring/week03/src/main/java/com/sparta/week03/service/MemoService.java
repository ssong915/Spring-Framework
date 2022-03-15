package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor //final 이랑 생성된 애 있으면, 세트~
@Service // Service라는 것도 알려주기
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional // update 할때 DB에 반영이 꼭 돼야해!
    public Long update(Long id, MemoRequestDto requestDto) { //메모의 id와 변결시킬 메모
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return memo.getId();
    }
}