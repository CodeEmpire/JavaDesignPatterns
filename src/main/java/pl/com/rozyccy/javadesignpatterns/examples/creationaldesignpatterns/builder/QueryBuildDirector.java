package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.builder;

public class QueryBuildDirector {

    public Query buildQuery(String from, String where, QueryBuilder builder) {
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
