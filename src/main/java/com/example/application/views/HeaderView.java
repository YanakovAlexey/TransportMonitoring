package com.example.application.views;


import com.example.application.components.appnav.backend.service.UserService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

import java.util.HashSet;
import java.util.Set;

import static com.vaadin.flow.component.icon.VaadinIcon.*;

public class HeaderView extends VerticalLayout {

    public interface Delegate {
        default void onGenreChange(long id, long oldId) {
        }


        default void onPublisherChange(long id, long oldId) {
        }


        default void onAuthorChange(long id, long oldId) {
        }


        default void onSearchChange(String text, String oldText) {
        }

    }

    private HorizontalLayout topLine = new HorizontalLayout();
    private HorizontalLayout bottomLine = new HorizontalLayout();


    private final Button langButtonGE = new Button("GE");
    private final Button langButtonRU = new Button("RU");

    private final UserService userService;

    private final Set<Delegate> delegates = new HashSet<>();

    public HeaderView(UserService userService) {
        this.userService = userService;

        screen();
    }

    public void subscribe(Delegate delegate) {
        if (delegate == null)
            throw new RuntimeException("Delegate is null");

        synchronized (delegates) {
            delegates.add(delegate);
        }
    }

    private void screen() {
        Button aboutUs = new Button(new Icon(EXCLAMATION_CIRCLE_O));
        Button cartButton = new Button(new Icon(CART));

        LoginOverlay loginOverlay = new LoginOverlay();
        Button secondaryButton = new Button();
        secondaryButton.addClickListener(event -> loginOverlay.setOpened(true));
        secondaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        cartButton.addClickListener(event -> {
//            if (authenticatedUser.get().isPresent()) {
//                cartButton.getUI().ifPresent(ui ->
//                        ui.navigate("Basket/" + authenticatedUser.get().get().getId())
//                );
//
//
//            } else cartButton.getUI().ifPresent(ui ->
//                    ui.navigate("/auth"));
        });

        Button bookButton = new Button(new Icon(OPEN_BOOK));
        Button login = new Button();
        login.addClickListener(event -> loginOverlay.setOpened(true));
        login.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        bookButton.addClickListener(event -> {
            bookButton.getUI().ifPresent(ui -> ui.navigate("auth"));
        });

        Button userButton = new Button(new Icon(USER));
        login.addClickListener(event -> loginOverlay.setOpened(true));
        login.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        userButton.addClickListener(event -> {
            userButton.getUI().ifPresent(ui -> ui.navigate("auth"));
        });


        this.addClassNames("view-header");
        this.add(topLine, bottomLine);
        this.topLine.add(createTitle(), aboutUs, bookButton,
                cartButton, userButton, langButtonRU, langButtonGE);


    }

    private static Div createTitle() {
        Div container = new Div();
        Anchor refresh = new Anchor("/", "DigitalBooks.app");
        refresh.addClassNames("view-title");
        container.addClassNames("view-title-container");
        container.add(refresh);
        return container;
    }

}
