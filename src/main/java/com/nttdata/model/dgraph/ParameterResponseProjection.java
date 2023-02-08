package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Parameter
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ParameterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ParameterResponseProjection() {
    }

    public ParameterResponseProjection all$() {
        return all$(3);
    }

    public ParameterResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ParameterResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0) + 1);
            this.parameterType(new ConfigurationParameterTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ConfigurationParameterTypeResponseProjection.parameterType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ParameterResponseProjection.previous", 0) <= maxDepth) {
            projectionDepthOnFields.put("ParameterResponseProjection.ParameterResponseProjection.previous", projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ParameterResponseProjection.previous", 0) + 1);
            this.previous(new ParameterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ParameterResponseProjection.ParameterResponseProjection.previous", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ParameterResponseProjection.CMVersionResponseProjection.versionCM", 0) <= maxDepth) {
            projectionDepthOnFields.put("ParameterResponseProjection.CMVersionResponseProjection.versionCM", projectionDepthOnFields.getOrDefault("ParameterResponseProjection.CMVersionResponseProjection.versionCM", 0) + 1);
            this.versionCM(new CMVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ParameterResponseProjection.CMVersionResponseProjection.versionCM", 0)));
        }
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        this.typename();
        return this;
    }

    public ParameterResponseProjection id() {
        return id(null);
    }

    public ParameterResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ParameterResponseProjection parameterType(ConfigurationParameterTypeResponseProjection subProjection) {
        return parameterType(null, subProjection);
    }

    public ParameterResponseProjection parameterType(String alias, ConfigurationParameterTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameterType").alias(alias).projection(subProjection));
        return this;
    }

    public ParameterResponseProjection previous(ParameterResponseProjection subProjection) {
        return previous(null, subProjection);
    }

    public ParameterResponseProjection previous(String alias, ParameterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("previous").alias(alias).projection(subProjection));
        return this;
    }

    public ParameterResponseProjection versionCM(CMVersionResponseProjection subProjection) {
        return versionCM(null, subProjection);
    }

    public ParameterResponseProjection versionCM(String alias, CMVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionCM").alias(alias).projection(subProjection));
        return this;
    }

    public ParameterResponseProjection stringValue() {
        return stringValue(null);
    }

    public ParameterResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection intValue() {
        return intValue(null);
    }

    public ParameterResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public ParameterResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection floatValue() {
        return floatValue(null);
    }

    public ParameterResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public ParameterResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public ParameterResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public ParameterResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public ParameterResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public ParameterResponseProjection typename() {
        return typename(null);
    }

    public ParameterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
