/*
package starter.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.thymeleaf.spring5.ISpringWebFluxTemplateEngine;
import org.thymeleaf.spring5.SpringWebFluxTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;
import org.thymeleaf.templatemode.TemplateMode;


@Configuration
@EnableWebFlux
public class WebFluxConfiguration implements WebFluxConfigurer {

    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver() {

        final SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);

        return resolver;

    }

    // 템플릿을 실제 HTML 변환
    @Bean
    public ISpringWebFluxTemplateEngine thymeleafTemplateEngine(){

        final SpringWebFluxTemplateEngine templateEngine = new SpringWebFluxTemplateEngine();
        templateEngine.setTemplateResolver(thymeleafTemplateResolver());

        return templateEngine;

    }

    // 타임리프 사용하기 위한 필수 뷰 리졸버
    @Bean
    ThymeleafReactiveViewResolver thymeleafReactiveViewResolver(){

        final ThymeleafReactiveViewResolver viewResolver = new ThymeleafReactiveViewResolver();
        viewResolver.setTemplateEngine(thymeleafTemplateEngine());
        viewResolver.setResponseMaxChunkSizeBytes(16384);

        return viewResolver;

    }

    // 클래스에서 사용할 수 있는 뷰 리졸버
    @Override
    public void configureViewResolvers(org.springframework.web.reactive.config.ViewResolverRegistry registry) {
        registry.viewResolver(thymeleafReactiveViewResolver());
    }

}
*/
