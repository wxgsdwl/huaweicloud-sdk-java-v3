package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.QuerySampleParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSampleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fill_value")
    
    private String fillValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private QuerySampleParam body = null;

    public ListSampleRequest withFillValue(String fillValue) {
        this.fillValue = fillValue;
        return this;
    }

    


    /**
     * Get fillValue
     * @return fillValue
     */
    public String getFillValue() {
        return fillValue;
    }

    public void setFillValue(String fillValue) {
        this.fillValue = fillValue;
    }

    public ListSampleRequest withBody(QuerySampleParam body) {
        this.body = body;
        return this;
    }

    public ListSampleRequest withBody(Consumer<QuerySampleParam> bodySetter) {
        if(this.body == null ){
            this.body = new QuerySampleParam();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public QuerySampleParam getBody() {
        return body;
    }

    public void setBody(QuerySampleParam body) {
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
        ListSampleRequest listSampleRequest = (ListSampleRequest) o;
        return Objects.equals(this.fillValue, listSampleRequest.fillValue) &&
            Objects.equals(this.body, listSampleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fillValue, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSampleRequest {\n");
        sb.append("    fillValue: ").append(toIndentedString(fillValue)).append("\n");
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

