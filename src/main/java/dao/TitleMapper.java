package dao;

import java.util.List;

import dto.Title;

public interface TitleMapper {
	List<Title> selectTitleByAll();
	int insertTitleItem(Title title);
    int updateTitleItem(Title title);
    int deleteTitleItem(Title title);
    Title selectTitleByNo();
}
