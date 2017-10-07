package Dao;

import Bean.CataLog;

import java.util.List;

public interface CataLogDao {

    /*查找所有目录返回集合*/
    List<CataLog> findAllCataLog();
}
