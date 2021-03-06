package com.huaweicloud.sdk.cloudpipeline.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class StopPipelineRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_id")
    
    private String pipelineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_id")
    
    private String buildId;

    public StopPipelineRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public StopPipelineRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    


    /**
     * Get pipelineId
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public StopPipelineRequest withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    


    /**
     * Get buildId
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopPipelineRequest stopPipelineRequest = (StopPipelineRequest) o;
        return Objects.equals(this.xLanguage, stopPipelineRequest.xLanguage) &&
            Objects.equals(this.pipelineId, stopPipelineRequest.pipelineId) &&
            Objects.equals(this.buildId, stopPipelineRequest.buildId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, pipelineId, buildId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopPipelineRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
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

