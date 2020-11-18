package com.xyl.workflow.dao;

import com.xyl.workflow.entity.Workflow;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 流程表(Workflow)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-12 18:35:24
 */
public interface WorkflowDao {

    /**
     * 通过ID查询单条数据
     *
     * @param seqno 主键
     * @return 实例对象
     */
    Workflow queryById(String seqno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Workflow> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param workflow 实例对象
     * @return 对象列表
     */
    List<Workflow> queryAll(Workflow workflow);

    /**
     * 新增数据
     *
     * @param workflow 实例对象
     * @return 影响行数
     */
    int insert(Workflow workflow);

    /**
     * 修改数据
     *
     * @param workflow 实例对象
     * @return 影响行数
     */
    int update(Workflow workflow);

    /**
     * 通过主键删除数据
     *
     * @param seqno 主键
     * @return 影响行数
     */
    int deleteById(String seqno);

}