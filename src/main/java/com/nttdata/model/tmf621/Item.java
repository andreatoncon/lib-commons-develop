package com.nttdata.model.tmf621;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
    @JsonProperty("helpText")
    private String helpText;
    @JsonProperty("enumSelectionMode")
    private String enumSelectionMode;
    @JsonProperty("selectedEnumValues")
    private String selectedEnumValues;
    @JsonProperty("checked")
    private Boolean checked;
    @JsonProperty("yesNoResponse")
    private String yesNoResponse;
    @JsonProperty("files")
    private List<FileTO> files;
    @JsonProperty("enumValues")
    private String enumValues;

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("options")
    private String options;
    @JsonProperty("valueType")
    private String valueType;
    @JsonProperty("value")
    private Object value;
    @JsonProperty("isMandatory")
    private Boolean isMandatory;
    @JsonProperty("stringValue")
    private String stringValue;
    @JsonProperty("stringMode")
    private String stringMode;

    public Item(Item element) {
        title = element.getTitle();
        type = element.getType();
        helpText = element.getHelpText();
        enumSelectionMode = element.getEnumSelectionMode();
        selectedEnumValues = element.getSelectedEnumValues();
        checked = element.getChecked();
        yesNoResponse = element.getYesNoResponse();
        files = element.getFiles();
        enumValues = element.getEnumValues();
        id = element.getId();
        name = element.getName();
        description = element.getDescription();
        options = element.getOptions();
        valueType = element.getValueType();
        value = element.getValue();
        isMandatory = element.getIsMandatory();
        stringValue = element.getStringValue();
        stringMode = element.getStringMode();
        this.files = element.getFiles();
    }

    /**
     * Method for merge an old object Item with new object Item.
     * The old data is overwritten with the new data
     *
     * @param newData new object Item type to merge
     * @return Item
     */
    public Item merge(Item newData) {
        Item item = new Item(this);
        item.setTitle((newData.getTitle() != null ? newData.getTitle() : title));
        item.setType((newData.getType() != null ? newData.getType() : type));
        item.setHelpText((newData.getHelpText() != null ? newData.getHelpText() : helpText));
        item.setEnumSelectionMode((newData.getEnumSelectionMode() != null ? newData.getEnumSelectionMode() : enumSelectionMode));
        item.setSelectedEnumValues((newData.getSelectedEnumValues() != null ? newData.getSelectedEnumValues() : selectedEnumValues));
        item.setChecked((newData.getChecked() != null ? newData.getChecked() : checked));
        item.setYesNoResponse((newData.getYesNoResponse() != null ? newData.getYesNoResponse() : yesNoResponse));
        item.setFiles((newData.getFiles() != null ? newData.getFiles() : files));
        item.setEnumValues((newData.getEnumValues() != null ? newData.getEnumValues() : enumValues));
        item.setId((newData.getId() != null ? newData.getId() : name));
        item.setName((newData.getName() != null ? newData.getName() : name));
        item.setValueType((newData.getValueType() != null ? newData.getValueType() : valueType));
        item.setDescription((newData.getDescription() != null ? newData.getDescription() : valueType));
        item.setOptions((newData.getOptions() != null ? newData.getOptions() : valueType));
        item.setValue((newData.getValue() != null ? newData.getValue() : value));
        return item;
    }
}
