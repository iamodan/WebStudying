package org.zerock.springex.domain;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;

}
