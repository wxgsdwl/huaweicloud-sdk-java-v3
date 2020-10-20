package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateLoadbalancerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private CreateLoadbalancerV2Req loadbalancer = null;

    public CreateLoadbalancerRequestBody withLoadbalancer(CreateLoadbalancerV2Req loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public CreateLoadbalancerRequestBody withLoadbalancer(Consumer<CreateLoadbalancerV2Req> loadbalancerSetter) {
        if(this.loadbalancer == null ){
            this.loadbalancer = new CreateLoadbalancerV2Req();
            loadbalancerSetter.accept(this.loadbalancer);
        }
        
        return this;
    }


    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public CreateLoadbalancerV2Req getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(CreateLoadbalancerV2Req loadbalancer) {
        this.loadbalancer = loadbalancer;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLoadbalancerRequestBody createLoadbalancerRequestBody = (CreateLoadbalancerRequestBody) o;
        return Objects.equals(this.loadbalancer, createLoadbalancerRequestBody.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerRequestBody {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
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

