package com.lsy.sicore_v1.menu.mapper;

import com.lsy.sicore_v1.menu.vo.MenuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<MenuVo> selectMenuList();
    List<MenuVo> selectMenuTree();
    MenuVo selectMenu(String menuId);
    int insertMenu(MenuVo menuVo);
    int updateMenu(@Param("menuVo") MenuVo menuVo, @Param("menuId") String menuId);
    int deleteMultipleMenus(List<String> menuIds);
    int deleteMultipleMappings(List<String> menuIds);
}
