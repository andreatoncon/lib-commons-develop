package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-05-27T08:45:15-0500"
)
public enum ChangeItemStatus {

    CANCELLED("CANCELLED"),
    PENDING("PENDING"),
    IN_EXECUTION("IN_EXECUTION"),
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED");

    private final String graphqlName;

    private ChangeItemStatus(String graphqlName) {
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
    public static ChangeItemStatus fromValue(String graphqlName) {
        for (ChangeItemStatus b : ChangeItemStatus.values()) {
            if (b.graphqlName.equals(graphqlName)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + graphqlName + "'");
    }

}
