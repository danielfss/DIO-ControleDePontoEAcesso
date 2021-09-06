package com.dio.controleAcessoPonto.model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data Substitui todos acima
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @Generated
    private long id;
    private String descricao;
}


