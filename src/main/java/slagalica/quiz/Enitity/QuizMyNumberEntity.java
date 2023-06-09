package slagalica.quiz.Enitity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quiz")
@Entity
@Data
public class QuizMyNumberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number1;

    private int number2;

    private int number3;

    private int number4;

    private int number5;

    private int number6;

    private int result;
}
