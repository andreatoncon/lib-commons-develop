package com.nttdata.model.tmf621;

import java.util.StringJoiner;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf621.EquipmentTO.Builder;

public class NamedNode {
	
	  private String id;
	  private String name;
	  
	  public NamedNode() {
	    }

	    public NamedNode(String id, String name) {
	        this.id = id;
	        this.name = name;

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
	    
	    
	    @Override
	    public String toString() {
	        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
	        if (id != null) {
	            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
	        }
	        if (name != null) {
	            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
	        }

	        return joiner.toString();
	    }

	    public static Builder builder() {
	        return new Builder();
	    }
	    
	    
	    public static class Builder {

	        private String id;
	        private String name;
	   

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

	        public NamedNode build() {
	            return new NamedNode(id,  name);
	        }
	    }
}
