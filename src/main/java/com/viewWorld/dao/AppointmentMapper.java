package com.viewWorld.dao;

import com.viewWorld.entity.Appointment;
import com.viewWorld.entity.AppointmentKey;

public interface AppointmentMapper {

    /**
     * 以下方法均是mybatis逆向工程生成的方法
     * @param key
     * @return
     */
    int deleteByPrimaryKey(AppointmentKey key);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    Appointment selectByPrimaryKey(AppointmentKey key);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}