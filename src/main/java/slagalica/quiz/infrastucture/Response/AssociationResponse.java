package slagalica.quiz.infrastucture.Response;

import lombok.Data;

import java.util.List;

@Data
public class AssociationResponse {

    private Long id;
    private List<String> columnA;

    private List<String> columnB;

    private List<String> columnC;

    private List<String> columnD;


}