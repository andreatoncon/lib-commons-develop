package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.nttdata.model.tmf.*;
import com.nttdata.model.tmf640.ServiceRef;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringJoiner;

@Data
public class SupportingService {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("@type")
    @JsonAlias({"__typename", "@type"})
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Service serviceSOMRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ServiceRef serviceReference;

    private String id;
    private String href;
    private String category;
    private String description;
    private Boolean hasStarted;
    private Boolean isBundle;
    private Boolean isServiceEnabled;
    private Boolean isStateful;
    private String name;
    private String state;
    private Date startDate;
    private String serviceType;
    private StartMode startMode;


    private List<Characteristic> serviceCharacteristic;
    private String relationshipType;

    private Date serviceDate;
    private Date endDate;


    private List<Feature> feature;
    private List<Party> relatedParty;
    private List<Note> note;
    private List<SupportingResource> supportingResource;
    private List<ServiceRelationship> serviceRelationship;
    private ServiceSpecificationRef serviceSpecification;
    private List<RelatedEntity> relatedEntity;
    private List<Place> place;
    private List<Service> supportingService;
    private String externalId;

    private String specificationId;
    private String specificationName;


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");

        if (type == null) {
            if (serviceSOMRef != null) {
                joiner.add("serviceSOMRef: " + GraphQLRequestSerializer.getEntry(serviceSOMRef));
            }
            if (serviceReference != null) {
                joiner.add("serviceReferenceRef: " + GraphQLRequestSerializer.getEntry(serviceReference));
            }
        } else {
            if (id != null) {
                joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
            }
            if (category != null) {
                joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
            }
            if (description != null) {
                joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
            }
            if (endDate != null) {
                joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
            }
            if (hasStarted != null) {
                joiner.add("hasStarted: " + GraphQLRequestSerializer.getEntry(hasStarted));
            }
            if (isBundle != null) {
                joiner.add("isBundle: " + GraphQLRequestSerializer.getEntry(isBundle));
            }
            if (isServiceEnabled != null) {
                joiner.add("isServiceEnabled: " + GraphQLRequestSerializer.getEntry(isServiceEnabled));
            }
            if (isStateful != null) {
                joiner.add("isStateful: " + GraphQLRequestSerializer.getEntry(isStateful));
            }
            if (name != null) {
                joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
            }

            if (serviceDate != null) {
                SimpleDateFormat dateFormat =
                        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
                String date = dateFormat.format(serviceDate);
                joiner.add("serviceDate: " + GraphQLRequestSerializer.getEntry(date));
            }

            if (serviceType != null) {
                joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
            }
            if (startDate != null) {
                joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
            }
            if (startMode != null) {
                joiner.add("startMode: " + GraphQLRequestSerializer.getEntry(startMode));
            }
            if (state != null) {
                joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
            }

            if (feature != null) {
                joiner.add("feature: " + GraphQLRequestSerializer.getEntry(feature));
            }
            if (note != null) {
                joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
            }
            if (place != null) {
                joiner.add("place: " + GraphQLRequestSerializer.getEntry(place));
            }
            if (relatedEntity != null) {
                joiner.add("relatedEntity: " + GraphQLRequestSerializer.getEntry(relatedEntity));
            }
            if (relatedParty != null) {
                joiner.add("relatedParty: " + GraphQLRequestSerializer.getEntry(relatedParty));
            }
            if (serviceCharacteristic != null) {
                joiner.add("serviceCharacteristic: " + GraphQLRequestSerializer.getEntry(serviceCharacteristic));
            }
		/*
		if (serviceOrderItem != null) {
			joiner.add("serviceOrderItem: "
					+ GraphQLRequestSerializer.getEntry(serviceOrderItem));
		}
		 */
            if (serviceRelationship != null) {
                joiner.add("serviceRelationship: "
                        + GraphQLRequestSerializer.getEntry(serviceRelationship));
            }
            if (serviceSpecification != null) {
                joiner.add("serviceSpecification: "
                        + GraphQLRequestSerializer.getEntry(serviceSpecification));
            }
            if (supportingResource != null) {
                joiner.add(
                        "supportingResource: " + GraphQLRequestSerializer.getEntry(supportingResource));
            }
            if (supportingService != null) {
                joiner.add(
                        "supportingService: " + GraphQLRequestSerializer.getEntry(supportingService));
            }

            // The following fields are not found in the TMF638
            if (externalId != null) {
                joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
            }
            if (getType() != null) {
                joiner.add("type: " + GraphQLRequestSerializer.getEntry(getType()));
            }
            if (href != null) {
                joiner.add("href: " + GraphQLRequestSerializer.getEntry(href));
            }
            if (specificationId != null) {
                joiner.add("specificationId: " + GraphQLRequestSerializer.getEntry(specificationId));
            }
            if (specificationName != null) {
                joiner.add("specificationName: " + GraphQLRequestSerializer.getEntry(specificationName));
            }
        }
        return joiner.toString();
    }
}
