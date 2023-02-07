package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PropertyCategory
 */
@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-26T09:49:28-0500"
)
public class PropertyCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PropertyCategoryResponseProjection() {
    }

    public PropertyCategoryResponseProjection all$() {
        return all$(3);
    }

    public PropertyCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.index();
        this.numberOfProperties();
        this.typename();
        return this;
    }

    public PropertyCategoryResponseProjection id() {
        return id(null);
    }

    public PropertyCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PropertyCategoryResponseProjection name() {
        return name(null);
    }

    public PropertyCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PropertyCategoryResponseProjection index() {
        return index(null);
    }

    public PropertyCategoryResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public PropertyCategoryResponseProjection numberOfProperties() {
        return numberOfProperties(null);
    }

    public PropertyCategoryResponseProjection numberOfProperties(String alias) {
        fields.add(new GraphQLResponseField("numberOfProperties").alias(alias));
        return this;
    }

    public PropertyCategoryResponseProjection typename() {
        return typename(null);
    }

    public PropertyCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
