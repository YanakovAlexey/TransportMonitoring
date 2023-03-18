package com.example.application.views.authorization;

import com.example.application.components.appnav.backend.ContentView;
import com.example.application.components.appnav.backend.service.impl.UserServiceImpl;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;


@Route(value = "auth", layout = ContentView.class)
public class AuthorizationView extends Div implements BeforeEnterObserver {

    LoginForm loginForm;
    LoginI18n i18n;
    Div container = new Div();

    private final UserServiceImpl userServiceImpl;

//    private final AuthenticatedUser authenticatedUser;

    public AuthorizationView(UserServiceImpl userServiceImpl) {

        this.userServiceImpl = userServiceImpl;
//        this.authenticatedUser = authenticatedUser;

        i18n = LoginI18n.createDefault();
        LoginI18n.ErrorMessage i18nError = i18n.getErrorMessage();
        i18nError.setTitle("Incorrect username or password");
        i18nError.setMessage("Check that you have entered the correct username and password and try again");
        this.i18n.setErrorMessage(i18nError);

        LoginI18n.Form i18nForm = i18n.getForm();
//        System.out.println("Current locale is = " + UI.getCurrent().getLocale());
        i18nForm.setTitle("Авторизация");
        i18nForm.setUsername("Логин");
        i18nForm.setPassword("Пароль");
        i18n.setForm(i18nForm);
        this.loginForm = new LoginForm();
        loginForm.setI18n(i18n);
        loginForm.addForgotPasswordListener((e) -> loginForm.getUI().ifPresent(ui
                -> ui.navigate("forgot-password")));
//        loginForm.addLoginListener(this::handleSubmit);

//        Anchor regLink = new Anchor("/reg", this.translationProvider.getTranslation("registration",
//                UI.getCurrent().getLocale()));

        container.addClassNames("authorization-container");

        container.add(loginForm);
        addClassNames("authorization-view");
        add(container);
    }

//    private void handleSubmit(AbstractLogin.LoginEvent event) {
//
//        try {
//            usersService.auth(new AuthViewModel(
//                    event.getUsername(),
//                    event.getPassword()
//            ));
//
//            UI.getCurrent().getPage().reload();
//            this.getUI().ifPresent(ui -> ui.navigate("/"));
//
//        } catch (ResponseException e) {
//            e.printStackTrace();
//            loginForm.setError(true);
//        }
//    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
//        if (authenticatedUser.get().isPresent()) {
//            // Already logged in
//            event.forwardTo("/");
//        }
    }
}
