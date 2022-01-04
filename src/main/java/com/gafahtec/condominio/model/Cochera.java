package com.gafahtec.condominio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cochera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCochera;
    private Integer numero;
    private boolean nivel;
    


}
