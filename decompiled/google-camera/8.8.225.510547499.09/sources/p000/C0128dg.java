package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* JADX INFO: renamed from: dg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0128dg implements akn, aqn, alw {

    /* JADX INFO: renamed from: a */
    public aks f10831a = null;

    /* JADX INFO: renamed from: b */
    public bzm f10832b = null;

    /* JADX INFO: renamed from: c */
    private final ComponentCallbacksC0077bw f10833c;

    /* JADX INFO: renamed from: d */
    private final Runnable f10834d;

    /* JADX INFO: renamed from: e */
    private final bkn f10835e;

    public C0128dg(ComponentCallbacksC0077bw componentCallbacksC0077bw, bkn bknVar, Runnable runnable, byte[] bArr, byte[] bArr2) {
        this.f10833c = componentCallbacksC0077bw;
        this.f10835e = bknVar;
        this.f10834d = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m6086a(akq akqVar) {
        this.f10831a.m880b(akqVar);
    }

    /* JADX INFO: renamed from: b */
    final void m6087b() {
        if (this.f10831a == null) {
            this.f10831a = new aks(this);
            bzm bzmVarM468d = aff.m468d(this);
            this.f10832b = bzmVarM468d;
            bzmVarM468d.m3224g();
            this.f10834d.run();
        }
    }

    @Override // p000.akn
    public final alz getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f10833c.requireContext().getApplicationContext();
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
        amb ambVar = new amb();
        if (application != null) {
            ambVar.m932b(als.f665b, application);
        }
        ambVar.m932b(all.f643a, this.f10833c);
        ambVar.m932b(all.f644b, this);
        Bundle bundle = this.f10833c.f4610l;
        if (bundle != null) {
            ambVar.m932b(all.f645c, bundle);
        }
        return ambVar;
    }

    @Override // p000.akv
    public final aks getLifecycle() {
        m6087b();
        return this.f10831a;
    }

    @Override // p000.aqn
    public final aqm getSavedStateRegistry() {
        m6087b();
        return (aqm) this.f10832b.f4820b;
    }

    @Override // p000.alw
    public final bkn getViewModelStore$ar$class_merging$ar$class_merging() {
        m6087b();
        return this.f10835e;
    }
}
