package com.xyl.workflow.service;

import com.xyl.workflow.entity.Workflow;
import com.xyl.workflow.dao.WorkflowDao;
import com.xyl.workflow.service.WorkflowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 流程表(Workflow)表服务实现类
 *
 * @author makejava
 * @since 2020-11-12 18:35:25
 */
@Service("workflowService")
public class WorkflowServiceImpl implements WorkflowService {
    @Resource
    private WorkflowDao workflowDao;

    /**
     * 通过ID查询单条数据
     *
     * @param seqno 主键
     * @return 实例对象
     */
    @Override
    public Workflow queryById(String seqno) {
        return this.workflowDao.queryById(seqno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Workflow> queryAllByLimit(int offset, int limit) {
        return this.workflowDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param workflow 实例对象
     * @return 实例对象
     */
    @Override
    public Workflow insert(Workflow workflow) {
        this.workflowDao.insert(workflow);
        return workflow;
    }

    /**
     * 修改数据
     *
     * @param workflow 实例对象
     * @return 实例对象
     */
    @Override
    public Workflow update(Workflow workflow) {
        this.workflowDao.update(workflow);
        return this.queryById(workflow.getSeqno());
    }

    /**
     * 通过主键删除数据
     *
     * @param seqno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String seqno) {
        return this.workflowDao.deleteById(seqno) > 0;
    }
}