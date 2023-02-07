package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-06-17T16:44:19-0500"
)
public class ActionScheduler implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private ActionSchedulerType type;
    private java.util.Date date;
    private String cron;
    private String resourceTypeName;
    private String resourceSpecificationName;
    @javax.validation.constraints.NotNull
    private java.util.List<ActionExecution> actions;
    @javax.validation.constraints.NotNull
    private ActionSchedulerStatus status;
    @javax.validation.constraints.NotNull
    private java.util.List<Resource> resources;
    @javax.validation.constraints.NotNull
    private ActionTemplate actionTemplate;

    public ActionScheduler() {
    }

    public ActionScheduler(String id, String name, String description, ActionSchedulerType type, java.util.Date date, String cron, java.util.List<ActionExecution> actions, ActionSchedulerStatus status, java.util.List<Resource> resources, ActionTemplate actionTemplate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.date = date;
        this.cron = cron;
        this.actions = actions;
        this.status = status;
        this.resources = resources;
        this.actionTemplate = actionTemplate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ActionSchedulerType getType() {
        return type;
    }

    public void setType(ActionSchedulerType type) {
        this.type = type;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public java.util.List<ActionExecution> getActions() {
        return actions;
    }

    public void setActions(java.util.List<ActionExecution> actions) {
        this.actions = actions;
    }

    public ActionSchedulerStatus getStatus() {
        return status;
    }

    public void setStatus(ActionSchedulerStatus status) {
        this.status = status;
    }

    public java.util.List<Resource> getResources() {
        return resources;
    }

    public void setResources(java.util.List<Resource> resources) {
        this.resources = resources;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (date != null) {
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(date));
        }
        if (cron != null) {
            joiner.add("cron: " + GraphQLRequestSerializer.getEntry(cron));
        }
        if (resourceTypeName != null) {
            joiner.add("resourceTypeName: " + GraphQLRequestSerializer.getEntry(resourceTypeName));
        }
        if (resourceSpecificationName != null) {
            joiner.add("resourceSpecificationName: " + GraphQLRequestSerializer.getEntry(resourceSpecificationName));
        }
        if (actions != null) {
            joiner.add("actions: " + GraphQLRequestSerializer.getEntry(actions));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (resources != null) {
            joiner.add("resources: " + GraphQLRequestSerializer.getEntry(resources));
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
        private String name;
        private String description;
        private ActionSchedulerType type;
        private java.util.Date date;
        private String cron;
        private java.util.List<ActionExecution> actions;
        private ActionSchedulerStatus status;
        private java.util.List<Resource> resources;
        private ActionTemplate actionTemplate;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setType(ActionSchedulerType type) {
            this.type = type;
            return this;
        }

        public Builder setDate(java.util.Date date) {
            this.date = date;
            return this;
        }

        public Builder setCron(String cron) {
            this.cron = cron;
            return this;
        }

        public Builder setActions(java.util.List<ActionExecution> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setStatus(ActionSchedulerStatus status) {
            this.status = status;
            return this;
        }

        public Builder setResources(java.util.List<Resource> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setActionTemplate(ActionTemplate actionTemplate) {
            this.actionTemplate = actionTemplate;
            return this;
        }


        public ActionScheduler build() {
            return new ActionScheduler(id, name, description, type, date, cron, actions, status, resources, actionTemplate);
        }

    }
}
