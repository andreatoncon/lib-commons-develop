package com.nttdata.model.tmf.Dgraph;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * ServiceOrder
 */
@JsonSerialize(using = ServiceOrder.ServiceOrderSerializer.class )
public class ServiceOrder extends com.nttdata.model.tmf.ServiceOrder  {

	public static class ServiceOrderSerializer extends JsonSerializer<ServiceOrder> {
	    @Override public void serialize(ServiceOrder value, JsonGenerator jsonGenerator, SerializerProvider provider)
	        throws IOException {
	        jsonGenerator.writeStartObject();
	        jsonGenerator.writeStringField("uid", value.getId());// dynamic field name
	        if (value.getHref() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.href", value.getHref());// dynamic field name
	        }
	        if (value.get_atType() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder._atType", value.get_atType());// dynamic field name
	        }
	        if (value.getCancellationDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format(value.getCancellationDate());
	        	jsonGenerator.writeStringField("ServiceOrder.cancellationDate", fecha);// dynamic field name
	        }
	        if (value.getCancellationReason() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.cancellationReason", value.getCancellationReason());// dynamic field name
	        }
	        if (value.getCategory() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.category", value.getCategory());// dynamic field name
	        }
	        if (value.getCompletionDate() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.completionDate", value.getCompletionDate());// dynamic field name
	        }
	        if (value.getDescription() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.description", value.getDescription());// dynamic field name
	        }
	        if (value.getExpectedCompletionDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format(value.getExpectedCompletionDate());
	        	jsonGenerator.writeStringField("ServiceOrder.expectedCompletionDate", fecha);// dynamic field name
	        }	
	        if (value.getExternalId() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.externalId", value.getExternalId());// dynamic field name
	        }
	        if (value.getNotificationContact() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.notificationContact", value.getNotificationContact());// dynamic field name
	        }
	        if (value.getOrderDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format( value.getOrderDate());
	        	jsonGenerator.writeStringField("ServiceOrder.orderDate", fecha);// dynamic field name
	        }
	        if (value.getPriority() != null) {
	        	jsonGenerator.writeStringField("ServiceOrder.priority", value.getPriority());
	        }
	        if (value.getRequestedCompletionDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format(value.getRequestedCompletionDate());
	        	jsonGenerator.writeStringField("ServiceOrder.requestedCompletionDate", fecha);
	        }
	        if (value.getRequestedStartDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format(value.getRequestedStartDate());
	        	jsonGenerator.writeStringField("ServiceOrder.requestedStartDate", fecha);
	        }
	        if (value.getStartDate() != null) {
	        	SimpleDateFormat dateFormat =
	                    new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ENGLISH);
	            String fecha = dateFormat.format(value.getStartDate());
	        	jsonGenerator.writeStringField("ServiceOrder.startDate", fecha);
	        }
	        if (value.getExternalReference() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.externalReference", value.getExternalReference());
	        }
	        if (value.getNote() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.note", value.getNote());
	        }
	        if (value.getOrderRelationship() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.orderRelationship", value.getOrderRelationship());
	        }
	        if (value.getRelatedParty() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.relatedParty", value.getRelatedParty());
	        }
	        if (value.getServiceOrderItem() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.serviceOrderItem", value.getServiceOrderItem());
	        }
	        if (value.getCancelRequest() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.cancelRequest", value.getCancelRequest());
	        }
	        if (value.getModifyRequest() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.modifyRequest", value.getModifyRequest());
	        }
	        if (value.getUpdateRequest() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.updateRequest", value.getUpdateRequest());
	        }
	        if (value.getFlowExecutionRef() != null) {
	        	jsonGenerator.writeObjectField("ServiceOrder.flowExecutionReference", value.getFlowExecutionRef());
	        }
	        
	        jsonGenerator.writeObjectField("dgraph.type", "ServiceOrder");
	        
	        jsonGenerator.writeEndObject();
	    }
	}

    }