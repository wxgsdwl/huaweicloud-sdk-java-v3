package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AllowAddressNetmasksOption;
import com.huaweicloud.sdk.iam.v3.model.AllowIpRangesOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AclPolicyOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allow_address_netmasks")
    
    private List<AllowAddressNetmasksOption> allowAddressNetmasks = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allow_ip_ranges")
    
    private List<AllowIpRangesOption> allowIpRanges = new ArrayList<>();
    
    public AclPolicyOption withAllowAddressNetmasks(List<AllowAddressNetmasksOption> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
        return this;
    }

    
    public AclPolicyOption addAllowAddressNetmasksItem(AllowAddressNetmasksOption allowAddressNetmasksItem) {
        this.allowAddressNetmasks.add(allowAddressNetmasksItem);
        return this;
    }

    public AclPolicyOption withAllowAddressNetmasks(Consumer<List<AllowAddressNetmasksOption>> allowAddressNetmasksSetter) {
        if(this.allowAddressNetmasks == null ){
            this.allowAddressNetmasks = new ArrayList<>();
        }
        allowAddressNetmasksSetter.accept(this.allowAddressNetmasks);
        return this;
    }

    /**
     * 允许访问的IP地址或网段。
     * @return allowAddressNetmasks
     */
    public List<AllowAddressNetmasksOption> getAllowAddressNetmasks() {
        return allowAddressNetmasks;
    }

    public void setAllowAddressNetmasks(List<AllowAddressNetmasksOption> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
    }

    public AclPolicyOption withAllowIpRanges(List<AllowIpRangesOption> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
        return this;
    }

    
    public AclPolicyOption addAllowIpRangesItem(AllowIpRangesOption allowIpRangesItem) {
        this.allowIpRanges.add(allowIpRangesItem);
        return this;
    }

    public AclPolicyOption withAllowIpRanges(Consumer<List<AllowIpRangesOption>> allowIpRangesSetter) {
        if(this.allowIpRanges == null ){
            this.allowIpRanges = new ArrayList<>();
        }
        allowIpRangesSetter.accept(this.allowIpRanges);
        return this;
    }

    /**
     * 允许访问的IP地址区间
     * @return allowIpRanges
     */
    public List<AllowIpRangesOption> getAllowIpRanges() {
        return allowIpRanges;
    }

    public void setAllowIpRanges(List<AllowIpRangesOption> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclPolicyOption aclPolicyOption = (AclPolicyOption) o;
        return Objects.equals(this.allowAddressNetmasks, aclPolicyOption.allowAddressNetmasks) &&
            Objects.equals(this.allowIpRanges, aclPolicyOption.allowIpRanges);
    }
    @Override
    public int hashCode() {
        return Objects.hash(allowAddressNetmasks, allowIpRanges);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclPolicyOption {\n");
        sb.append("    allowAddressNetmasks: ").append(toIndentedString(allowAddressNetmasks)).append("\n");
        sb.append("    allowIpRanges: ").append(toIndentedString(allowIpRanges)).append("\n");
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

