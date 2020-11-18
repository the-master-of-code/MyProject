package com.xyl.workflow.service;

import com.xyl.workflow.entity.Workflow;
import java.util.List;

/**
 * 流程表(Workflow)表服务接口
 *
 * @author makejava
 * @since 2020-11-12 18:35:24
 */
public interface WorkflowService {

    /**
     * 通过ID查询单条数据
     *
     * @param seqno 主键
     * @return 实例对象
     */
    Workflow queryById(String seqno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Workflow> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param workflow 实例对象
     * @return 实例对象
     */
    Workflow insert(Workflow workflow);

    /**
     * 修改数据
     *
     * @param workflow 实例对象
     * @return 实例对象
     */
    Workflow update(Workflow workflow);

    /**
     * 通过主键删除数据
     *
     * @param seqno 主键
     * @return 是否成功
     */
    boolean deleteById(String seqno);

}