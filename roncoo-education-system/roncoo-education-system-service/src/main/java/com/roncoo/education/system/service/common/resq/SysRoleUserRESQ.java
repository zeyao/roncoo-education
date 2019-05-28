package com.roncoo.education.system.service.common.resq;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 角色用户关联表
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysRoleUserRESQ implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	@ApiModelProperty(value = "状态(1:正常，0:禁用)")
	private Integer statusId;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 角色ID
	 */
	@ApiModelProperty(value = "角色ID")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long roleId;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long userId;
}