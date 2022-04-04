package com.sparta.week04.service;

import com.sparta.week04.models.Product;
import com.sparta.week04.models.ProductMypriceRequestDto;
import com.sparta.week04.models.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final로 선언된 멤버 변수가 꼭 필요함을 알려주기 위함.
@Service // 서비스임을 알려준다.
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional // 메소드 동작이 SQL 쿼리문임을 알려준다.
    public Long update(Long id, ProductMypriceRequestDto requestDto) {
        // id에 해당되는 애를 업데이트
        // productRepository에서 id에 해당되는 애를 findById
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        product.update(requestDto);
        return id;
    }
}
