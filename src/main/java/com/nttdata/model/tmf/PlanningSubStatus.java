package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;

@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
public enum PlanningSubStatus {

    PROPOSED("PROPOSED"),
    FEASIBILITY_CHECKED("FEASIBILITY_CHECKED"),
    DESIGNED("DESIGNED"),
    ORDERED("ORDERED");

    private final String graphqlName;

    private PlanningSubStatus(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

    @JsonValue
    public String getValue() {
        return graphqlName;
    }

    @JsonCreator
    public static PlanningSubStatus fromValue(String graphqlName) {
        for (PlanningSubStatus b : PlanningSubStatus.values()) {
            if (b.graphqlName.equals(graphqlName)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + graphqlName + "'");
    }

}
