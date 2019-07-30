package com.carledwinti.employee.api.security;

import com.carledwinti.employee.api.model.Account;
import com.carledwinti.employee.api.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class WebSecurityAuthentication extends GlobalAuthenticationConfigurerAdapter {

    @Autowired
    private AccountRepository accountRespository;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }

    private UserDetailsService userDetailsService(){

        return new UserDetailsService() {

            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

                Account account = accountRespository.findByUsername(username);

                if(account != null){
                    return new User(((Account) account).getUsername(),
                            account.getPassword(),
                            true,
                            true,
                            true,
                            true,
                            AuthorityUtils.createAuthorityList("USER"));
                }else{

                    throw new UsernameNotFoundException("Could not find the user '" + username + "'");
                }
            }
        };
    }

}
