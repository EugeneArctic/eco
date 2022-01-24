package com.example.application.views


import com.vaadin.flow.component.Component
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.applayout.DrawerToggle
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.html.*
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.RouterLink
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme
import java.util.*

/**
 * The main view is a top-level placeholder for other views.
 */
@PWA(name = "My App", shortName = "My App", enableInstallPrompt = false)
@Theme(themeFolder = "myapp")
@PageTitle("Main")
class MainLayout : AppLayout() {
    class MenuItemInfo(val text: String, val iconClass: String, val view: Class<out Component>)

    private var viewTitle: H1? = null

    init {

    }

}