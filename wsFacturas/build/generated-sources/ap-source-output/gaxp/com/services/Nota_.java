package gaxp.com.services;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-04T17:20:46")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, Integer> id;
    public static volatile SingularAttribute<Nota, Double> total;
    public static volatile SingularAttribute<Nota, Date> fecha;
    public static volatile SingularAttribute<Nota, Integer> idCliente;
    public static volatile SingularAttribute<Nota, Double> baseImponible;
    public static volatile SingularAttribute<Nota, Integer> idNota;

}