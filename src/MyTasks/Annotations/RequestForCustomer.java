package MyTasks.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //правило сохраненияпомещаемого перед объявлением аннотации,
// которое предоставляет максимальную продолжительность существования аннотации.

public @interface RequestForCustomer {
    int level();
    String description();
    String date();
}
