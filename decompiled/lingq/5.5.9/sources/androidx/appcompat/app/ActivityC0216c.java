package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0315g1;
import androidx.fragment.app.ActivityC0979t;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.ViewTreeLifecycleOwner;
import androidx.view.ViewTreeViewModelStoreOwner;
import p080e.AbstractC5269a;
import p080e.AbstractC5274f;
import p080e.C5270b;
import p080e.C5271c;
import p080e.C5287s;
import p080e.InterfaceC5272d;
import p080e.LayoutInflaterFactory2C5275g;
import p232l2.C7222a;
import p232l2.C7232k;
import p232l2.C7245x;
import p338qd.C8573r0;

/* JADX INFO: renamed from: androidx.appcompat.app.c */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0216c extends ActivityC0979t implements InterfaceC5272d {

    /* JADX INFO: renamed from: S */
    public LayoutInflaterFactory2C5275g f601S;

    public ActivityC0216c() {
        this.f441e.f42232b.m4586c("androidx:appcompat", new C5270b(this));
        m787I(new C5271c(this));
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: C */
    public final void mo877C() {
    }

    /* JADX INFO: renamed from: J */
    public final void m878J() {
        ViewTreeLifecycleOwner.m3912b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m3914b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m4583b(getWindow().getDecorView(), this);
        C8573r0.m16712Z0(getWindow().getDecorView(), this);
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC5274f m879M() {
        if (this.f601S == null) {
            C5287s.a aVar = AbstractC5274f.f33368a;
            this.f601S = new LayoutInflaterFactory2C5275g(this, null, this, this);
        }
        return this.f601S;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m878J();
        m879M().mo11329c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m879M().mo11330d(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        AbstractC5269a abstractC5269aMo11335i = m879M().mo11335i();
        if (getWindow().hasFeature(0) && (abstractC5269aMo11335i == null || !abstractC5269aMo11335i.mo11309a())) {
            super.closeOptionsMenu();
        }
    }

    @Override // p232l2.ActivityC7230i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC5269a abstractC5269aMo11335i = m879M().mo11335i();
        if (keyCode == 82 && abstractC5269aMo11335i != null && abstractC5269aMo11335i.mo11318j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i10) {
        return (T) m879M().mo11331e(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return m879M().mo11334h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = C0315g1.f1208a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m879M().mo11337k();
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: o */
    public final void mo880o() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m879M().mo11338m(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m879M().mo11340o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0979t, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intentM14562a;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC5269a abstractC5269aMo11335i = m879M().mo11335i();
        if (menuItem.getItemId() == 16908332 && abstractC5269aMo11335i != null && (abstractC5269aMo11335i.mo11312d() & 4) != 0 && (intentM14562a = C7232k.m14562a(this)) != null) {
            if (!C7232k.a.m14567c(this, intentM14562a)) {
                C7232k.a.m14566b(this, intentM14562a);
                return true;
            }
            C7245x c7245x = new C7245x(this);
            Intent intentM14562a2 = C7232k.m14562a(this);
            if (intentM14562a2 == null) {
                intentM14562a2 = C7232k.m14562a(this);
            }
            if (intentM14562a2 != null) {
                ComponentName component = intentM14562a2.getComponent();
                if (component == null) {
                    component = intentM14562a2.resolveActivity(c7245x.f40688b.getPackageManager());
                }
                c7245x.m14587a(component);
                c7245x.f40687a.add(intentM14562a2);
            }
            c7245x.m14588f();
            try {
                int i11 = C7222a.f40604c;
                C7222a.a.m14547a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C5275g) m879M()).m11363K();
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        m879M().mo11341p();
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onStart() {
        super.onStart();
        m879M().mo11342q();
    }

    @Override // androidx.fragment.app.ActivityC0979t, android.app.Activity
    public final void onStop() {
        super.onStop();
        m879M().mo11343r();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        m879M().mo11328A(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        AbstractC5269a abstractC5269aMo11335i = m879M().mo11335i();
        if (getWindow().hasFeature(0)) {
            if (abstractC5269aMo11335i != null && abstractC5269aMo11335i.mo11319k()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        m878J();
        m879M().mo11345u(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m878J();
        m879M().mo11346v(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m878J();
        m879M().mo11347w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        m879M().mo11350z(i10);
    }

    @Override // p080e.InterfaceC5272d
    /* JADX INFO: renamed from: x */
    public final void mo881x() {
    }
}
