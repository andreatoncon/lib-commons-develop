package com.nttdata.model.dgraph;


import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SupportingService
 */
@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-04-07T18:13:34-0500"
)
public class SupportingResourceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SupportingResourceResponseProjection() {
    }

    public SupportingResourceResponseProjection all$() {
        return all$(3);
    }

    public SupportingResourceResponseProjection all$(int maxDepth) {
        this.__typename();
        return this;
    }

    public SupportingResourceResponseProjection __typename() {
        return __typename(null);
    }

    public SupportingResourceResponseProjection __typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    public SupportingResourceResponseProjection onResource(ResourceResponseProjection subProjection) {
        return onResource(null, subProjection);
    }

    public SupportingResourceResponseProjection onResource(String alias, ResourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Resource").alias(alias).projection(subProjection));
        return this;
    }

    public SupportingResourceResponseProjection onResourceReference(ResourceReferenceResponseProjection subProjection) {
        return onResourceReference(null, subProjection);
    }

    public SupportingResourceResponseProjection onResourceReference(String alias, ResourceReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ResourceReference").alias(alias).projection(subProjection));
        return this;
    }


}
