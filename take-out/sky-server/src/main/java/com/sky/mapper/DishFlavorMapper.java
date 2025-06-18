package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param dishFlavorList
     */
     void insertBatch(List<DishFlavor> dishFlavorList);

    /**
     * 根据菜品id删除口味信息
     * @Param dishId
     */
    @Delete("delete from dish_flavor where dish_id=#{dishId}")
    void deleteFlavorByDishId(Long dishId);

    /**
     * 根据菜品id查询口味数据
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
