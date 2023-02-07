package com.nttdata.model.tmf656;

import java.util.Date;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "Response to report a new user complain")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerClaimsResponseDTO {
	
	
    @ApiModelProperty(value = "universal unique identifier")
    private String uuid;
    @ApiModelProperty(value = "Identifier of the type of event to handle the lifecycle of the alarms")
    //mapped to x1
    private String eventType;
    @ApiModelProperty(value = "Identifier of the type of alarm coming from the NMS")
    private String alarmTypeId;
    @ApiModelProperty(value = "Descriptive name of the alarm according to the NMS")
    //mapped to category
    private String alarmTypeName;
    @ApiModelProperty(value = "Problem reported by the NMS")
    //mapped to description
    private String specificProblem;
    @ApiModelProperty(value = "Network element type of the event generated")
    private String alarmedObjectType;
    @ApiModelProperty(value = "Name of the Network element of the event generated")
    private String alarmedObjectName;
    @ApiModelProperty(value = "Network element identifier of the event generated")
    private String alarmedObjectId;
    @ApiModelProperty(value = "Name of the vendor of the NMS")
    private String vendorName;
    @ApiModelProperty(value = "Detailed information of the alarm")
    private String alarmDetail;
    @ApiModelProperty(value = "Timestamp when the event occurred in the source network element")
    //mapped to timeRaised
    private Date alarmRaisedTime;
    @ApiModelProperty(value = "Timestamp when a status change occurred for the event last time")
    private Date alarmChangedTime;
    @ApiModelProperty(value = "Timestamp when the clearing of an alarm was received")
    private Date alarmClearedTime;
    @ApiModelProperty(value = "Network management system that is source of the alarm")
    //mapped to originatingSystem
    private String sourceSystem;
    @ApiModelProperty(value = "Identifier of the alarm in the source system")
    //mapped correlationId
    private String externalAlarmId;
    @ApiModelProperty(value = "Indicates if an alarm has been acknowledged or not")
    private String ackState;
    @ApiModelProperty(value = "Last user that acknowledge an alarm")
    private String ackUser;
    @ApiModelProperty(value = "Severity assigned to the alarm. Its possible values are:1 – Indeterminate\n" +
            "        2 – Critical\n" +
            "        3 – Major\n" +
            "        4 – Minor\n" +
            "        5 – Warning\n" +
            "        6 - Cleared")
    private EnumState perceivedSeverity;
    @ApiModelProperty(value = "Indicates if the alarm affects service or not")
    //mapped to affectedService
    private String serviceAffecting;
    @ApiModelProperty(value = "Information of the probable cause of the event")
    private String probableCause;
    @ApiModelProperty(value = "Timestamp when the alarm was received in the NMS")
    private Date alarmOSSCreatedTime;
    @ApiModelProperty(value = "User that cleared the event")
    private String clearUser;
    @ApiModelProperty(value = "Name of the affected service")
    private String affectedServiceName;
    @ApiModelProperty(value = "Identifier or the network type source of the alarm")
    private String networkType;
    @ApiModelProperty(value = "Extra information related to the event being handled to be used during the processing process")
  /* mapped to
      extensionInfo
      private
      problemEscalation
      statusChangeDate
      statusChangeReason
      status
   */
    private Map<String, Object> additionalInformation;
    @ApiModelProperty(value = "Original message of the source system")
    //mapped to Complete body of the  incoming message
    private String properties;


}