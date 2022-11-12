package com.ucne.registroocupaciones.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "", "route", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "setIcon", "(Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getTitle", "setTitle", "Home", "OcupacionListScreen", "OcupacionScreen", "PersonaListScreen", "PersonaScreen", "PrestamoListScreen", "PrestamoScreen", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$Home;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$OcupacionListScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$OcupacionScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PersonaListScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PersonaScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PrestamoScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PrestamoListScreen;", "app_debug"})
public abstract class NavigationItem {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.ui.graphics.vector.ImageVector icon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    
    private NavigationItem(java.lang.String route, androidx.compose.ui.graphics.vector.ImageVector icon, java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$Home;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class Home extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.Home INSTANCE = null;
        
        private Home() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$OcupacionListScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class OcupacionListScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.OcupacionListScreen INSTANCE = null;
        
        private OcupacionListScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$OcupacionScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class OcupacionScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.OcupacionScreen INSTANCE = null;
        
        private OcupacionScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PersonaListScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class PersonaListScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.PersonaListScreen INSTANCE = null;
        
        private PersonaListScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PersonaScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class PersonaScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.PersonaScreen INSTANCE = null;
        
        private PersonaScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PrestamoScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class PrestamoScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.PrestamoScreen INSTANCE = null;
        
        private PrestamoScreen() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem$PrestamoListScreen;", "Lcom/ucne/registroocupaciones/ui/navigation/NavigationItem;", "()V", "app_debug"})
    public static final class PrestamoListScreen extends com.ucne.registroocupaciones.ui.navigation.NavigationItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.ucne.registroocupaciones.ui.navigation.NavigationItem.PrestamoListScreen INSTANCE = null;
        
        private PrestamoListScreen() {
            super(null, null, null);
        }
    }
}