package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronListFloatingIpsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private Boolean pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="router_id")
    
    private String routerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private String portId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ip_address")
    
    private String fixedIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_network_id")
    
    private String floatingNetworkId;

    public NeutronListFloatingIpsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public NeutronListFloatingIpsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public NeutronListFloatingIpsRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * Get pageReverse
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public NeutronListFloatingIpsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NeutronListFloatingIpsRequest withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    


    /**
     * Get floatingIpAddress
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public NeutronListFloatingIpsRequest withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    


    /**
     * Get routerId
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public NeutronListFloatingIpsRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    


    /**
     * Get portId
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public NeutronListFloatingIpsRequest withFixedIpAddress(String fixedIpAddress) {
        this.fixedIpAddress = fixedIpAddress;
        return this;
    }

    


    /**
     * Get fixedIpAddress
     * @return fixedIpAddress
     */
    public String getFixedIpAddress() {
        return fixedIpAddress;
    }

    public void setFixedIpAddress(String fixedIpAddress) {
        this.fixedIpAddress = fixedIpAddress;
    }

    public NeutronListFloatingIpsRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * Get tenantId
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NeutronListFloatingIpsRequest withFloatingNetworkId(String floatingNetworkId) {
        this.floatingNetworkId = floatingNetworkId;
        return this;
    }

    


    /**
     * Get floatingNetworkId
     * @return floatingNetworkId
     */
    public String getFloatingNetworkId() {
        return floatingNetworkId;
    }

    public void setFloatingNetworkId(String floatingNetworkId) {
        this.floatingNetworkId = floatingNetworkId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFloatingIpsRequest neutronListFloatingIpsRequest = (NeutronListFloatingIpsRequest) o;
        return Objects.equals(this.limit, neutronListFloatingIpsRequest.limit) &&
            Objects.equals(this.marker, neutronListFloatingIpsRequest.marker) &&
            Objects.equals(this.pageReverse, neutronListFloatingIpsRequest.pageReverse) &&
            Objects.equals(this.id, neutronListFloatingIpsRequest.id) &&
            Objects.equals(this.floatingIpAddress, neutronListFloatingIpsRequest.floatingIpAddress) &&
            Objects.equals(this.routerId, neutronListFloatingIpsRequest.routerId) &&
            Objects.equals(this.portId, neutronListFloatingIpsRequest.portId) &&
            Objects.equals(this.fixedIpAddress, neutronListFloatingIpsRequest.fixedIpAddress) &&
            Objects.equals(this.tenantId, neutronListFloatingIpsRequest.tenantId) &&
            Objects.equals(this.floatingNetworkId, neutronListFloatingIpsRequest.floatingNetworkId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, floatingIpAddress, routerId, portId, fixedIpAddress, tenantId, floatingNetworkId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFloatingIpsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    fixedIpAddress: ").append(toIndentedString(fixedIpAddress)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    floatingNetworkId: ").append(toIndentedString(floatingNetworkId)).append("\n");
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

