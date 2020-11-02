package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.WhitelistResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateWhitelistResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist")
    
    private WhitelistResp whitelist = null;

    public UpdateWhitelistResponse withWhitelist(WhitelistResp whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public UpdateWhitelistResponse withWhitelist(Consumer<WhitelistResp> whitelistSetter) {
        if(this.whitelist == null ){
            this.whitelist = new WhitelistResp();
            whitelistSetter.accept(this.whitelist);
        }
        
        return this;
    }


    /**
     * Get whitelist
     * @return whitelist
     */
    public WhitelistResp getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(WhitelistResp whitelist) {
        this.whitelist = whitelist;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWhitelistResponse updateWhitelistResponse = (UpdateWhitelistResponse) o;
        return Objects.equals(this.whitelist, updateWhitelistResponse.whitelist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(whitelist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhitelistResponse {\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

