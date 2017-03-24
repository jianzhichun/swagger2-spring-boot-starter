package io.github.jianzhichun.springboot.starters.swagger2.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.google.common.base.Splitter;

import static com.google.common.collect.Sets.*;

import static org.springframework.util.StringUtils.*;

import java.util.Set;

/**
 * 
 * @author chun
 *
 */
public class AutoSwagger2Condition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String profiles = context.getEnvironment().getProperty("spring.profiles.active");
		String env = context.getEnvironment().getProperty("auto.swagger2.env");
		if (isEmpty(env)) {
			return true;
		}
		Set<String> envs = newHashSet(Splitter.on(",").trimResults().omitEmptyStrings().split(env));

		if (envs.size() > 1) {
			return envs.contains(profiles);
		}
		return profiles.contains(env);
	}

}
