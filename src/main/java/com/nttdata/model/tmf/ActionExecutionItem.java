package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-06-17T16:44:19-0500"
)
public class ActionExecutionItem implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ActionExecution action;
    @javax.validation.constraints.NotNull
    private java.util.List<Resource> resources;
    private ActionExecutionItemStatus status;
    private ChangeItem changeItem;

    public ActionExecutionItem() {
    }

    public ActionExecutionItem(String id, ActionExecution action, java.util.List<Resource> resources, ActionExecutionItemStatus status, ChangeItem changeItem) {
        this.id = id;
        this.action = action;
        this.resources = resources;
        this.status = status;
        this.changeItem = changeItem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionExecution getAction() {
        return action;
    }

    public void setAction(ActionExecution action) {
        this.action = action;
    }

    public java.util.List<Resource> getResources() {
        return resources;
    }

    public void setResources(java.util.List<Resource> resources) {
        this.resources = resources;
    }

    public ActionExecutionItemStatus getStatus() {
        return status;
    }

    public void setStatus(ActionExecutionItemStatus status) {
        this.status = status;
    }

    public void setChangeItem(ChangeItem changeItem) {
        this.changeItem = changeItem;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (action != null) {
            joiner.add("action: " + GraphQLRequestSerializer.getEntry(action));
        }
        if (resources != null) {
            joiner.add("resources: " + GraphQLRequestSerializer.getEntry(resources));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (changeItem != null) {
            joiner.add("changeItem: " + GraphQLRequestSerializer.getEntry(changeItem));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private ActionExecution action;
        private java.util.List<Resource> resources;
        private ActionExecutionItemStatus status;
        private ChangeItem changeItem;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAction(ActionExecution action) {
            this.action = action;
            return this;
        }

        public Builder setResources(java.util.List<Resource> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setStatus(ActionExecutionItemStatus status) {
            this.status = status;
            return this;

        }

        public Builder setChangeItem(ChangeItem changeItem) {
            this.changeItem = changeItem;
            return this;
        }


        public ActionExecutionItem build() {
            return new ActionExecutionItem(id, action, resources, status, changeItem);
        }

    }
}
