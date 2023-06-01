package com.cadastro.GIP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ControlID")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    String idGip;
    String produto;

}
