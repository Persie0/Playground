package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lg3 implements gr3, vl8, dua {

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0635c f49622a;

    /* JADX INFO: renamed from: b */
    public final cua f49623b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0002a0 f49624c;

    /* JADX INFO: renamed from: d */
    public zta f49625d;

    /* JADX INFO: renamed from: e */
    public wb5 f49626e = null;

    /* JADX INFO: renamed from: f */
    public fs6 f49627f = null;

    public lg3(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, cua cuaVar, RunnableC0002a0 runnableC0002a0) {
        this.f49622a = abstractComponentCallbacksC0635c;
        this.f49623b = cuaVar;
        this.f49624c = runnableC0002a0;
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        m16179b();
        return this.f49626e;
    }

    /* JADX INFO: renamed from: a */
    public final void m16178a(Lifecycle$Event lifecycle$Event) {
        this.f49626e.m23833G(lifecycle$Event);
    }

    /* JADX INFO: renamed from: b */
    public final void m16179b() {
        if (this.f49626e == null) {
            this.f49626e = new wb5(this, true);
            lb4 lb4Var = new lb4(this, new y47(this, 8));
            this.f49627f = new fs6(lb4Var);
            lb4Var.m16060a();
            this.f49624c.run();
        }
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        Application application;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f49622a;
        zta ztaVarMo2102d = abstractComponentCallbacksC0635c.mo2102d();
        if (!ztaVarMo2102d.equals(abstractComponentCallbacksC0635c.f5712p0)) {
            this.f49625d = ztaVarMo2102d;
            return ztaVarMo2102d;
        }
        if (this.f49625d == null) {
            Context applicationContext = abstractComponentCallbacksC0635c.m2090R().getApplicationContext();
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
            this.f49625d = new wl8(application, abstractComponentCallbacksC0635c, abstractComponentCallbacksC0635c.f5695f);
        }
        return this.f49625d;
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: e */
    public final p56 mo2103e() {
        Application application;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f49622a;
        Context applicationContext = abstractComponentCallbacksC0635c.m2090R().getApplicationContext();
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
        p56 p56Var = new p56(0);
        LinkedHashMap linkedHashMap = p56Var.f58099a;
        if (application != null) {
            linkedHashMap.put(yta.f70452d, application);
        }
        linkedHashMap.put(ci8.f10122f, abstractComponentCallbacksC0635c);
        linkedHashMap.put(ci8.f10123g, this);
        Bundle bundle = abstractComponentCallbacksC0635c.f5695f;
        if (bundle != null) {
            linkedHashMap.put(ci8.f10124h, bundle);
        }
        return p56Var;
    }

    @Override // p000.dua
    /* JADX INFO: renamed from: r */
    public final cua mo2116r() {
        m16179b();
        return this.f49623b;
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        m16179b();
        return (fs6) this.f49627f.f39591c;
    }
}
