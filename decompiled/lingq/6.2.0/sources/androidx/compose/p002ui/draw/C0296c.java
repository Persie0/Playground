package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.node.C0358h;
import p000.fb2;
import p000.lj0;
import p000.lr2;
import p000.vi3;
import p000.vj6;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.draw.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0296c implements fb2 {

    /* JADX INFO: renamed from: a */
    public lj0 f3864a = lr2.f50031a;

    /* JADX INFO: renamed from: b */
    public vj6 f3865b;

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f3864a.mo1346a().mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final vj6 m1348b(final vi3 vi3Var) {
        return m1349c(new vi3() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                C0358h c0358h = (C0358h) obj;
                vi3Var.invoke(c0358h);
                c0358h.m1614b();
                return xfa.f68157a;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final vj6 m1349c(vi3 vi3Var) {
        vj6 vj6Var = new vj6(12);
        vj6Var.f65506b = vi3Var;
        this.f3865b = vj6Var;
        return vj6Var;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f3864a.mo1346a().mo597d0();
    }
}
