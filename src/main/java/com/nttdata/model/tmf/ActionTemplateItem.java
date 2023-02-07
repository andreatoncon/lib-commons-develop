package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public class ActionTemplateItem implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ConfigurationParameterType parameters;
    @javax.validation.constraints.NotNull
    private Parameter value;
    @JsonAlias({"isDeleted"})
    private Boolean isDeleted;
    @javax.validation.constraints.NotNull
    private ActionTemplate actionTemplate;

    public ActionTemplateItem() {
    }

    public ActionTemplateItem(String id, ConfigurationParameterType parameters, Parameter value, ActionTemplate actionTemplate) {
        this.id = id;
        this.parameters = parameters;
        this.value = value;
        this.actionTemplate = actionTemplate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ConfigurationParameterType getParameters() {
        return parameters;
    }
    public void setParameters(ConfigurationParameterType parameters) {
        this.parameters = parameters;
    }

    public Parameter getValue() {
        return value;
    }
    public void setValue(Parameter value) {
        this.value = value;
    }

    public ActionTemplate getActionTemplate() {
        return actionTemplate;
    }
    public void setActionTemplate(ActionTemplate actionTemplate) {
        this.actionTemplate = actionTemplate;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (parameters != null) {
            joiner.add("parameters: " + GraphQLRequestSerializer.getEntry(parameters));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }  if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }
        if (actionTemplate != null) {
            joiner.add("actionTemplate: " + GraphQLRequestSerializer.getEntry(actionTemplate));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private ConfigurationParameterType parameters;
        private Parameter value;
        private ActionTemplate actionTemplate;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setParameters(ConfigurationParameterType parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setValue(Parameter value) {
            this.value = value;
            return this;
        }

        public Builder setActionTemplate(ActionTemplate actionTemplate) {
            this.actionTemplate = actionTemplate;
            return this;
        }


        public ActionTemplateItem build() {
            return new ActionTemplateItem(id, parameters, value, actionTemplate);
        }

    }
}
