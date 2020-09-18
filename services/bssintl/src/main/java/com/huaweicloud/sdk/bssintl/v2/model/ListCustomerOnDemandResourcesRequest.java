package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.QueryCustomerOnDemandResourcesReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerOnDemandResourcesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage = "zh_CN";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private QueryCustomerOnDemandResourcesReq body = null;

    public ListCustomerOnDemandResourcesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListCustomerOnDemandResourcesRequest withBody(QueryCustomerOnDemandResourcesReq body) {
        this.body = body;
        return this;
    }

    public ListCustomerOnDemandResourcesRequest withBody(Consumer<QueryCustomerOnDemandResourcesReq> bodySetter) {
        if(this.body == null ){
            this.body = new QueryCustomerOnDemandResourcesReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public QueryCustomerOnDemandResourcesReq getBody() {
        return body;
    }

    public void setBody(QueryCustomerOnDemandResourcesReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerOnDemandResourcesRequest listCustomerOnDemandResourcesRequest = (ListCustomerOnDemandResourcesRequest) o;
        return Objects.equals(this.xLanguage, listCustomerOnDemandResourcesRequest.xLanguage) &&
            Objects.equals(this.body, listCustomerOnDemandResourcesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerOnDemandResourcesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

