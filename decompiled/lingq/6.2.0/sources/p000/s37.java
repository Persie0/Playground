package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class s37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final Method f60239p;

    /* JADX INFO: renamed from: q */
    public final int f60240q;

    public s37(int i, Method method) {
        this.f60239p = method;
        this.f60240q = i;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        qr3 qr3Var = (qr3) obj;
        if (qr3Var == null) {
            throw ci8.m4699L(this.f60239p, this.f60240q, "Headers parameter must not be null.", new Object[0]);
        }
        or3 or3Var = b78Var.f8055f;
        or3Var.getClass();
        int size = qr3Var.size();
        for (int i = 0; i < size; i++) {
            oha.m17995a(or3Var, qr3Var.m20122f(i), qr3Var.m20124h(i));
        }
    }
}
