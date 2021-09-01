package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// 3) Бин Wood3 помечен как компонент, который конструируется через связывание по @Autowired с помощью конструктора.
@Component
public class Wood3 {

    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
