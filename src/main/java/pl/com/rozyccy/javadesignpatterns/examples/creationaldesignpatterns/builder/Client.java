package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.builder;

public class Client {
    public static void main(String[] args) {
        QueryBuildDirector director = new QueryBuildDirector();
        String from = "client table";
        String where = "client name = ...";

        QueryBuilder builder = new SqlQueryBuilder();
        Query query = director.buildQuery(from, where, builder);
        query.execute();

        builder = new MongoDbQueryBuilder();
        query = director.buildQuery(from, where, builder);
        query.execute();
    }
}
