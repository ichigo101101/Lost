package com.example.mapper;

import com.example.entity.Found;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoundMapper {

    /**
     * 新增
     */
    int insert(Found found);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(Found found);

    /**
     * 根据ID查询
     */
    Found selectById(Integer id);

    /**
     * 查询所有
     */
    List<Found> selectAll(Found found);

    @Select("select * from found where status = '丢失中' order by id desc limit 4")
    List<Found> selectNew4();

}