package Service;

import Bean.CataLog;

import java.util.List;

public interface CataLogService {
    /*查找所有目录返回集合*/
    List<CataLog>  findAllCataLog();
}
