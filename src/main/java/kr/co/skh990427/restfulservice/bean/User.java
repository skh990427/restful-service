package kr.co.skh990427.restfulservice.bean;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력해주세요")
    private String name;

    @Past(message = "등록일은 미래 날짜를 입력하실 수 없습니다")
    private LocalDateTime joinData;
}
