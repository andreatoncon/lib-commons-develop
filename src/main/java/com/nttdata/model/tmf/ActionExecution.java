package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2022-06-17T16:44:19-0500"
)
public class ActionExecution implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    private ActionScheduler scheduler;
    @javax.validation.constraints.NotNull
    private ActionTemplate template;
    private java.util.List<ActionExecutionItem> items;
    @javax.validation.constraints.NotNull
    private java.util.Date starTime;
    private java.util.Date endTime;

    public ActionExecution() {
    }

    public ActionExecution(String id, ActionScheduler scheduler, ActionTemplate template, java.util.List<ActionExecutionItem> items, java.util.Date starTime, java.util.Date endTime) {
        this.id = id;
        this.scheduler = scheduler;
        this.template = template;
        this.items = items;
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionScheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(ActionScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public ActionTemplate getTemplate() {
        return template;
    }

    public void setTemplate(ActionTemplate template) {
        this.template = template;
    }

    public java.util.List<ActionExecutionItem> getItems() {
        return items;
    }

    public void setItems(java.util.List<ActionExecutionItem> items) {
        this.items = items;
    }

    public java.util.Date getStarTime() {
        return starTime;
    }

    public void setStarTime(java.util.Date starTime) {
        this.starTime = starTime;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (scheduler != null) {
            joiner.add("scheduler: " + GraphQLRequestSerializer.getEntry(scheduler));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        if (items != null) {
            joiner.add("items: " + GraphQLRequestSerializer.getEntry(items));
        }
        if (starTime != null) {
            joiner.add("starTime: " + GraphQLRequestSerializer.getEntry(starTime));
        }
        if (endTime != null) {
            joiner.add("endTime: " + GraphQLRequestSerializer.getEntry(endTime));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private ActionScheduler scheduler;
        private ActionTemplate template;
        private java.util.List<ActionExecutionItem> items;
        private java.util.Date starTime;
        private java.util.Date endTime;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setScheduler(ActionScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder setTemplate(ActionTemplate template) {
            this.template = template;
            return this;
        }

        public Builder setItems(java.util.List<ActionExecutionItem> items) {
            this.items = items;
            return this;
        }

        public Builder setStarTime(java.util.Date starTime) {
            this.starTime = starTime;
            return this;
        }

        public Builder setEndTime(java.util.Date endTime) {
            this.endTime = endTime;
            return this;
        }


        public ActionExecution build() {
            return new ActionExecution(id, scheduler, template, items, starTime, endTime);
        }

    }
}
