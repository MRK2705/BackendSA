package bo.edu.ucb.sa.StrangerAccounts.bl;

import bo.edu.ucb.sa.StrangerAccounts.dao.SAItemDao;
import bo.edu.ucb.sa.StrangerAccounts.dto.ItemDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBl {

    private final SAItemDao saItemDao;

    public ItemBl(SAItemDao saItemDao) {
        this.saItemDao = saItemDao;
    }

    public List<ItemDto> listItems(String articleConcept) {
        if (saItemDao.listItems(articleConcept) == null) {
            System.out.println("No se encontró el item seleccionado");
        }
        return saItemDao.listItems(articleConcept);
    }
}
