package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.builder;

public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();
}
