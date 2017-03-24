package io.github.jianzhichun.springboot.starters.swagger2.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.google.common.collect.Lists.*;

@ConfigurationProperties(prefix = "auto.swagger2")
public class AutoSwagger2Properties {

	private List<String> protocols = newArrayList();
	private String host;
	private boolean enable = true;
	private Paths paths;
	private String basePackage = "";
	private ApiInfo apiInfo;

	public static class Paths {
		private List<String> or;
		private List<String> not;
		public List<String> getOr() {
			return or;
		}
		public void setOr(List<String> or) {
			this.or = or;
		}
		public List<String> getNot() {
			return not;
		}
		public void setNot(List<String> not) {
			this.not = not;
		}
	}
	public static class ApiInfo {
		private String version = "1.0-SNAPSHOT";
		private String title = "Api Documentation";
		private String description = "Api Documentation";
		private String termsOfServiceUrl = "urn:tos";
		private String license = "Apache 2.0";
		private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";
		private Contact contact;

		public static class Contact {
			private String name = "";
			private String url = "";
			private String email = "";
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getUrl() {
				return url;
			}
			public void setUrl(String url) {
				this.url = url;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			
		}

		public String getVersion() {
			return version;
		}

		public String getTitle() {
			return title;
		}

		public String getDescription() {
			return description;
		}

		public String getTermsOfServiceUrl() {
			return termsOfServiceUrl;
		}

		public String getLicense() {
			return license;
		}

		public String getLicenseUrl() {
			return licenseUrl;
		}

		public Contact getContact() {
			return contact;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setTermsOfServiceUrl(String termsOfServiceUrl) {
			this.termsOfServiceUrl = termsOfServiceUrl;
		}

		public void setLicense(String license) {
			this.license = license;
		}

		public void setLicenseUrl(String licenseUrl) {
			this.licenseUrl = licenseUrl;
		}

		public void setContact(Contact contact) {
			this.contact = contact;
		}

	}

	public ApiInfo getApiInfo() {
		return apiInfo;
	}

	public String getHost() {
		return host;
	}

	public Paths getPaths() {
		return paths;
	}

	public List<String> getProtocols() {
		return protocols;
	}

	public boolean isEnable() {
		return enable;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public void setProtocols(List<String> protocols) {
		this.protocols = protocols;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public void setPaths(Paths paths) {
		this.paths = paths;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public void setApiInfo(ApiInfo apiInfo) {
		this.apiInfo = apiInfo;
	}

}
