package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public class Parameter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ConfigurationParameterType parameterType;
    private Parameter previous;
    @javax.validation.constraints.NotNull
    private java.util.List<CMVersion> versionCM;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;

    public Parameter() {
    }

    public Parameter(String id, ConfigurationParameterType parameterType, Parameter previous, java.util.List<CMVersion> versionCM, String stringValue, Integer intValue, Boolean booleanValue, Double floatValue, Double latitudeValue, Double longitudeValue, Double rangeFromValue, Double rangeToValue) {
        this.id = id;
        this.parameterType = parameterType;
        this.previous = previous;
        this.versionCM = versionCM;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.floatValue = floatValue;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.rangeFromValue = rangeFromValue;
        this.rangeToValue = rangeToValue;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationParameterType getParameterType() {
        return parameterType;
    }
    public void setParameterType(ConfigurationParameterType parameterType) {
        this.parameterType = parameterType;
    }

    public Parameter getPrevious() {
        return previous;
    }
    public void setPrevious(Parameter previous) {
        this.previous = previous;
    }

    public java.util.List<CMVersion> getVersionCM() {
        return versionCM;
    }
    public void setVersionCM(java.util.List<CMVersion> versionCM) {
        this.versionCM = versionCM;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (parameterType != null) {
            joiner.add("parameterType: " + GraphQLRequestSerializer.getEntry(parameterType));
        }
        if (previous != null) {
            joiner.add("previous: " + GraphQLRequestSerializer.getEntry(previous));
        }
        if (versionCM != null) {
            joiner.add("versionCM: " + GraphQLRequestSerializer.getEntry(versionCM));
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
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private ConfigurationParameterType parameterType;
        private Parameter previous;
        private java.util.List<CMVersion> versionCM;
        private String stringValue;
        private Integer intValue;
        private Boolean booleanValue;
        private Double floatValue;
        private Double latitudeValue;
        private Double longitudeValue;
        private Double rangeFromValue;
        private Double rangeToValue;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setParameterType(ConfigurationParameterType parameterType) {
            this.parameterType = parameterType;
            return this;
        }

        public Builder setPrevious(Parameter previous) {
            this.previous = previous;
            return this;
        }

        public Builder setVersionCM(java.util.List<CMVersion> versionCM) {
            this.versionCM = versionCM;
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


        public Parameter build() {
            return new Parameter(id, parameterType, previous, versionCM, stringValue, intValue, booleanValue, floatValue, latitudeValue, longitudeValue, rangeFromValue, rangeToValue);
        }

    }
}
