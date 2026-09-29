package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vn8 implements c17 {

    /* JADX INFO: renamed from: a */
    public final int f65668a;

    /* JADX INFO: renamed from: b */
    public final List f65669b;

    /* JADX INFO: renamed from: c */
    public Float f65670c = null;

    /* JADX INFO: renamed from: d */
    public Float f65671d = null;

    /* JADX INFO: renamed from: e */
    public mn8 f65672e = null;

    /* JADX INFO: renamed from: f */
    public mn8 f65673f = null;

    public vn8(int i, ArrayList arrayList) {
        this.f65668a = i;
        this.f65669b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final mn8 m23439a() {
        return this.f65672e;
    }

    /* JADX INFO: renamed from: b */
    public final Float m23440b() {
        return this.f65670c;
    }

    /* JADX INFO: renamed from: c */
    public final Float m23441c() {
        return this.f65671d;
    }

    /* JADX INFO: renamed from: d */
    public final int m23442d() {
        return this.f65668a;
    }

    /* JADX INFO: renamed from: e */
    public final mn8 m23443e() {
        return this.f65673f;
    }

    /* JADX INFO: renamed from: f */
    public final void m23444f(mn8 mn8Var) {
        this.f65672e = mn8Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m23445g(Float f) {
        this.f65670c = f;
    }

    /* JADX INFO: renamed from: h */
    public final void m23446h(Float f) {
        this.f65671d = f;
    }

    /* JADX INFO: renamed from: i */
    public final void m23447i(mn8 mn8Var) {
        this.f65673f = mn8Var;
    }

    @Override // p000.c17
    /* JADX INFO: renamed from: x */
    public final boolean mo1611x() {
        return this.f65669b.contains(this);
    }
}
