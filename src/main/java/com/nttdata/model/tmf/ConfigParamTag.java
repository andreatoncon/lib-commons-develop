package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public class ConfigParamTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private java.util.List<ConfigurationParameterType> parameters;

    public ConfigParamTag() {
    }

    public ConfigParamTag(String id, String name, java.util.List<ConfigurationParameterType> parameters) {
        this.id = id;
        this.name = name;
        this.parameters = parameters;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<ConfigurationParameterType> getParameters() {
        return parameters;
    }
    public void setParameters(java.util.List<ConfigurationParameterType> parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (parameters != null) {
            joiner.add("parameters: " + GraphQLRequestSerializer.getEntry(parameters));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<ConfigurationParameterType> parameters;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setParameters(java.util.List<ConfigurationParameterType> parameters) {
            this.parameters = parameters;
            return this;
        }


        public ConfigParamTag build() {
            return new ConfigParamTag(id, name, parameters);
        }

    }
}
