package guru.springframework.spring6di.controllers.ds;

import guru.springframework.spring6di.services.ds.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;

    @Autowired
    public DataSourceController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        System.out.println("I'm in the getDataSource method of DataSourceController");
        return dataSourceService.getDataSource();
    }
}
