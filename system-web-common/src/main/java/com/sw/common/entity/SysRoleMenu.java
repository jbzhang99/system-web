package com.sw.common.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * <p>
 * 权限菜单关系
 * </p>
 *
 * @author yu.leilei
 * @since 2018-11-13
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 关系主键
     */
	@TableId(type = IdType.UUID)
	private String pkRelationId;
    /**
     * 权限ID
     */
	private String fkRoleId;
    /**
     * 菜单ID
     */
	private String fkMenuId;


	@Override
	protected Serializable pkVal() {
		return this.pkRelationId;
	}

	@Override
	public String toString() {
		return "SysRoleMenu{" +
			"pkRelationId=" + pkRelationId +
			", fkRoleId=" + fkRoleId +
			", fkMenuId=" + fkMenuId +
			"}";
	}
}
