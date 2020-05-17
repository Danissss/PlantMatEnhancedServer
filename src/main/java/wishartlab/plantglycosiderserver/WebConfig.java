package wishartlab.plantglycosiderserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
//	@Autowired
//    private ApplicationContext applicationContext;
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//
//        var templateResolver = new SpringResourceTemplateResolver();
//
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("classpath:templates/");
//        templateResolver.setSuffix(".html");
//
//        return templateResolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//
//        var templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//
//        return templateEngine;
//    }
//
//    @Bean
//    public ViewResolver viewResolver() {
//
//        var resolver = new ThymeleafViewResolver();
//        var registry = new ViewResolverRegistry(null, applicationContext);
//
//        resolver.setTemplateEngine(templateEngine());
//        registry.viewResolver(resolver);
//
//        return resolver;
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/webjars/**")
//                .addResourceLocations("/webjars/").resourceChain(false);
//    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
}
