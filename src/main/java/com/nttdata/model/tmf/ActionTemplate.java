package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-06-17T16:44:19-0500"
)
public class ActionTemplate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private ActionTemplateType type;
    @JsonAlias({"isDeleted"})
    private Boolean isDeleted;
    @javax.validation.constraints.NotNull
    private String resourceSpecifications;
    @javax.validation.constraints.NotNull
    private java.util.List<ActionTemplateItem> actionTemplateItems;
    @javax.validation.constraints.NotNull
    private java.util.List<ActionExecution> actionExecutions;


    public ActionTemplate() {
    }

    public ActionTemplate(String id, String name, ActionTemplateType type, String resourceSpecifications, java.util.List<ActionTemplateItem> actionTemplateItem) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.resourceSpecifications = resourceSpecifications;
        this.actionTemplateItems = actionTemplateItem;
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

    public ActionTemplateType getType() {
        return type;
    }

    public void setType(ActionTemplateType type) {
        this.type = type;
    }

    public String getResourceSpecifications() {
        return resourceSpecifications;
    }

    public void setResourceSpecifications(String resourceSpecifications) {
        this.resourceSpecifications = resourceSpecifications;
    }

    public java.util.List<ActionTemplateItem> getActionTemplateItem() {
        return actionTemplateItems;
    }

    public void setActionTemplateItem(java.util.List<ActionTemplateItem> actionTemplateItem) {
        this.actionTemplateItems = actionTemplateItem;
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
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }
        if (resourceSpecifications != null) {
            joiner.add("resourceSpecifications: " + GraphQLRequestSerializer.getEntry(resourceSpecifications));
        }
        if (actionTemplateItems != null) {
            joiner.add("actionTemplateItems: " + GraphQLRequestSerializer.getEntry(actionTemplateItems));
        }
        if (actionExecutions != null) {
            joiner.add("actionExecutions: " + GraphQLRequestSerializer.getEntry(actionExecutions));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private ActionTemplateType type;
        private String resourceSpecifications;
        private java.util.List<ActionTemplateItem> actionTemplateItem;

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

        public Builder setType(ActionTemplateType type) {
            this.type = type;
            return this;
        }

        public Builder setResourceSpecifications(String resourceSpecifications) {
            this.resourceSpecifications = resourceSpecifications;
            return this;
        }

        public Builder setActionTemplateItem(java.util.List<ActionTemplateItem> actionTemplateItem) {
            this.actionTemplateItem = actionTemplateItem;
            return this;
        }


        public ActionTemplate build() {
            return new ActionTemplate(id, name, type, resourceSpecifications, actionTemplateItem);
        }

    }
}
