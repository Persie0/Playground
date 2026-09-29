package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import androidx.view.C1030e0;
import androidx.view.C1040j0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import androidx.view.SavedStateHandleSupport;
import java.util.LinkedHashMap;
import p270n4.C7705b;
import p270n4.InterfaceC7706c;
import p427v3.AbstractC9634a;
import p427v3.C9636c;

/* JADX INFO: renamed from: androidx.fragment.app.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0980t0 implements InterfaceC1037i, InterfaceC7706c, InterfaceC1048n0 {

    /* JADX INFO: renamed from: a */
    public final Fragment f6412a;

    /* JADX INFO: renamed from: b */
    public final C1046m0 f6413b;

    /* JADX INFO: renamed from: c */
    public C1042k0.b f6414c;

    /* JADX INFO: renamed from: d */
    public C1052r f6415d = null;

    /* JADX INFO: renamed from: e */
    public C7705b f6416e = null;

    public C0980t0(Fragment fragment, C1046m0 c1046m0) {
        this.f6412a = fragment;
        this.f6413b = c1046m0;
    }

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        m3813c();
        return this.f6415d;
    }

    /* JADX INFO: renamed from: a */
    public final void m3812a(Lifecycle.Event event) {
        this.f6415d.m3955f(event);
    }

    /* JADX INFO: renamed from: c */
    public final void m3813c() {
        if (this.f6415d == null) {
            this.f6415d = new C1052r(this);
            C7705b c7705b = new C7705b(this);
            this.f6416e = c7705b;
            c7705b.m15298a();
        }
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        Application application;
        Fragment fragment = this.f6412a;
        C1042k0.b bVarMo470i = fragment.mo470i();
        if (!bVarMo470i.equals(fragment.f6115o0)) {
            this.f6414c = bVarMo470i;
            return bVarMo470i;
        }
        if (this.f6414c == null) {
            Context applicationContext = fragment.m3578a0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f6414c = new C1030e0(application, fragment, fragment.f6101g);
        }
        return this.f6414c;
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: j */
    public final AbstractC9634a mo792j() {
        Application application;
        Fragment fragment = this.f6412a;
        Context applicationContext = fragment.m3578a0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C9636c c9636c = new C9636c(0);
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        if (application != null) {
            linkedHashMap.put(C1040j0.f6663a, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f6589a, fragment);
        linkedHashMap.put(SavedStateHandleSupport.f6590b, this);
        Bundle bundle = fragment.f6101g;
        if (bundle != null) {
            linkedHashMap.put(SavedStateHandleSupport.f6591c, bundle);
        }
        return c9636c;
    }

    @Override // androidx.view.InterfaceC1048n0
    /* JADX INFO: renamed from: n */
    public final C1046m0 mo796n() {
        m3813c();
        return this.f6413b;
    }

    @Override // p270n4.InterfaceC7706c
    /* JADX INFO: renamed from: q */
    public final C1189a mo797q() {
        m3813c();
        return this.f6416e.f42232b;
    }
}
