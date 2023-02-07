package com.nttdata.model.tmf656;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nttdata.model.tmf621.AttachmentRefOrValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "Information to report a new user complain")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerClaimsRequestDTO {

    @ApiModelProperty(example = "111111111111", value = "Additional identifier coming from an external system")
    @JsonProperty("correlationId")
    private String correlationId = null;

    @ApiModelProperty(example = "Vitroconnect", value = "Indicates where the problem was generated")
    @JsonProperty("originatingSystem")
    private String originatingSystem = null;

    @ApiModelProperty(example = "Creation", value = "Classifier for the problem")
    @JsonProperty("category")
    private String category = null;

    @ApiModelProperty(example = "test", value = "Free form text describing the Service Problem")
    @JsonProperty("description")
    @NotBlank
    private String description;

    @ApiModelProperty(example = "", value = "Indicates if this service problem has been escalated or not")
    @JsonProperty("problemEscalation")
    private String problemEscalation = null;

    @ApiModelProperty(example = "2011-10-02 18:48:05.123456", value = "Time the problem was raised")
    @JsonProperty("timeRaised")
    private String timeRaised = null;

    @ApiModelProperty(example = "", value = "Time the problem was last status changed")
    @JsonProperty("statusChangeDate")
    private String statusChangeDate = null;

    @ApiModelProperty(example = "", value = "The reason of state change")
    @JsonProperty("statusChangeReason")
    private String statusChangeReason = null;

    @ApiModelProperty(example = "", value = "The current status of the service problem")
    @JsonProperty("status")
    private String status = null;

    @ApiModelProperty(example = "1", value = "Number of affected services")
    @JsonProperty("affectedServiceNumber")
    private String affectedServiceNumber = null;

    @ApiModelProperty(example = "O2", value = "Person or organization that created the problem")
    @JsonProperty("originatorParty")
    private String originatorParty = null;

    @ApiModelProperty(example = "1505", value = "List of affected services")
    @JsonProperty("affectedService")
    private String affectedService = null;

    @ApiModelProperty(allowEmptyValue = true, value = "A generic list of any type of elements")
    @JsonProperty("extensionInfo")
    private List<ExtensionInfoDTO> extensionInfo = null;
    
    @ApiModelProperty(allowEmptyValue = true, value = "Array of B64 encode files")
    @JsonProperty("attachment")
    private List<AttachmentRefOrValue> attachment = null;

}
