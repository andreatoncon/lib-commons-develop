package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.StringJoiner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage {

    @JsonProperty("id")
    @javax.validation.constraints.NotNull
    private String id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("referenceError")
    private String referenceError;
    @JsonProperty("status")
    private String status;
    @JsonProperty("timestamp")
    private LocalDateTime timestamp;
    @JsonProperty("@baseType")
    @JsonAlias({"baseType", "@baseType"})
    String baseType;

    @JsonProperty("@schemaLocation")
    @JsonAlias ({"schemaLocation", "@schemaLocation"})
    URI schemaLocation;

    @JsonProperty("@type")
    @JsonAlias ({"type", "@type"})
    String type;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (code != null) {
            joiner.add("code: " + GraphQLRequestSerializer.getEntry(code));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (reason != null) {
            joiner.add("reason: " + GraphQLRequestSerializer.getEntry(reason));
        }
        if (referenceError != null) {
            joiner.add("referenceError: " + GraphQLRequestSerializer.getEntry(referenceError));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (timestamp != null) {
            joiner.add("timestamp: \"" + GraphQLRequestSerializer.getEntry(timestamp)+ "\"");
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
        return joiner.toString();
    }
}
