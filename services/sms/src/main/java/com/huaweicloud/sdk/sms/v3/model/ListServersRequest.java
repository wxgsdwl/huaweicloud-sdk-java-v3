package com.huaweicloud.sdk.sms.v3.model;




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
public class ListServersRequest  {

    /**
     * Gets or Sets state
     */
    public static final class StateEnum {

        
        /**
         * Enum UNAVAILABLE_ for value: "unavailable:环境校验不通过"
         */
        public static final StateEnum UNAVAILABLE_ = new StateEnum("unavailable:环境校验不通过");
        
        /**
         * Enum _WAITING_ for value: " waiting:等待"
         */
        public static final StateEnum _WAITING_ = new StateEnum(" waiting:等待");
        
        /**
         * Enum _INITIALIZE_ for value: " initialize:初始化"
         */
        public static final StateEnum _INITIALIZE_ = new StateEnum(" initialize:初始化");
        
        /**
         * Enum _REPLICATE_ for value: " replicate:复制"
         */
        public static final StateEnum _REPLICATE_ = new StateEnum(" replicate:复制");
        
        /**
         * Enum _SYNCING_ for value: " syncing:持续同步"
         */
        public static final StateEnum _SYNCING_ = new StateEnum(" syncing:持续同步");
        
        /**
         * Enum _STOPPING_ for value: " stopping:暂停中"
         */
        public static final StateEnum _STOPPING_ = new StateEnum(" stopping:暂停中");
        
        /**
         * Enum _STOPPED_ for value: " stopped:已暂停"
         */
        public static final StateEnum _STOPPED_ = new StateEnum(" stopped:已暂停");
        
        /**
         * Enum _DELETING_ for value: " deleting:删除中"
         */
        public static final StateEnum _DELETING_ = new StateEnum(" deleting:删除中");
        
        /**
         * Enum _ERROR_ for value: " error:错误"
         */
        public static final StateEnum _ERROR_ = new StateEnum(" error:错误");
        
        /**
         * Enum _CLONING_ for value: " cloning:等待克隆完成"
         */
        public static final StateEnum _CLONING_ = new StateEnum(" cloning:等待克隆完成");
        
        /**
         * Enum _CUTOVERING_ for value: " cutovering:启动目的端中"
         */
        public static final StateEnum _CUTOVERING_ = new StateEnum(" cutovering:启动目的端中");
        
        /**
         * Enum _FINISHED_ for value: " finished:启动目的端完成"
         */
        public static final StateEnum _FINISHED_ = new StateEnum(" finished:启动目的端完成");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("unavailable:环境校验不通过", UNAVAILABLE_);
            map.put(" waiting:等待", _WAITING_);
            map.put(" initialize:初始化", _INITIALIZE_);
            map.put(" replicate:复制", _REPLICATE_);
            map.put(" syncing:持续同步", _SYNCING_);
            map.put(" stopping:暂停中", _STOPPING_);
            map.put(" stopped:已暂停", _STOPPED_);
            map.put(" deleting:删除中", _DELETING_);
            map.put(" error:错误", _ERROR_);
            map.put(" cloning:等待克隆完成", _CLONING_);
            map.put(" cutovering:启动目的端中", _CUTOVERING_);
            map.put(" finished:启动目的端完成", _FINISHED_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migproject")
    
    private String migproject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 200;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_cycle")
    
    private String migrationCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connected")
    
    private Boolean connected;

    public ListServersRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * Get state
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListServersRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListServersRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListServersRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * Get ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListServersRequest withMigproject(String migproject) {
        this.migproject = migproject;
        return this;
    }

    


    /**
     * Get migproject
     * @return migproject
     */
    public String getMigproject() {
        return migproject;
    }

    public void setMigproject(String migproject) {
        this.migproject = migproject;
    }

    public ListServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListServersRequest withMigrationCycle(String migrationCycle) {
        this.migrationCycle = migrationCycle;
        return this;
    }

    


    /**
     * Get migrationCycle
     * @return migrationCycle
     */
    public String getMigrationCycle() {
        return migrationCycle;
    }

    public void setMigrationCycle(String migrationCycle) {
        this.migrationCycle = migrationCycle;
    }

    public ListServersRequest withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    


    /**
     * Get connected
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServersRequest listServersRequest = (ListServersRequest) o;
        return Objects.equals(this.state, listServersRequest.state) &&
            Objects.equals(this.name, listServersRequest.name) &&
            Objects.equals(this.id, listServersRequest.id) &&
            Objects.equals(this.ip, listServersRequest.ip) &&
            Objects.equals(this.migproject, listServersRequest.migproject) &&
            Objects.equals(this.limit, listServersRequest.limit) &&
            Objects.equals(this.offset, listServersRequest.offset) &&
            Objects.equals(this.migrationCycle, listServersRequest.migrationCycle) &&
            Objects.equals(this.connected, listServersRequest.connected);
    }
    @Override
    public int hashCode() {
        return Objects.hash(state, name, id, ip, migproject, limit, offset, migrationCycle, connected);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    migproject: ").append(toIndentedString(migproject)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    migrationCycle: ").append(toIndentedString(migrationCycle)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
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

