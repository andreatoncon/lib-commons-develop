package com.nttdata.model.tmf640;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf.SupportingResource;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Service reference, for when Service is used by other entities
 */
@ApiModel(description = "Service reference, for when Service is used by other entities")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-25T14:06:01.043Z")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ServiceRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("supportingResource")
  private List<SupportingResource> supportingResource;

  @JsonProperty("specificationName")
  private String specificationName;
  @JsonProperty("externalId")
  private String externalId;
  @JsonProperty("specificationId")
  private String specificationId;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;


  @Override
  public String toString() {
    StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

    if (id != null) {
      joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
    }
    if (href != null) {
      joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
    }
    if (name != null) {
      joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
    }
    if (supportingResource != null) {
      joiner.add("supportingResource: " + GraphQLRequestSerializer.getEntry(supportingResource));
    }
    if (specificationName != null) {
      joiner.add("specificationName: " + GraphQLRequestSerializer.getEntry(specificationName));
    }
    if (externalId != null) {
      joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
    }
    if (specificationId != null) {
      joiner.add("specificationId: " + GraphQLRequestSerializer.getEntry(specificationId));
    }
    if (baseType != null) {
      joiner.add("baseType: " + GraphQLRequestSerializer.getEntry(baseType));
    }
    if (schemaLocation != null) {
      joiner.add("schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
    }
    if (type != null) {
      joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
    }
    if (referredType != null) {
      joiner.add("referredType: " + GraphQLRequestSerializer.getEntry(referredType));
    }
    return joiner.toString();
  }

}

