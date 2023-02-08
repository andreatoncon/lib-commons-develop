package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ErrorMessage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-07-25T15:23:31-0500"
)
public class ErrorMessageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ErrorMessageResponseProjection() {
    }

    public ErrorMessageResponseProjection all$() {
        return all$(3);
    }

    public ErrorMessageResponseProjection all$(int maxDepth) {
        this.id();
        this.code();
        this.message();
        this.reason();
        this.referenceError();
        this.status();
        this.timestamp();
        this.baseType();
        this.schemaLocation();
        this.type();
        this.typename();
        return this;
    }

    public ErrorMessageResponseProjection id() {
        return id(null);
    }

    public ErrorMessageResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection code() {
        return code(null);
    }

    public ErrorMessageResponseProjection code(String alias) {
        fields.add(new GraphQLResponseField("code").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection message() {
        return message(null);
    }

    public ErrorMessageResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection reason() {
        return reason(null);
    }

    public ErrorMessageResponseProjection reason(String alias) {
        fields.add(new GraphQLResponseField("reason").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection referenceError() {
        return referenceError(null);
    }

    public ErrorMessageResponseProjection referenceError(String alias) {
        fields.add(new GraphQLResponseField("referenceError").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection status() {
        return status(null);
    }

    public ErrorMessageResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection timestamp() {
        return timestamp(null);
    }

    public ErrorMessageResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection baseType() {
        return baseType(null);
    }

    public ErrorMessageResponseProjection baseType(String alias) {
        fields.add(new GraphQLResponseField("baseType").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection schemaLocation() {
        return schemaLocation(null);
    }

    public ErrorMessageResponseProjection schemaLocation(String alias) {
        fields.add(new GraphQLResponseField("schemaLocation").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection type() {
        return type(null);
    }

    public ErrorMessageResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ErrorMessageResponseProjection typename() {
        return typename(null);
    }

    public ErrorMessageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
