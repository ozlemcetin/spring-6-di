package guru.springframework.spring6di.services.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"D", "default"})
@Service("dataSourceService")
public class DevDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Data Source - Development Profile";
    }
}
