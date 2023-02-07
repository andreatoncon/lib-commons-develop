package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf.Characteristic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.StringJoiner;

/**
 * ServiceRelationship
 */

@JsonTypeName("ServiceRelationship")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRelationship /*extends BaseNode*/ {

    protected String id;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("service")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Service service;

    @JsonProperty("services")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Service> services;

    @JsonProperty("serviceRelationshipCharacteristic")
    private List<Characteristic> serviceRelationshipCharacteristic;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (relationshipType != null) {
            joiner.add("relationshipType: " + GraphQLRequestSerializer.getEntry(relationshipType));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        if (service != null) {
            joiner.add("service: " + GraphQLRequestSerializer.getEntry(service));
        }
        if (serviceRelationshipCharacteristic != null) {
            joiner.add("serviceRelationshipCharacteristic: " + GraphQLRequestSerializer.getEntry(serviceRelationshipCharacteristic));
        }

        return joiner.toString();
    }

}