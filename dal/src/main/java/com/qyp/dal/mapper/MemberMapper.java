package com.qyp.dal.mapper;

import com.qyp.dal.pojo.Member;
import com.qyp.dal.pojo.MemberExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    Member selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated Wed Jun 01 10:41:45 CST 2016
     */
    int updateByPrimaryKey(Member record);
}