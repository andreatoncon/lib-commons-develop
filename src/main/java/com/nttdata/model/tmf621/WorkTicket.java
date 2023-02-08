package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class WorkTicket {
	
    @JsonProperty("id")
    protected String id;

    @JsonProperty("href")
    protected String href;

    @JsonProperty("creationDate")
    protected String creationDate;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("expectedResolutionDate")
    protected String expectedResolutionDate;

    @JsonProperty("externalId")
    protected String externalId;

    @JsonProperty("lastUpdate")
    protected String lastUpdate;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("priority")
    protected String priority;

    @JsonProperty("requestedResolutionDate")
    protected String requestedResolutionDate;

    @JsonProperty("resolutionDate")
    protected String resolutionDate;

    @JsonProperty("severity")
    protected String severity;

    @JsonProperty("statusChangeDate")
    protected String statusChangeDate;

    @JsonProperty("statusChangeReason")
    protected String statusChangeReason;

    @JsonProperty("ticketType")
    protected String ticketType;

    @JsonProperty("attachment")
    protected List<AttachmentRefOrValue> attachment;

    @JsonProperty("channel")
    protected ChannelRef channel;

    @JsonProperty("characteristic")
    protected List<Characteristic> characteristic;

    @JsonProperty("checkList")
    protected List<CheckList> checkList;

    @JsonProperty("note")
    protected List<Note> note;

    @JsonProperty("relatedEntity")
    protected List<RelatedEntity> relatedEntity;

    @JsonProperty("relatedParty")
    protected List<RelatedParty> relatedParty;

    @JsonProperty("status")
    protected WorkTicketStatusType status;

    @JsonProperty("statusChange")
    protected List<StatusChange> statusChange;

    @JsonProperty("workTicketRelationship")
    protected List<WorkTicketRelationship> workTicketRelationship;

    @JsonProperty("@baseType")
    protected String _atBaseType;

    @JsonProperty("@schemaLocation")
    protected String _atSchemaLocation;

    @JsonProperty("@type")
    protected String _atType;
}
