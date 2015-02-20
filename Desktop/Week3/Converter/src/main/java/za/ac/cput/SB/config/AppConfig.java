package za.ac.cput.SB.config;

import za.ac.cput.SB.Convert;
import za.ac.cput.SB.imple.ConverterImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by student on 2015/02/19.
 */
@Configuration
public class AppConfig
{
    @Bean(name="con")
    public Convert getConverter(){
        return new ConverterImp();
    }


}
