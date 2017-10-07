package Controller;

import Bean.CataLog;
import Service.ArticlesServiceImpl;
import Service.CataLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CataLogController {

    @Autowired
    private CataLogServiceImpl cataLogService;

    /*预加载获取目录内容*/
    @RequestMapping(value = "loadCata")
    @ResponseBody
    public List<CataLog> showCataLog(){
        List<CataLog> allCataLog = cataLogService.findAllCataLog();
        System.out.println("后台查询到的目录："+allCataLog);
        return allCataLog;
    }
}
