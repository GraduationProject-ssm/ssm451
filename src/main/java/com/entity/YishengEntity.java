package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 医生
 *
 * @author 
 * @email
 */
@TableName("yisheng")
public class YishengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengEntity() {

	}

	public YishengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 医生姓名
     */
    @TableField(value = "yisheng_name")

    private String yishengName;


    /**
     * 医生手机号
     */
    @TableField(value = "yisheng_phone")

    private String yishengPhone;


    /**
     * 医生头像
     */
    @TableField(value = "yisheng_photo")

    private String yishengPhoto;


    /**
     * 医生邮箱
     */
    @TableField(value = "yisheng_email")

    private String yishengEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 科室
     */
    @TableField(value = "keshi_types")

    private Integer keshiTypes;


    /**
     * 职位
     */
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 是否坐诊
     */
    @TableField(value = "zuozhen_types")

    private Integer zuozhenTypes;


    /**
     * 医生详情
     */
    @TableField(value = "yisheng_content")

    private String yishengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }


    /**
	 * 获取：医生姓名
	 */

    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 设置：医生手机号
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }


    /**
	 * 获取：医生手机号
	 */

    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 设置：医生头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }


    /**
	 * 获取：医生头像
	 */

    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 设置：医生邮箱
	 */
    public String getYishengEmail() {
        return yishengEmail;
    }


    /**
	 * 获取：医生邮箱
	 */

    public void setYishengEmail(String yishengEmail) {
        this.yishengEmail = yishengEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：科室
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }


    /**
	 * 获取：科室
	 */

    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：是否坐诊
	 */
    public Integer getZuozhenTypes() {
        return zuozhenTypes;
    }


    /**
	 * 获取：是否坐诊
	 */

    public void setZuozhenTypes(Integer zuozhenTypes) {
        this.zuozhenTypes = zuozhenTypes;
    }
    /**
	 * 设置：医生详情
	 */
    public String getYishengContent() {
        return yishengContent;
    }


    /**
	 * 获取：医生详情
	 */

    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yisheng{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yishengName=" + yishengName +
            ", yishengPhone=" + yishengPhone +
            ", yishengPhoto=" + yishengPhoto +
            ", yishengEmail=" + yishengEmail +
            ", sexTypes=" + sexTypes +
            ", keshiTypes=" + keshiTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", zuozhenTypes=" + zuozhenTypes +
            ", yishengContent=" + yishengContent +
            ", createTime=" + createTime +
        "}";
    }
}
