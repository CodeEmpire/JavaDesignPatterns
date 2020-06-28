package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.builder;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class MongoDbQuery implements Query {

    private String from;
    private String where;

    @Override
    public void execute() {
        log.info(String.format("Executing mongoDbQuery from: %s where %s", from, where));
    }
}
