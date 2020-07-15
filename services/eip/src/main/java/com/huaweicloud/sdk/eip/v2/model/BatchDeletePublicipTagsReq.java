package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.ResourceTagDict;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量操作资源标签的请求体
 */
public class BatchDeletePublicipTagsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTagDict> tags = new ArrayList<>();
        /**
     * 操作标识  delete：删除  action为delete时，value可选
     */
    public static class ActionEnum {

        
        /**
         * Enum DELETE for value: "delete"
         */
        public static final ActionEnum DELETE = new ActionEnum("delete");
        

        public static final Map<String, ActionEnum> staticFields = new HashMap<String, ActionEnum>() {
            { 
                put("delete", DELETE);
            }
        };

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ActionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;

    public BatchDeletePublicipTagsReq withTags(List<ResourceTagDict> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchDeletePublicipTagsReq addTagsItem(ResourceTagDict tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchDeletePublicipTagsReq withTags(Consumer<List<ResourceTagDict>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<ResourceTagDict> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagDict> tags) {
        this.tags = tags;
    }

    public BatchDeletePublicipTagsReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识  delete：删除  action为delete时，value可选
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeletePublicipTagsReq batchDeletePublicipTagsReq = (BatchDeletePublicipTagsReq) o;
        return Objects.equals(this.tags, batchDeletePublicipTagsReq.tags) &&
            Objects.equals(this.action, batchDeletePublicipTagsReq.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletePublicipTagsReq {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
