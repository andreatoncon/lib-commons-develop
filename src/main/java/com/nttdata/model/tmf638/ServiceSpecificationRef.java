package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.net.URI;
import java.util.StringJoiner;

@JsonTypeName("ServiceSpecification")
@Data
public class ServiceSpecificationRef {


    @JsonProperty("specId")
    private Long specId;
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;

    @JsonProperty("@baseType")
    @JsonAlias({"baseType", "@baseType"})
    String baseType;

    @JsonProperty("@schemaLocation")
    @JsonAlias({"schemaLocation", "@schemaLocation"})
    URI schemaLocation;

    @JsonProperty("@type")
    @JsonAlias({"type", "@type"})
    String type;

    @JsonProperty("@referredType")
    @JsonAlias({"referredType", "@referredType"})
    String referredType;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (specId != null) {
            joiner.add("specId: " + GraphQLRequestSerializer.getEntry(specId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (href != null) {
            joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        if (referredType != null) {
            joiner.add("referredType: " + GraphQLRequestSerializer.getEntry(referredType));
        }
        if (baseType != null) {
            joiner.add("baseType: " + GraphQLRequestSerializer.getEntry(baseType));
        }
        if (schemaLocation != null) {
            joiner.add("schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (referredType != null) {
            joiner.add("referredType: " + GraphQLRequestSerializer.getEntry(referredType));
        }

        return joiner.toString();
    }


}
