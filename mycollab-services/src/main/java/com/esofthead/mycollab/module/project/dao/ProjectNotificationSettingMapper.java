package com.esofthead.mycollab.module.project.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.project.domain.ProjectNotificationSetting;
import com.esofthead.mycollab.module.project.domain.ProjectNotificationSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectNotificationSettingMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int countByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int deleteByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int insert(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int insertSelective(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    List<ProjectNotificationSetting> selectByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    ProjectNotificationSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByExampleSelective(@Param("record") ProjectNotificationSetting record, @Param("example") ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByExample(@Param("record") ProjectNotificationSetting record, @Param("example") ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByPrimaryKeySelective(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    Integer insertAndReturnKey(ProjectNotificationSetting value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    void massUpdateWithSession(@Param("record") ProjectNotificationSetting record, @Param("primaryKeys") List primaryKeys);
}