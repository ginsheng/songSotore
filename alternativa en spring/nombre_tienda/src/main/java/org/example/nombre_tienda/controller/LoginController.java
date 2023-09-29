package org.example.nombre_tienda.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.nombre_tienda.security.CustomAuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
class LoginController {

    @Autowired
    private CustomAuthenticationManager authenticationManager;

    SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @PostMapping("/login")
    RedirectView processLogin(HttpServletRequest request, RedirectAttributes attributes) {

        try {
            final Authentication authentication =
                    authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                            request.getParameter("username"),
                            request.getParameter("password")));

            if (authentication != null && !(authentication instanceof AnonymousAuthenticationToken) &&
                    authentication.isAuthenticated()) {

                SecurityContextHolder.getContext().setAuthentication(authentication);

                final GrantedAuthority grantedAuthority = authentication.getAuthorities().iterator().next();

//            final String jwtToken = jwtTokenUtils.generateToken(authentication.getPrincipal(), grantedAuthority);

                return new RedirectView("/song/inventario");
            }

            attributes.addFlashAttribute("error", true);

            return new RedirectView("/login");
        } catch (BadCredentialsException e) {
            attributes.addFlashAttribute("error", true);

            return new RedirectView("/login");
        }
    }

    @GetMapping("song/logout")
    String logout(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
        this.logoutHandler.logout(request, response, authentication);
        return "redirect:/login";

    }
}