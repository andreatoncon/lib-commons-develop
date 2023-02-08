package com.nttdata.model.tmf;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public enum ActionTemplateType {

    AUTOMATION_FLOW("AUTOMATION_FLOW"),
    CONFIGURATION_PARAMETER("CONFIGURATION_PARAMETER");

    private final String graphqlName;

    private ActionTemplateType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
