package com.nttdata.model.dgraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.List;
import java.util.StringJoiner;

@JsonTypeName("filter")
@Data
@JsonIgnoreProperties
public class FilterRequest {
    private String id;
    private boolean isEquals = false; //refers to the equality that the filter must have for the id, taking into account that there are filters that do not have equals
    private boolean isDelete = false;
    private boolean isRemove = false;
    private boolean multipleId = false;
    private List<String> idList;
    private String request;

    private String nameId;
    private static final String FILTER = "filter: ";

    @Override
    public String toString() {
        StringJoiner joiner;

        if (isDelete) {
            joiner = new StringJoiner("");
            joiner.add(FILTER + returnFilter());
        } else if (isRemove) {
            joiner = new StringJoiner(", ", "{ ", " }");
            joiner.add(FILTER + returnFilter());
            joiner.add("remove: " + request);
        } else {
            joiner = new StringJoiner(", ", "{ ", " }");
            joiner.add(FILTER + returnFilter());
            joiner.add("set: " + request);
        }
        return joiner.toString();
    }

    public String returnFilter() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (isEquals) {
            joiner.add(nameId + ": {eq: " + GraphQLRequestSerializer.getEntry(id) + "}");
        } else {
            if(multipleId){
                joiner.add(nameId + ": " + GraphQLRequestSerializer.getEntry(idList));
            } else if (id != null) {
                joiner.add(nameId + ": " + GraphQLRequestSerializer.getEntry(id));
            }
        }
        return joiner.toString();
    }
}
