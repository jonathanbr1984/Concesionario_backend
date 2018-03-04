package com.concesionario.entities;

import com.concesionario.entities.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-03T16:17:34")
@StaticMetamodel(Vehiculos.class)
public class Vehiculos_ { 

    public static volatile SingularAttribute<Vehiculos, String> marca;
    public static volatile SingularAttribute<Vehiculos, BigDecimal> valor;
    public static volatile ListAttribute<Vehiculos, Ventas> ventasList;
    public static volatile SingularAttribute<Vehiculos, Integer> id;
    public static volatile SingularAttribute<Vehiculos, String> modelo;

}