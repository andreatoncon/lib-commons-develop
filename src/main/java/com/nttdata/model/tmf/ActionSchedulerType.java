package com.nttdata.model.tmf;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public enum ActionSchedulerType {

    MANUAL_EXECUTION("MANUAL_EXECUTION"),
    ONE_TIME_EXECUTION("ONE_TIME_EXECUTION"),
    PERIODICAL_EXECUTION("PERIODICAL_EXECUTION");

    private final String graphqlName;

    private ActionSchedulerType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
