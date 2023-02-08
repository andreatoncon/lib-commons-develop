package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.List;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
@Data
public class StatusNumericPool {


    @javax.validation.constraints.NotNull
    private String id;
    private NumericPool numericPool;
    private UsageSubStatus status;
    @javax.validation.constraints.NotNull
    private String values;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (numericPool != null) {
            joiner.add("numericPool: " + GraphQLRequestSerializer.getEntry(numericPool));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (values != null) {
            joiner.add("values: " + GraphQLRequestSerializer.getEntry(values));
        }
        return joiner.toString();
    }
}
