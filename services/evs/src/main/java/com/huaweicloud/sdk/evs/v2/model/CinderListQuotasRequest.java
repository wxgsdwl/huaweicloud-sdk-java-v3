package com.huaweicloud.sdk.evs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CinderListQuotasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_project_id")
    
    private String targetProjectId;
    /**
     * Gets or Sets usage
     */
    public static final class UsageEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final UsageEnum TRUE = new UsageEnum("true");
        

        private static final Map<String, UsageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UsageEnum> createStaticFields() {
            Map<String, UsageEnum> map = new HashMap<>();
            map.put("true", TRUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UsageEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UsageEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            UsageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new UsageEnum(value);
            }
            return result;
        }

        public static UsageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            UsageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof UsageEnum) {
                return this.value.equals(((UsageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage")
    
    private UsageEnum usage;

    public CinderListQuotasRequest withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    


    /**
     * Get targetProjectId
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public CinderListQuotasRequest withUsage(UsageEnum usage) {
        this.usage = usage;
        return this;
    }

    


    /**
     * Get usage
     * @return usage
     */
    public UsageEnum getUsage() {
        return usage;
    }

    public void setUsage(UsageEnum usage) {
        this.usage = usage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderListQuotasRequest cinderListQuotasRequest = (CinderListQuotasRequest) o;
        return Objects.equals(this.targetProjectId, cinderListQuotasRequest.targetProjectId) &&
            Objects.equals(this.usage, cinderListQuotasRequest.usage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetProjectId, usage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListQuotasRequest {\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

