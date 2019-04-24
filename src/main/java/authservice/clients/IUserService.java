package authservice.clients;

import authservice.model.dto.request.register.RegisterNewUserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("gameframe-user-service")
public interface IUserService {

    @RequestMapping(value = "internal/register/new")
    void registerNewUser(@RequestBody RegisterNewUserRequest request);

}