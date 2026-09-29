package p000;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class wna extends m90 {

    /* JADX INFO: renamed from: i */
    public final Object f67099i;

    public wna(p33 p33Var, Object obj) {
        super(Collections.EMPTY_LIST);
        m16695k(p33Var);
        this.f67099i = obj;
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: c */
    public final float mo16689c() {
        return 1.0f;
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: f */
    public final Object mo16692f() {
        p33 p33Var = this.f50800e;
        Object obj = this.f67099i;
        float f = this.f50799d;
        return p33Var.m18870N(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        return mo16692f();
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: i */
    public final void mo16693i() {
        if (this.f50800e != null) {
            super.mo16693i();
        }
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: j */
    public final void mo16694j(float f) {
        this.f50799d = f;
    }
}
