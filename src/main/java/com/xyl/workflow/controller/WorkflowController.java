package com.xyl.workflow.controller;

import com.xyl.workflow.entity.Workflow;
import com.xyl.workflow.service.WorkflowService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 流程表(Workflow)表控制层
 *
 * @author makejava
 * @since 2020-11-12 18:35:25
 */
@RestController
@RequestMapping("workflow")
public class WorkflowController {
    /**
     * 服务对象
     */
    @Resource
    private WorkflowService workflowService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Workflow selectOne(String id) {
        return this.workflowService.queryById(id);
    }

}