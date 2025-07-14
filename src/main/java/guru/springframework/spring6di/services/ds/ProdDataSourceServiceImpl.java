package guru.springframework.spring6di.services.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("P")
@Service("dataSourceService")
public class ProdDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Data Source - Production Profile";
    }
}
