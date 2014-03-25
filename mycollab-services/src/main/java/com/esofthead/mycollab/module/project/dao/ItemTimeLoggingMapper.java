package com.esofthead.mycollab.module.project.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.project.domain.ItemTimeLogging;
import com.esofthead.mycollab.module.project.domain.ItemTimeLoggingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemTimeLoggingMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int countByExample(ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int deleteByExample(ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int insert(ItemTimeLogging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int insertSelective(ItemTimeLogging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    List<ItemTimeLogging> selectByExampleWithBLOBs(ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    List<ItemTimeLogging> selectByExample(ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    ItemTimeLogging selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByExampleSelective(@Param("record") ItemTimeLogging record, @Param("example") ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByExampleWithBLOBs(@Param("record") ItemTimeLogging record, @Param("example") ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByExample(@Param("record") ItemTimeLogging record, @Param("example") ItemTimeLoggingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    int updateByPrimaryKeySelective(ItemTimeLogging record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    Integer insertAndReturnKey(ItemTimeLogging value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_time_logging
     *
     * @mbggenerated Mon Mar 24 11:15:52 ICT 2014
     */
    void massUpdateWithSession(@Param("record") ItemTimeLogging record, @Param("primaryKeys") List primaryKeys);
}