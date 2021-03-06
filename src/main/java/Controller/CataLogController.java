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

    /*main.jsp预加载获取目录内容*/
    @RequestMapping(value = "loadCata")
    @ResponseBody
    public List<CataLog> showCataLog(){
        List<CataLog> allCataLog = cataLogService.findAllCataLog();
        return allCataLog;
    }


}
