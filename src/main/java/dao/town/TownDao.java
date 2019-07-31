package dao.town;

import dao.BasicDao;
import models.Town;

public abstract class TownDao extends BasicDao<Town> {
    public abstract Town findById(int id);

}
