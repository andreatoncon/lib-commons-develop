package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ResourcePropertyType
 */
@Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-05-26T09:49:28-0500"
)
public class ResourcePropertyTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ResourcePropertyTypeResponseProjection() {
    }

    public ResourcePropertyTypeResponseProjection all$() {
        return all$(3);
    }

    public ResourcePropertyTypeResponseProjection all$(int maxDepth) {
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
        this.isInstanceProperty();
        this.isMandatory();
        this.isDeleted();
        if (projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.PropertyCategoryResponseProjection.propertyCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourcePropertyTypeResponseProjection.PropertyCategoryResponseProjection.propertyCategory", projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.PropertyCategoryResponseProjection.propertyCategory", 0) + 1);
            this.propertyCategory(new PropertyCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.PropertyCategoryResponseProjection.propertyCategory", 0)));
        }
        this.isListable();
        if (projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.ResourceSpecificationResponseProjection.resourceSpecification", 0) <= maxDepth) {
            projectionDepthOnFields.put("ResourcePropertyTypeResponseProjection.ResourceSpecificationResponseProjection.resourceSpecification", projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.ResourceSpecificationResponseProjection.resourceSpecification", 0) + 1);
            this.resourceSpecification(new ResourceSpecificationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ResourcePropertyTypeResponseProjection.ResourceSpecificationResponseProjection.resourceSpecification", 0)));
        }
        this.typename();
        return this;
    }

    public ResourcePropertyTypeResponseProjection id() {
        return id(null);
    }

    public ResourcePropertyTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection externalId() {
        return externalId(null);
    }

    public ResourcePropertyTypeResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection name() {
        return name(null);
    }

    public ResourcePropertyTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection type() {
        return type(null);
    }

    public ResourcePropertyTypeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection nodeType() {
        return nodeType(null);
    }

    public ResourcePropertyTypeResponseProjection nodeType(String alias) {
        fields.add(new GraphQLResponseField("nodeType").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection index() {
        return index(null);
    }

    public ResourcePropertyTypeResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection category() {
        return category(null);
    }

    public ResourcePropertyTypeResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection rawValue() {
        return rawValue(null);
    }

    public ResourcePropertyTypeResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection stringValue() {
        return stringValue(null);
    }

    public ResourcePropertyTypeResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection intValue() {
        return intValue(null);
    }

    public ResourcePropertyTypeResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public ResourcePropertyTypeResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection floatValue() {
        return floatValue(null);
    }

    public ResourcePropertyTypeResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public ResourcePropertyTypeResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public ResourcePropertyTypeResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public ResourcePropertyTypeResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public ResourcePropertyTypeResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection isEditable() {
        return isEditable(null);
    }

    public ResourcePropertyTypeResponseProjection isEditable(String alias) {
        fields.add(new GraphQLResponseField("isEditable").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection isInstanceProperty() {
        return isInstanceProperty(null);
    }

    public ResourcePropertyTypeResponseProjection isInstanceProperty(String alias) {
        fields.add(new GraphQLResponseField("isInstanceProperty").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection isMandatory() {
        return isMandatory(null);
    }

    public ResourcePropertyTypeResponseProjection isMandatory(String alias) {
        fields.add(new GraphQLResponseField("isMandatory").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public ResourcePropertyTypeResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection propertyCategory(PropertyCategoryResponseProjection subProjection) {
        return propertyCategory(null, subProjection);
    }

    public ResourcePropertyTypeResponseProjection propertyCategory(String alias, PropertyCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyCategory").alias(alias).projection(subProjection));
        return this;
    }

    public ResourcePropertyTypeResponseProjection isListable() {
        return isListable(null);
    }

    public ResourcePropertyTypeResponseProjection isListable(String alias) {
        fields.add(new GraphQLResponseField("isListable").alias(alias));
        return this;
    }

    public ResourcePropertyTypeResponseProjection resourceSpecification(ResourceSpecificationResponseProjection subProjection) {
        return resourceSpecification(null, subProjection);
    }

    public ResourcePropertyTypeResponseProjection resourceSpecification(String alias, ResourceSpecificationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resourceSpecification").alias(alias).projection(subProjection));
        return this;
    }

    public ResourcePropertyTypeResponseProjection typename() {
        return typename(null);
    }

    public ResourcePropertyTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
