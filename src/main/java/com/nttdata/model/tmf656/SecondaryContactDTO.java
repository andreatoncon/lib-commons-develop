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
public class SecondaryContactDTO {

    @JsonProperty("anrede")
    @Getter
    @Setter
    private String anrede;
    @JsonProperty("vorname")
    @Getter
    @Setter
    private String vorname;
    @JsonProperty("nachname")
    @Getter
    @Setter
    private String nachname;
    @JsonProperty("telefonnummer")
    @Getter
    @Setter
    private String telefonnummer;
    @JsonProperty("mobilfunknummer")
    @Getter
    @Setter
    private String mobilfunknummer;
    @JsonProperty("kontaktaufnahmeErwuenscht")
    @Getter
    @Setter
    private Boolean kontaktaufnahmeErwuenscht;
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