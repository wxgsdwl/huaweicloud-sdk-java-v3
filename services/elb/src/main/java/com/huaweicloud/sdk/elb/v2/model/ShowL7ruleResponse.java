package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.L7ruleV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowL7ruleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule")
    
    private L7ruleV2Resp rule = null;

    public ShowL7ruleResponse withRule(L7ruleV2Resp rule) {
        this.rule = rule;
        return this;
    }

    public ShowL7ruleResponse withRule(Consumer<L7ruleV2Resp> ruleSetter) {
        if(this.rule == null ){
            this.rule = new L7ruleV2Resp();
            ruleSetter.accept(this.rule);
        }
        
        return this;
    }


    /**
     * Get rule
     * @return rule
     */
    public L7ruleV2Resp getRule() {
        return rule;
    }

    public void setRule(L7ruleV2Resp rule) {
        this.rule = rule;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowL7ruleResponse showL7ruleResponse = (ShowL7ruleResponse) o;
        return Objects.equals(this.rule, showL7ruleResponse.rule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowL7ruleResponse {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

