package com.nttdata.model.tmf656;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class ExtensionInfoDTO {

    @JsonProperty("homeId")
    @Getter
    @Setter
    private String homeId;

    @JsonProperty("datum")
    @Getter
    @Setter
    private String datum;

    @JsonProperty("zeitfenster")
    @Getter
    @Setter
    private String zeitfenster;

    @JsonProperty("stoerungsNrAuftraggeber")
    @Getter
    @Setter
    private String stoerungsNrAuftraggeber;

    @JsonProperty("stoerungsNrLeistungserbringer")
    @Getter
    @Setter
    private String stoerungsNrLeistungserbringer;

    @JsonProperty("reklamationsgrund")
    @Getter
    @Setter
    private String reklamationsgrund;

    @JsonProperty("mainContact")
    @Getter
    @Setter
    private MainContactDTO mainContactDTO;

    @JsonProperty("secondaryContact")
    @Getter
    @Setter
    private SecondaryContactDTO secondaryContactDTO;

    @JsonProperty("vertragsnummer")
    @Getter
    @Setter
    private String vertragsnummer;

    @JsonProperty("lineId")
    @Getter
    @Setter
    private String lineId;
    
    @JsonProperty("OLT")
    @Getter
    @Setter
    private String olt;

    @JsonProperty("externalID")
    @Getter
    @Setter
    private String externalID;

    @JsonProperty("beesionId")
    @Getter
    @Setter
    private String beesionId;

    @JsonProperty("spriDesc")
    @Getter
    @Setter
    private String spriDesc;
    
    @JsonProperty("atType")
    @Getter
    @Setter
    private String atType;
    
    @JsonProperty("expectedResolutionDate")
    @Getter
    @Setter
    private String expectedResolutionDate;
    
    @JsonProperty("priority")
    @Getter
    @Setter
    private String priority;

    @JsonProperty("requestedResolutionDate")
    @Getter
    @Setter
    private String requestedResolutionDate;
    
    @JsonProperty("severity")
    @Getter
    @Setter
    private String severity;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}