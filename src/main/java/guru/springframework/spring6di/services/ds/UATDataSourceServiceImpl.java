package guru.springframework.spring6di.services.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("U")
@Service("dataSourceService")
public class UATDataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Data Source - User Acceptance Testing Profile";
    }
}
