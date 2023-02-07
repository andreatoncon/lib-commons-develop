package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.StringJoiner;

@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
@Data
public class NumericPool implements java.io.Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonAlias({"id"})
    private String id;

    @JsonAlias({"description"})
    private String description;

    @JsonAlias({"limit"})
    private Integer limit;

    @JsonAlias({"customLimit"})
    private Integer customLimit;

    @JsonAlias({"resources"})
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Resource> resources;

    @JsonProperty("isDeleted")
    private boolean isDeleted;

    @JsonAlias({"statusNumericPools"})
    private List<StatusNumericPool> statusNumericPools;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        if (customLimit != null) {
            joiner.add("customLimit: " + GraphQLRequestSerializer.getEntry(customLimit));
        }
        if (resources != null) {
            joiner.add("resources: " + GraphQLRequestSerializer.getEntry(resources));
        }
        if (statusNumericPools != null) {
            joiner.add("statusNumericPools: " + GraphQLRequestSerializer.getEntry(statusNumericPools));
        }
        return joiner.toString();
    }
}
