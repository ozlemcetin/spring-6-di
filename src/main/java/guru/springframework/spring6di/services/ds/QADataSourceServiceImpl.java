package guru.springframework.spring6di.services.ds;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Q")
@Service("dataSourceService")
public class QADataSourceServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Data Source - Quality Assurance Profile";
    }
}
