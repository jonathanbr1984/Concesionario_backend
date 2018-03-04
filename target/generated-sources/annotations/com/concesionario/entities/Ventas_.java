package com.concesionario.entities;

import com.concesionario.entities.Clientes;
import com.concesionario.entities.Vehiculos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-03T16:17:34")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, BigDecimal> monto;
    public static volatile SingularAttribute<Ventas, Vehiculos> idVehiculos;
    public static volatile SingularAttribute<Ventas, Integer> id;
    public static volatile SingularAttribute<Ventas, Clientes> idClientes;

}