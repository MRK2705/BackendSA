package bo.edu.ucb.sa.StrangerAccounts.dao;

import bo.edu.ucb.sa.StrangerAccounts.dto.ItemDto;
import bo.edu.ucb.sa.StrangerAccounts.entity.SAItem;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SAItemDao {
    @Select("""
            select a.article_concept, a.game_price, a.price, a.picture
            from item a where
            a.status = true;
            """)
    List<ItemDto> listItems(String articleConcept);
}
