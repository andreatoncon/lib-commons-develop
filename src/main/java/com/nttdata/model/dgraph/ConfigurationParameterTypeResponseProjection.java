package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ConfigurationParameterType
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:58:08-0500"
)
public class ConfigurationParameterTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ConfigurationParameterTypeResponseProjection() {
    }

    public ConfigurationParameterTypeResponseProjection all$() {
        return all$(3);
    }

    public ConfigurationParameterTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.externalId();
        this.name();
        this.type();
        this.nodeType();
        this.index();
        this.category();
        this.rawValue();
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        this.isEditable();
        this.isMandatory();
        this.isDeleted();
        this.isListable();
        this.isPrioritary();
        this.mappingIn();
        this.mappingOut();
        if (projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ConfigParamTagResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConfigurationParameterTypeResponseProjection.ConfigParamTagResponseProjection.tags", projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ConfigParamTagResponseProjection.tags", 0) + 1);
            this.tags(new ConfigParamTagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ConfigParamTagResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ParameterResponseProjection.parameters", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConfigurationParameterTypeResponseProjection.ParameterResponseProjection.parameters", projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ParameterResponseProjection.parameters", 0) + 1);
            this.parameters(new ParameterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConfigurationParameterTypeResponseProjection.ParameterResponseProjection.parameters", 0)));
        }
        this.resourceSpecification();
        this.typename();
        return this;
    }

    public ConfigurationParameterTypeResponseProjection id() {
        return id(null);
    }

    public ConfigurationParameterTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection externalId() {
        return externalId(null);
    }

    public ConfigurationParameterTypeResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection name() {
        return name(null);
    }

    public ConfigurationParameterTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection type() {
        return type(null);
    }

    public ConfigurationParameterTypeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection nodeType() {
        return nodeType(null);
    }

    public ConfigurationParameterTypeResponseProjection nodeType(String alias) {
        fields.add(new GraphQLResponseField("nodeType").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection index() {
        return index(null);
    }

    public ConfigurationParameterTypeResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection category() {
        return category(null);
    }

    public ConfigurationParameterTypeResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection rawValue() {
        return rawValue(null);
    }

    public ConfigurationParameterTypeResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection stringValue() {
        return stringValue(null);
    }

    public ConfigurationParameterTypeResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection intValue() {
        return intValue(null);
    }

    public ConfigurationParameterTypeResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public ConfigurationParameterTypeResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection floatValue() {
        return floatValue(null);
    }

    public ConfigurationParameterTypeResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public ConfigurationParameterTypeResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public ConfigurationParameterTypeResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public ConfigurationParameterTypeResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public ConfigurationParameterTypeResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection isEditable() {
        return isEditable(null);
    }

    public ConfigurationParameterTypeResponseProjection isEditable(String alias) {
        fields.add(new GraphQLResponseField("isEditable").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection isMandatory() {
        return isMandatory(null);
    }

    public ConfigurationParameterTypeResponseProjection isMandatory(String alias) {
        fields.add(new GraphQLResponseField("isMandatory").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public ConfigurationParameterTypeResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection isListable() {
        return isListable(null);
    }

    public ConfigurationParameterTypeResponseProjection isListable(String alias) {
        fields.add(new GraphQLResponseField("isListable").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection isPrioritary() {
        return isPrioritary(null);
    }

    public ConfigurationParameterTypeResponseProjection isPrioritary(String alias) {
        fields.add(new GraphQLResponseField("isPrioritary").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection mappingIn() {
        return mappingIn(null);
    }

    public ConfigurationParameterTypeResponseProjection mappingIn(String alias) {
        fields.add(new GraphQLResponseField("mappingIn").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection mappingOut() {
        return mappingOut(null);
    }

    public ConfigurationParameterTypeResponseProjection mappingOut(String alias) {
        fields.add(new GraphQLResponseField("mappingOut").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection tags(ConfigParamTagResponseProjection subProjection) {
        return tags(null, subProjection);
    }

    public ConfigurationParameterTypeResponseProjection tags(String alias, ConfigParamTagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection parameters(ParameterResponseProjection subProjection) {
        return parameters(null, subProjection);
    }

    public ConfigurationParameterTypeResponseProjection parameters(String alias, ParameterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parameters").alias(alias).projection(subProjection));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection resourceSpecification() {
        return resourceSpecification(null);
    }

    public ConfigurationParameterTypeResponseProjection resourceSpecification(String alias) {
        fields.add(new GraphQLResponseField("resourceSpecification").alias(alias));
        return this;
    }

    public ConfigurationParameterTypeResponseProjection typename() {
        return typename(null);
    }

    public ConfigurationParameterTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
