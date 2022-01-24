package com.example.application.views.helloworld

import com.example.application.views.MainLayout
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.contextmenu.MenuItem
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.menubar.MenuBar
import com.vaadin.flow.component.menubar.MenuBarVariant
import com.vaadin.flow.component.orderedlayout.BoxSizing
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouteAlias


@PageTitle("eco")
@Route(value = "eco", layout = MainLayout::class)
@RouteAlias(value = "", layout = MainLayout::class)
class EcoView : VerticalLayout() {

    init {

        val menuLayout = HorizontalLayout().apply {
            val menuBar = MenuBar()
            menuBar.addItem("Waste and recycling").apply { width = "20em" }
            menuBar.addItem("Water and sewers").apply { width = "20em" }
            menuBar.addThemeVariants(MenuBarVariant.LUMO_TERTIARY)
            addAndExpand(menuBar)
            defaultVerticalComponentAlignment = FlexComponent.Alignment.CENTER
        }
        add(menuLayout)




        val hl = HorizontalLayout().apply {

            val layout = VerticalLayout()
            layout.height = "200px"
            layout.style["border"] = "1px solid #9E9E9E"
            layout.isPadding = true

            val layout2 = VerticalLayout()
            layout2.height = "200px"
            layout2.style["border"] = "1px solid #9E9E9E"
            layout2.isPadding = true

            addAndExpand(layout, layout2)
        }

        add(hl)


    }


}