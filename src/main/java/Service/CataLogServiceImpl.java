package Service;

import Bean.CataLog;
import Dao.ArticlesDao;
import Dao.CataLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CataLogServiceImpl implements CataLogService{

    @Autowired
    private CataLogDao cataLogDao;

    /*查找所有目录返回集合*/
    @Override
    public List<CataLog> findAllCataLog() {
        return cataLogDao.findAllCataLog();
    }
}
