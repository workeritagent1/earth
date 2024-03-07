//package org.wabc.authorization.config;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig2 extends WebSecurityConfigurerAdapter {
//    @Autowired
//    UserDetailsService userDetailsService;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//             authorizeRequests().antMatchers("/**").permitAll();
//    }
//
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////            .inMemoryAuthentication()
////            .withUser("admin").password("123456").roles("USER");
////    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // 配置用户密码加密器
//        // AuthorizationServerConfig endpoints不支持passwordEncoder方法。只能在这里指定
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//        @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new PasswordEncoder() {
////            @Override
////            public String encode(CharSequence charSequence) {
////                return charSequence.toString();
////            }
////
////            @Override
////            public boolean matches(CharSequence charSequence, String s) {
////                return Objects.equals(charSequence.toString(),s);
////            }
////        };
////    }
//
//}
