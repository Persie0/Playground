package p000;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class n5b extends t5b {

    /* JADX INFO: renamed from: e */
    public final WindowInsets.Builder f52382e;

    public n5b(f6b f6bVar) {
        super(f6bVar);
        WindowInsets windowInsetsM11575f = f6bVar.m11575f();
        this.f52382e = windowInsetsM11575f != null ? new WindowInsets.Builder(windowInsetsM11575f) : new WindowInsets.Builder();
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: b */
    public f6b mo17237b() {
        m21851a();
        f6b f6bVarM11570g = f6b.m11570g(null, this.f52382e.build());
        l64[] l64VarArr = this.f61892b;
        c6b c6bVar = f6bVarM11570g.f38536a;
        c6bVar.mo4375w(l64VarArr);
        c6bVar.mo4374v(null);
        c6bVar.mo4358A(this.f61893c);
        c6bVar.mo4359B(this.f61894d);
        return f6bVarM11570g;
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: e */
    public void mo17238e(l64 l64Var) {
        this.f52382e.setMandatorySystemGestureInsets(l64Var.m15832e());
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: f */
    public void mo17239f(l64 l64Var) {
        this.f52382e.setStableInsets(l64Var.m15832e());
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: g */
    public void mo17240g(l64 l64Var) {
        this.f52382e.setSystemGestureInsets(l64Var.m15832e());
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: h */
    public void mo17241h(l64 l64Var) {
        this.f52382e.setSystemWindowInsets(l64Var.m15832e());
    }

    @Override // p000.t5b
    /* JADX INFO: renamed from: i */
    public void mo17242i(l64 l64Var) {
        this.f52382e.setTappableElementInsets(l64Var.m15832e());
    }

    public n5b() {
        this.f52382e = new WindowInsets.Builder();
    }
}
