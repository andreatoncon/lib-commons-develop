package com.nttdata.model.tmf;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public enum ActionSchedulerStatus {

    ACTIVED("ACTIVED"),
    DEACTIVATED("DEACTIVATED");

    private final String graphqlName;

    private ActionSchedulerStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
