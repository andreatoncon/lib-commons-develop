package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;

@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
public enum LifecycleStatus {

    PLANNING("PLANNING"),
    INSTALLING("INSTALLING"),
    OPERATING("OPERATING"),
    RETIRED("RETIRED");

    private final String graphqlName;

    private LifecycleStatus(String graphqlName) {
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
    public static LifecycleStatus fromValue(String graphqlName) {
        for (LifecycleStatus b : LifecycleStatus.values()) {
            if (b.graphqlName.equals(graphqlName)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + graphqlName + "'");
    }

}
