/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.raincat.common.bean.adapter;

import com.raincat.common.enums.CompensationOperationTypeEnum;
import com.raincat.common.enums.TransactionStatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * TransactionRecoverAdapter.
 * @author xiaoyu(Myth)
 */
@Data
public class TransactionRecoverAdapter {

    /**
     * 事务主键id.
     */
    private String transId;

    /**
     * 重试次数.
     */
    private int retriedCount;

    /**
     * 创建时间.
     */
    private Date createTime = new Date();

    /**
     * 创建时间.
     */
    private Date lastTime = new Date();

    /**
     * 版本控制 防止并发问题.
     */
    private int version = 1;

    /**
     * 事务组id.
     */
    private String groupId;

    /**
     * 任务id.
     */
    private String taskId;

    /**
     * 序列化后的二进制信息.
     */
    private byte[] contents;

    /**
     * 状态. {@linkplain TransactionStatusEnum}
     */
    private int status;

    /**
     * 调用接口名称.
     */
    private String targetClass;

    /**
     * 调用方法名称.
     */
    private String targetMethod;

    /***
     * 任务完成标志
     */
    private String completeFlag;

    /**
     * 日志更新操作 {@link CompensationOperationTypeEnum }
     */
    private int operation;

}
