package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ShowTagsRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListResourceInstancesRequest  {

    /**
     * Gets or Sets resourceType
     */
    public static final class ResourceTypeEnum {

        
        /**
         * Enum SCALING_GROUP_TAG for value: "scaling_group_tag"
         */
        public static final ResourceTypeEnum SCALING_GROUP_TAG = new ResourceTypeEnum("scaling_group_tag");
        

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("scaling_group_tag", SCALING_GROUP_TAG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private ResourceTypeEnum resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ShowTagsRequestBody body = null;

    public ListResourceInstancesRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * Get resourceType
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListResourceInstancesRequest withBody(ShowTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListResourceInstancesRequest withBody(Consumer<ShowTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ShowTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ShowTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ShowTagsRequestBody body) {
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
        ListResourceInstancesRequest listResourceInstancesRequest = (ListResourceInstancesRequest) o;
        return Objects.equals(this.resourceType, listResourceInstancesRequest.resourceType) &&
            Objects.equals(this.body, listResourceInstancesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstancesRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

