package com.xyl.workflow.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 流程表(Workflow)实体类
 *
 * @author makejava
 * @since 2020-11-12 18:35:22
 */
public class Workflow implements Serializable {
    private static final long serialVersionUID = 540774863958458963L;
    /**
    * 唯一标识符
    */
    private String seqno;
    /**
    * 操作标识符
    */
    private String operationSeqno;
    /**
    * 流程创建人
    */
    private String createUser;
    /**
    * 流程创建时间
    */
    private Date createDate;
    /**
    * 流程审核人
    */
    private String reviewer;
    /**
    * 流程结束标志(0未结束,1已结束)
    */
    private String endflag;
    /**
    * 流程有效标志(E为有效 D为删除)
    */
    private String effectflag;
    /**
    * 下一审核人
    */
    private String nextOperator;
    /**
    * 流程处理状态(0未处理,1已处理)
    */
    private String status;
    /**
    * 前一步动作
    */
    private String preAction;
    /**
    * 前一步动作编码
    */
    private String preCode;
    /**
    * 备用1
    */
    private String spare1;
    /**
    * 备用2
    */
    private String spare2;
    /**
    * 备用3
    */
    private String spare3;
    /**
    * 备用4
    */
    private String spare4;
    /**
    * 备用5
    */
    private String spare5;
    /**
    * 备用6
    */
    private String spare6;


    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getOperationSeqno() {
        return operationSeqno;
    }

    public void setOperationSeqno(String operationSeqno) {
        this.operationSeqno = operationSeqno;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getEndflag() {
        return endflag;
    }

    public void setEndflag(String endflag) {
        this.endflag = endflag;
    }

    public String getEffectflag() {
        return effectflag;
    }

    public void setEffectflag(String effectflag) {
        this.effectflag = effectflag;
    }

    public String getNextOperator() {
        return nextOperator;
    }

    public void setNextOperator(String nextOperator) {
        this.nextOperator = nextOperator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPreAction() {
        return preAction;
    }

    public void setPreAction(String preAction) {
        this.preAction = preAction;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    public String getSpare4() {
        return spare4;
    }

    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public String getSpare6() {
        return spare6;
    }

    public void setSpare6(String spare6) {
        this.spare6 = spare6;
    }

}