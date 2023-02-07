package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.StringJoiner;

@JsonTypeName("ResourceReference")
@Data
public class ResourceReference {

    @javax.validation.constraints.NotNull
    @JsonAlias({"id"})
    private String id;
    private String externalId;
    private String href;
    private String type;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }
}
