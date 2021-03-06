package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRequestPropertiesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_id")
    
    private String serviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command_id")
    
    private Integer commandId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 10;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private Integer requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_name")
    
    private String requestName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;

    public ListRequestPropertiesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRequestPropertiesRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    


    /**
     * Get serviceId
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ListRequestPropertiesRequest withCommandId(Integer commandId) {
        this.commandId = commandId;
        return this;
    }

    


    /**
     * Get commandId
     * minimum: 0
     * maximum: 200376420520689663
     * @return commandId
     */
    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public ListRequestPropertiesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRequestPropertiesRequest withRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * Get requestId
     * minimum: 1
     * maximum: 999999999999999999
     * @return requestId
     */
    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public ListRequestPropertiesRequest withRequestName(String requestName) {
        this.requestName = requestName;
        return this;
    }

    


    /**
     * Get requestName
     * @return requestName
     */
    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public ListRequestPropertiesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRequestPropertiesRequest listRequestPropertiesRequest = (ListRequestPropertiesRequest) o;
        return Objects.equals(this.instanceId, listRequestPropertiesRequest.instanceId) &&
            Objects.equals(this.serviceId, listRequestPropertiesRequest.serviceId) &&
            Objects.equals(this.commandId, listRequestPropertiesRequest.commandId) &&
            Objects.equals(this.limit, listRequestPropertiesRequest.limit) &&
            Objects.equals(this.requestId, listRequestPropertiesRequest.requestId) &&
            Objects.equals(this.requestName, listRequestPropertiesRequest.requestName) &&
            Objects.equals(this.offset, listRequestPropertiesRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, serviceId, commandId, limit, requestId, requestName, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRequestPropertiesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

