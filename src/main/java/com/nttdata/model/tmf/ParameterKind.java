package com.nttdata.model.tmf;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public enum ParameterKind {

    string("string"),
    Int("int"),
    bool("bool"),
    Float("float"),
    date("date"),
    Enum("enum"),
    range("range"),
    email("email"),
    gps_location("gps_location"),
    datetime_local("datetime_local");

    private final String graphqlName;

    private ParameterKind(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
