package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rms.v1.model.*;

public class RmsClient {
    protected HcClient hcClient;

    public RmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RmsClient> newBuilder() {
        return new ClientBuilder<>(RmsClient::new, "GlobalCredentials");
    }


    /**
     * 查询资源历史
     * 查询资源与资源关系的变更历史
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return ShowResourceHistoryResponse
     */
    public ShowResourceHistoryResponse showResourceHistory(ShowResourceHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceHistory);
    }

    /**
     * 查询资源历史
     * 查询资源与资源关系的变更历史
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>
     */
    public SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistoryInvoker(ShowResourceHistoryRequest request) {
        return new SyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>(request, RmsMeta.showResourceHistory, hcClient);
    }

    /**
     * 创建合规规则
     * 创建新的合规规则
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return CreatePolicyAssignmentsResponse
     */
    public CreatePolicyAssignmentsResponse createPolicyAssignments(CreatePolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createPolicyAssignments);
    }

    /**
     * 创建合规规则
     * 创建新的合规规则
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>
     */
    public SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignmentsInvoker(CreatePolicyAssignmentsRequest request) {
        return new SyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>(request, RmsMeta.createPolicyAssignments, hcClient);
    }

    /**
     * 删除合规规则
     * 根据规则ID删除此规则
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return DeletePolicyAssignmentResponse
     */
    public DeletePolicyAssignmentResponse deletePolicyAssignment(DeletePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deletePolicyAssignment);
    }

    /**
     * 删除合规规则
     * 根据规则ID删除此规则
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>
     */
    public SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignmentInvoker(DeletePolicyAssignmentRequest request) {
        return new SyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>(request, RmsMeta.deletePolicyAssignment, hcClient);
    }

    /**
     * 停用合规规则
     * 根据规则ID停用此规则
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return DisablePolicyAssignmentResponse
     */
    public DisablePolicyAssignmentResponse disablePolicyAssignment(DisablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.disablePolicyAssignment);
    }

    /**
     * 停用合规规则
     * 根据规则ID停用此规则
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>
     */
    public SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignmentInvoker(DisablePolicyAssignmentRequest request) {
        return new SyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>(request, RmsMeta.disablePolicyAssignment, hcClient);
    }

    /**
     * 启用合规规则
     * 根据规则ID启用此规则
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return EnablePolicyAssignmentResponse
     */
    public EnablePolicyAssignmentResponse enablePolicyAssignment(EnablePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.enablePolicyAssignment);
    }

    /**
     * 启用合规规则
     * 根据规则ID启用此规则
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>
     */
    public SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignmentInvoker(EnablePolicyAssignmentRequest request) {
        return new SyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>(request, RmsMeta.enablePolicyAssignment, hcClient);
    }

    /**
     * 列出内置策略
     * 列出用户的内置策略
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return ListBuiltInPolicyDefinitionsResponse
     */
    public ListBuiltInPolicyDefinitionsResponse listBuiltInPolicyDefinitions(ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listBuiltInPolicyDefinitions);
    }

    /**
     * 列出内置策略
     * 列出用户的内置策略
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>
     */
    public SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsInvoker(ListBuiltInPolicyDefinitionsRequest request) {
        return new SyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>(request, RmsMeta.listBuiltInPolicyDefinitions, hcClient);
    }

    /**
     * 列出合规规则
     * 列出用户的合规规则
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return ListPolicyAssignmentsResponse
     */
    public ListPolicyAssignmentsResponse listPolicyAssignments(ListPolicyAssignmentsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyAssignments);
    }

    /**
     * 列出合规规则
     * 列出用户的合规规则
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>
     */
    public SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignmentsInvoker(ListPolicyAssignmentsRequest request) {
        return new SyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>(request, RmsMeta.listPolicyAssignments, hcClient);
    }

    /**
     * 获取规则的合规结果
     * 根据规则ID查询所有的合规结果
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return ListPolicyStatesByAssignmentIdResponse
     */
    public ListPolicyStatesByAssignmentIdResponse listPolicyStatesByAssignmentId(ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByAssignmentId);
    }

    /**
     * 获取规则的合规结果
     * 根据规则ID查询所有的合规结果
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdInvoker(ListPolicyStatesByAssignmentIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>(request, RmsMeta.listPolicyStatesByAssignmentId, hcClient);
    }

    /**
     * 获取用户的合规结果
     * 查询用户所有的合规结果
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return ListPolicyStatesByDomainIdResponse
     */
    public ListPolicyStatesByDomainIdResponse listPolicyStatesByDomainId(ListPolicyStatesByDomainIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByDomainId);
    }

    /**
     * 获取用户的合规结果
     * 查询用户所有的合规结果
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdInvoker(ListPolicyStatesByDomainIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>(request, RmsMeta.listPolicyStatesByDomainId, hcClient);
    }

    /**
     * 获取资源的合规结果
     * 根据资源ID查询所有合规结果
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return ListPolicyStatesByResourceIdResponse
     */
    public ListPolicyStatesByResourceIdResponse listPolicyStatesByResourceId(ListPolicyStatesByResourceIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listPolicyStatesByResourceId);
    }

    /**
     * 获取资源的合规结果
     * 根据资源ID查询所有合规结果
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>
     */
    public SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdInvoker(ListPolicyStatesByResourceIdRequest request) {
        return new SyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>(request, RmsMeta.listPolicyStatesByResourceId, hcClient);
    }

    /**
     * 运行合规评估
     * 根据规则ID评估此规则
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return RunEvaluationByPolicyAssignmentIdResponse
     */
    public RunEvaluationByPolicyAssignmentIdResponse runEvaluationByPolicyAssignmentId(RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.runEvaluationByPolicyAssignmentId);
    }

    /**
     * 运行合规评估
     * 根据规则ID评估此规则
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>
     */
    public SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdInvoker(RunEvaluationByPolicyAssignmentIdRequest request) {
        return new SyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>(request, RmsMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /**
     * 查询单个内置策略
     * 根据策略ID查询单个内置策略
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return ShowBuiltInPolicyDefinitionResponse
     */
    public ShowBuiltInPolicyDefinitionResponse showBuiltInPolicyDefinition(ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showBuiltInPolicyDefinition);
    }

    /**
     * 查询单个内置策略
     * 根据策略ID查询单个内置策略
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>
     */
    public SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionInvoker(ShowBuiltInPolicyDefinitionRequest request) {
        return new SyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>(request, RmsMeta.showBuiltInPolicyDefinition, hcClient);
    }

    /**
     * 获取规则的评估状态
     * 根据规则ID查询此规则的评估状态
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return ShowEvaluationStateByAssignmentIdResponse
     */
    public ShowEvaluationStateByAssignmentIdResponse showEvaluationStateByAssignmentId(ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showEvaluationStateByAssignmentId);
    }

    /**
     * 获取规则的评估状态
     * 根据规则ID查询此规则的评估状态
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>
     */
    public SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdInvoker(ShowEvaluationStateByAssignmentIdRequest request) {
        return new SyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>(request, RmsMeta.showEvaluationStateByAssignmentId, hcClient);
    }

    /**
     * 获取单个合规规则
     * 根据规则ID获取单个规则
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return ShowPolicyAssignmentResponse
     */
    public ShowPolicyAssignmentResponse showPolicyAssignment(ShowPolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showPolicyAssignment);
    }

    /**
     * 获取单个合规规则
     * 根据规则ID获取单个规则
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>
     */
    public SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignmentInvoker(ShowPolicyAssignmentRequest request) {
        return new SyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>(request, RmsMeta.showPolicyAssignment, hcClient);
    }

    /**
     * 更新合规规则
     * 更新用户的合规规则
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return UpdatePolicyAssignmentResponse
     */
    public UpdatePolicyAssignmentResponse updatePolicyAssignment(UpdatePolicyAssignmentRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.updatePolicyAssignment);
    }

    /**
     * 更新合规规则
     * 更新用户的合规规则
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>
     */
    public SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignmentInvoker(UpdatePolicyAssignmentRequest request) {
        return new SyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>(request, RmsMeta.updatePolicyAssignment, hcClient);
    }

    /**
     * 查询租户可见的区域
     * 查询租户可见的区域
     *
     * @param ListRegionsRequest 请求对象
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listRegions);
    }

    /**
     * 查询租户可见的区域
     * 查询租户可见的区域
     *
     * @param ListRegionsRequest 请求对象
     * @return SyncInvoker<ListRegionsRequest, ListRegionsResponse>
     */
    public SyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsInvoker(ListRegionsRequest request) {
        return new SyncInvoker<ListRegionsRequest, ListRegionsResponse>(request, RmsMeta.listRegions, hcClient);
    }

    /**
     * 列举资源关系
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return ShowResourceRelationsResponse
     */
    public ShowResourceRelationsResponse showResourceRelations(ShowResourceRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceRelations);
    }

    /**
     * 列举资源关系
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>
     */
    public SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsInvoker(ShowResourceRelationsRequest request) {
        return new SyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>(request, RmsMeta.showResourceRelations, hcClient);
    }

    /**
     * 列举所有资源
     * 返回当前租户下所有资源，需要当前用户有rms:resources:list权限。
     *
     * @param ListAllResourcesRequest 请求对象
     * @return ListAllResourcesResponse
     */
    public ListAllResourcesResponse listAllResources(ListAllResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listAllResources);
    }

    /**
     * 列举所有资源
     * 返回当前租户下所有资源，需要当前用户有rms:resources:list权限。
     *
     * @param ListAllResourcesRequest 请求对象
     * @return SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>
     */
    public SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesInvoker(ListAllResourcesRequest request) {
        return new SyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>(request, RmsMeta.listAllResources, hcClient);
    }

    /**
     * 列举云服务
     * 查询RMS支持的云服务、资源、区域列表
     *
     * @param ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listProviders);
    }

    /**
     * 列举云服务
     * 查询RMS支持的云服务、资源、区域列表
     *
     * @param ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<ListProvidersRequest, ListProvidersResponse>(request, RmsMeta.listProviders, hcClient);
    }

    /**
     * 列举指定类型的资源
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ListResourcesRequest 请求对象
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.listResources);
    }

    /**
     * 列举指定类型的资源
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。 RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ListResourcesRequest 请求对象
     * @return SyncInvoker<ListResourcesRequest, ListResourcesResponse>
     */
    public SyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesInvoker(ListResourcesRequest request) {
        return new SyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, RmsMeta.listResources, hcClient);
    }

    /**
     * 查询单个资源
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return ShowResourceByIdResponse
     */
    public ShowResourceByIdResponse showResourceById(ShowResourceByIdRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showResourceById);
    }

    /**
     * 查询单个资源
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>
     */
    public SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdInvoker(ShowResourceByIdRequest request) {
        return new SyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>(request, RmsMeta.showResourceById, hcClient);
    }

    /**
     * 创建或更新记录器
     * 创建或更新资源记录器，只能存在一个资源记录器
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return CreateTrackerConfigResponse
     */
    public CreateTrackerConfigResponse createTrackerConfig(CreateTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.createTrackerConfig);
    }

    /**
     * 创建或更新记录器
     * 创建或更新资源记录器，只能存在一个资源记录器
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>
     */
    public SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfigInvoker(CreateTrackerConfigRequest request) {
        return new SyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>(request, RmsMeta.createTrackerConfig, hcClient);
    }

    /**
     * 删除记录器
     * 删除资源记录器
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return DeleteTrackerConfigResponse
     */
    public DeleteTrackerConfigResponse deleteTrackerConfig(DeleteTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.deleteTrackerConfig);
    }

    /**
     * 删除记录器
     * 删除资源记录器
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>
     */
    public SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfigInvoker(DeleteTrackerConfigRequest request) {
        return new SyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>(request, RmsMeta.deleteTrackerConfig, hcClient);
    }

    /**
     * 查询记录器
     * 查询资源记录器的详细信息
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return ShowTrackerConfigResponse
     */
    public ShowTrackerConfigResponse showTrackerConfig(ShowTrackerConfigRequest request) {
        return hcClient.syncInvokeHttp(request, RmsMeta.showTrackerConfig);
    }

    /**
     * 查询记录器
     * 查询资源记录器的详细信息
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>
     */
    public SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfigInvoker(ShowTrackerConfigRequest request) {
        return new SyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>(request, RmsMeta.showTrackerConfig, hcClient);
    }

}