package com.ifox.entity.system;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.ifox.common.SuperEntity;
import com.ifox.entity.enums.TypeEnum;

import java.util.Date;


/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:44 2018/4/12
 * @Modified By:    系统用户表
 */
@TableName("sys_user")
public class User extends SuperEntity {
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户年龄
     */
    private TypeEnum type;
    /**
     * 通用枚举测试
     */
    private Integer age;
    /**
     * 自定义填充的创建时间
     */
    @TableField(fill = FieldFill.INSERT)// 该注解插入忽略验证，自动填充
    private Date ctime;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
