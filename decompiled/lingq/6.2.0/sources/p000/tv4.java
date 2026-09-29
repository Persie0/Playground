package p000;

import androidx.compose.foundation.lazy.layout.AbstractC0133b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final class tv4 extends AbstractC0133b {

    /* JADX INFO: renamed from: a */
    public final C3047gq f62945a;

    /* JADX INFO: renamed from: b */
    public final cc4 f62946b;

    public tv4(vi3 vi3Var) {
        C3047gq c3047gq = new C3047gq(4);
        this.f62945a = c3047gq;
        this.f62946b = new cc4(c3047gq);
        vi3Var.invoke(this);
    }

    /* JADX INFO: renamed from: g */
    public static void m22312g(tv4 tv4Var, String str, C0282a c0282a, int i) {
        e41 e41Var = e41.f36683h;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            e41Var = null;
        }
        tv4Var.getClass();
        tv4Var.f62945a.m12798a(1, new sv4(str != null ? new C0011a9(str, 28) : null, new tf4(5), e41Var != null ? new kv4(e41Var, 2) : null, new C0282a(1062451479, true, new C3411oj(c0282a, 3))));
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0133b
    /* JADX INFO: renamed from: d */
    public final C3047gq mo997d() {
        return this.f62945a;
    }
}
