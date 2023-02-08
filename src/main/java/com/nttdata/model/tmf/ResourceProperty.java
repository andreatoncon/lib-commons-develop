package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.Data;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-27T08:45:15-0500"
)
@Data
public class ResourceProperty {

    @javax.validation.constraints.NotNull
    private String id;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;
    private String rawValue;
    private Resource resource;
    @javax.validation.constraints.NotNull
    private String resourcePropertyType;

    private Boolean isMandatory;
    private Boolean isInstanceProperty;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (stringValue != null) {
            joiner.add("stringValue: " + GraphQLRequestSerializer.getEntry(stringValue));
        }
        if (intValue != null) {
            joiner.add("intValue: " + GraphQLRequestSerializer.getEntry(intValue));
        }
        if (booleanValue != null) {
            joiner.add("booleanValue: " + GraphQLRequestSerializer.getEntry(booleanValue));
        }
        if (floatValue != null) {
            joiner.add("floatValue: " + GraphQLRequestSerializer.getEntry(floatValue));
        }
        if (latitudeValue != null) {
            joiner.add("latitudeValue: " + GraphQLRequestSerializer.getEntry(latitudeValue));
        }
        if (longitudeValue != null) {
            joiner.add("longitudeValue: " + GraphQLRequestSerializer.getEntry(longitudeValue));
        }
        if (rangeFromValue != null) {
            joiner.add("rangeFromValue: " + GraphQLRequestSerializer.getEntry(rangeFromValue));
        }
        if (rangeToValue != null) {
            joiner.add("rangeToValue: " + GraphQLRequestSerializer.getEntry(rangeToValue));
        }
        if (rawValue != null) {
            joiner.add("rawValue: " + GraphQLRequestSerializer.getEntry(rawValue));
        }
        if (resource != null) {
            joiner.add("resource: " + GraphQLRequestSerializer.getEntry(resource));
        }
        if (resourcePropertyType != null) {
            joiner.add("resourcePropertyType: " + GraphQLRequestSerializer.getEntry(resourcePropertyType));
        }

        if (isMandatory != null) {
            joiner.add("isMandatory: " + GraphQLRequestSerializer.getEntry(isMandatory));
        }

        if (isInstanceProperty != null) {
            joiner.add("isInstanceProperty: " + GraphQLRequestSerializer.getEntry(isInstanceProperty));
        }
        return joiner.toString();
    }
}
