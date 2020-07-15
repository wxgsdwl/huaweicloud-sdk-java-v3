package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.UpdatePublicipsReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePublicipRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdatePublicipsReq body = null;

    public UpdatePublicipRequest withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * Get publicipId
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public UpdatePublicipRequest withBody(UpdatePublicipsReq body) {
        this.body = body;
        return this;
    }

    public UpdatePublicipRequest withBody(Consumer<UpdatePublicipsReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdatePublicipsReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdatePublicipsReq getBody() {
        return body;
    }

    public void setBody(UpdatePublicipsReq body) {
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
        UpdatePublicipRequest updatePublicipRequest = (UpdatePublicipRequest) o;
        return Objects.equals(this.publicipId, updatePublicipRequest.publicipId) &&
            Objects.equals(this.body, updatePublicipRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicipId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicipRequest {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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
