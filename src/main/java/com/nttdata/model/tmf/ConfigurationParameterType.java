package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public class ConfigurationParameterType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    private String externalId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private ParameterKind type;
    private String nodeType;
    private Integer index;
    private String category;
    private String rawValue;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;
    private Boolean isEditable;
    private Boolean isMandatory;
    private Boolean isDeleted;
    private Boolean isListable;
    private Boolean isPrioritary;
    private String mappingIn;
    private String mappingOut;
    @javax.validation.constraints.NotNull
    private java.util.List<ConfigParamTag> tags;
    @javax.validation.constraints.NotNull
    private java.util.List<Parameter> parameters;
    @javax.validation.constraints.NotNull
    private String resourceSpecification;

    public ConfigurationParameterType() {
    }

    public ConfigurationParameterType(String id, String externalId, String name, ParameterKind type, String nodeType, Integer index, String category, String rawValue, String stringValue, Integer intValue, Boolean booleanValue, Double floatValue, Double latitudeValue, Double longitudeValue, Double rangeFromValue, Double rangeToValue, Boolean isEditable, Boolean isMandatory, Boolean isDeleted, Boolean isListable, Boolean isPrioritary, String mappingIn, String mappingOut, java.util.List<ConfigParamTag> tags, java.util.List<Parameter> parameters, String resourceSpecification) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.type = type;
        this.nodeType = nodeType;
        this.index = index;
        this.category = category;
        this.rawValue = rawValue;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.floatValue = floatValue;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.rangeFromValue = rangeFromValue;
        this.rangeToValue = rangeToValue;
        this.isEditable = isEditable;
        this.isMandatory = isMandatory;
        this.isDeleted = isDeleted;
        this.isListable = isListable;
        this.isPrioritary = isPrioritary;
        this.mappingIn = mappingIn;
        this.mappingOut = mappingOut;
        this.tags = tags;
        this.parameters = parameters;
        this.resourceSpecification = resourceSpecification;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ParameterKind getType() {
        return type;
    }
    public void setType(ParameterKind type) {
        this.type = type;
    }

    public String getNodeType() {
        return nodeType;
    }
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getIndex() {
        return index;
    }
    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getRawValue() {
        return rawValue;
    }
    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }
    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }
    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Double getFloatValue() {
        return floatValue;
    }
    public void setFloatValue(Double floatValue) {
        this.floatValue = floatValue;
    }

    public Double getLatitudeValue() {
        return latitudeValue;
    }
    public void setLatitudeValue(Double latitudeValue) {
        this.latitudeValue = latitudeValue;
    }

    public Double getLongitudeValue() {
        return longitudeValue;
    }
    public void setLongitudeValue(Double longitudeValue) {
        this.longitudeValue = longitudeValue;
    }

    public Double getRangeFromValue() {
        return rangeFromValue;
    }
    public void setRangeFromValue(Double rangeFromValue) {
        this.rangeFromValue = rangeFromValue;
    }

    public Double getRangeToValue() {
        return rangeToValue;
    }
    public void setRangeToValue(Double rangeToValue) {
        this.rangeToValue = rangeToValue;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }
    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsListable() {
        return isListable;
    }
    public void setIsListable(Boolean isListable) {
        this.isListable = isListable;
    }

    public Boolean getIsPrioritary() {
        return isPrioritary;
    }
    public void setIsPrioritary(Boolean isPrioritary) {
        this.isPrioritary = isPrioritary;
    }

    public String getMappingIn() {
        return mappingIn;
    }
    public void setMappingIn(String mappingIn) {
        this.mappingIn = mappingIn;
    }

    public String getMappingOut() {
        return mappingOut;
    }
    public void setMappingOut(String mappingOut) {
        this.mappingOut = mappingOut;
    }

    public java.util.List<ConfigParamTag> getTags() {
        return tags;
    }
    public void setTags(java.util.List<ConfigParamTag> tags) {
        this.tags = tags;
    }

    public java.util.List<Parameter> getParameters() {
        return parameters;
    }
    public void setParameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getResourceSpecification() {
        return resourceSpecification;
    }
    public void setResourceSpecification(String resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (nodeType != null) {
            joiner.add("nodeType: " + GraphQLRequestSerializer.getEntry(nodeType));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (rawValue != null) {
            joiner.add("rawValue: " + GraphQLRequestSerializer.getEntry(rawValue));
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
        if (isEditable != null) {
            joiner.add("isEditable: " + GraphQLRequestSerializer.getEntry(isEditable));
        }
        if (isMandatory != null) {
            joiner.add("isMandatory: " + GraphQLRequestSerializer.getEntry(isMandatory));
        }
        if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }
        if (isListable != null) {
            joiner.add("isListable: " + GraphQLRequestSerializer.getEntry(isListable));
        }
        if (isPrioritary != null) {
            joiner.add("isPrioritary: " + GraphQLRequestSerializer.getEntry(isPrioritary));
        }
        if (mappingIn != null) {
            joiner.add("mappingIn: " + GraphQLRequestSerializer.getEntry(mappingIn));
        }
        if (mappingOut != null) {
            joiner.add("mappingOut: " + GraphQLRequestSerializer.getEntry(mappingOut));
        }
        if (tags != null) {
            joiner.add("tags: " + GraphQLRequestSerializer.getEntry(tags));
        }
        if (parameters != null) {
            joiner.add("parameters: " + GraphQLRequestSerializer.getEntry(parameters));
        }
        if (resourceSpecification != null) {
            joiner.add("resourceSpecification: " + GraphQLRequestSerializer.getEntry(resourceSpecification));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String externalId;
        private String name;
        private ParameterKind type;
        private String nodeType;
        private Integer index;
        private String category;
        private String rawValue;
        private String stringValue;
        private Integer intValue;
        private Boolean booleanValue;
        private Double floatValue;
        private Double latitudeValue;
        private Double longitudeValue;
        private Double rangeFromValue;
        private Double rangeToValue;
        private Boolean isEditable;
        private Boolean isMandatory;
        private Boolean isDeleted;
        private Boolean isListable;
        private Boolean isPrioritary;
        private String mappingIn;
        private String mappingOut;
        private java.util.List<ConfigParamTag> tags;
        private java.util.List<Parameter> parameters;
        private String resourceSpecification;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(ParameterKind type) {
            this.type = type;
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setRawValue(String rawValue) {
            this.rawValue = rawValue;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setIntValue(Integer intValue) {
            this.intValue = intValue;
            return this;
        }

        public Builder setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setFloatValue(Double floatValue) {
            this.floatValue = floatValue;
            return this;
        }

        public Builder setLatitudeValue(Double latitudeValue) {
            this.latitudeValue = latitudeValue;
            return this;
        }

        public Builder setLongitudeValue(Double longitudeValue) {
            this.longitudeValue = longitudeValue;
            return this;
        }

        public Builder setRangeFromValue(Double rangeFromValue) {
            this.rangeFromValue = rangeFromValue;
            return this;
        }

        public Builder setRangeToValue(Double rangeToValue) {
            this.rangeToValue = rangeToValue;
            return this;
        }

        public Builder setIsEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            return this;
        }

        public Builder setIsMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder setIsListable(Boolean isListable) {
            this.isListable = isListable;
            return this;
        }

        public Builder setIsPrioritary(Boolean isPrioritary) {
            this.isPrioritary = isPrioritary;
            return this;
        }

        public Builder setMappingIn(String mappingIn) {
            this.mappingIn = mappingIn;
            return this;
        }

        public Builder setMappingOut(String mappingOut) {
            this.mappingOut = mappingOut;
            return this;
        }

        public Builder setTags(java.util.List<ConfigParamTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setParameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceSpecification(String resourceSpecification) {
            this.resourceSpecification = resourceSpecification;
            return this;
        }


        public ConfigurationParameterType build() {
            return new ConfigurationParameterType(id, externalId, name, type, nodeType, index, category, rawValue, stringValue, intValue, booleanValue, floatValue, latitudeValue, longitudeValue, rangeFromValue, rangeToValue, isEditable, isMandatory, isDeleted, isListable, isPrioritary, mappingIn, mappingOut, tags, parameters, resourceSpecification);
        }

    }
}
