package online.sumitakoliya.photoapp.api.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory{

	@Override
	public GatewayFilter apply(Object config) {
		// TODO Auto-generated method stub
		return null;
	}

}
