package p000;

import androidx.compose.foundation.lazy.layout.AbstractC0133b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final class vu4 extends AbstractC0133b {

    /* JADX INFO: renamed from: a */
    public final C3047gq f65914a = new C3047gq(4);

    public vu4(vi3 vi3Var) {
        vi3Var.invoke(this);
    }

    /* JADX INFO: renamed from: g */
    public static void m23545g(vu4 vu4Var, String str, aj3 aj3Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        vu4Var.f65914a.m12798a(1, new uu4(str != null ? new C0011a9(str, 28) : null, new tf4(5), new C0282a(-857469575, true, new C3411oj(aj3Var, 2))));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m23546i(vu4 vu4Var, int i, vi3 vi3Var, C0282a c0282a, int i2) {
        if ((i2 & 2) != 0) {
            vi3Var = null;
        }
        vu4Var.m23547h(i, vi3Var, vs4.f65854d, c0282a);
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0133b
    /* JADX INFO: renamed from: d */
    public final C3047gq mo997d() {
        return this.f65914a;
    }

    /* JADX INFO: renamed from: h */
    public final void m23547h(int i, vi3 vi3Var, vi3 vi3Var2, C0282a c0282a) {
        this.f65914a.m12798a(i, new uu4(vi3Var, vi3Var2, c0282a));
    }
}
