package org.springframework.boot.starter.swagger2.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import static org.springframework.util.StringUtils.*;

public class AutoSwagger2Condition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String profiles = context.getEnvironment().getProperty("spring.profiles.active");
		String env = context.getEnvironment().getProperty("auto.swagger2.env");
		if(isEmpty(env)){
			return true;
		}
		return profiles.contains(env);
	}

}
