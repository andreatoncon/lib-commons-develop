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
public class SupportingServiceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SupportingServiceResponseProjection() {
    }

    public SupportingServiceResponseProjection all$() {
        return all$(3);
    }

    public SupportingServiceResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public SupportingServiceResponseProjection onServiceSOM(ServiceSOMResponseProjection subProjection) {
        return onServiceSOM(null, subProjection);
    }

    public SupportingServiceResponseProjection onServiceSOM(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ServiceSOM").alias(alias).projection(subProjection));
        return this;
    }

    public SupportingServiceResponseProjection onServiceReference(ServiceReferenceResponseProjection subProjection) {
        return onServiceReference(null, subProjection);
    }

    public SupportingServiceResponseProjection onServiceReference(String alias, ServiceReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on ServiceReference").alias(alias).projection(subProjection));
        return this;
    }

    public SupportingServiceResponseProjection typename() {
        return typename(null);
    }

    public SupportingServiceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
