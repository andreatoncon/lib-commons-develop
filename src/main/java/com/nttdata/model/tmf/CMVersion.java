package com.nttdata.model.tmf;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-06-17T16:44:19-0500"
)
public class CMVersion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<Parameter> parameters;
    private CMVersion previous;
    private java.util.Date validFrom;
    private java.util.Date validTo;
    @javax.validation.constraints.NotNull
    private VersionStatus status;
    @javax.validation.constraints.NotNull
    private Resource resource;

    public CMVersion() {
    }

    public CMVersion(String id, java.util.List<Parameter> parameters, CMVersion previous, java.util.Date validFrom, java.util.Date validTo, VersionStatus status, Resource resource) {
        this.id = id;
        this.parameters = parameters;
        this.previous = previous;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.status = status;
        this.resource = resource;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<Parameter> getParameters() {
        return parameters;
    }
    public void setParameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public CMVersion getPrevious() {
        return previous;
    }
    public void setPrevious(CMVersion previous) {
        this.previous = previous;
    }

    public java.util.Date getValidFrom() {
        return validFrom;
    }
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }

    public java.util.Date getValidTo() {
        return validTo;
    }
    public void setValidTo(java.util.Date validTo) {
        this.validTo = validTo;
    }

    public VersionStatus getStatus() {
        return status;
    }
    public void setStatus(VersionStatus status) {
        this.status = status;
    }

    public Resource getResource() {
        return resource;
    }
    public void setResource(Resource resource) {
        this.resource = resource;
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
        if (previous != null) {
            joiner.add("previous: " + GraphQLRequestSerializer.getEntry(previous));
        }
        if (validFrom != null) {
            joiner.add("validFrom: " + GraphQLRequestSerializer.getEntry(validFrom));
        }
        if (validTo != null) {
            joiner.add("validTo: " + GraphQLRequestSerializer.getEntry(validTo));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (resource != null) {
            joiner.add("resource: " + GraphQLRequestSerializer.getEntry(resource));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private java.util.List<Parameter> parameters;
        private CMVersion previous;
        private java.util.Date validFrom;
        private java.util.Date validTo;
        private VersionStatus status;
        private Resource resource;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setParameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPrevious(CMVersion previous) {
            this.previous = previous;
            return this;
        }

        public Builder setValidFrom(java.util.Date validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder setValidTo(java.util.Date validTo) {
            this.validTo = validTo;
            return this;
        }

        public Builder setStatus(VersionStatus status) {
            this.status = status;
            return this;
        }

        public Builder setResource(Resource resource) {
            this.resource = resource;
            return this;
        }


        public CMVersion build() {
            return new CMVersion(id, parameters, previous, validFrom, validTo, status, resource);
        }

    }
}
