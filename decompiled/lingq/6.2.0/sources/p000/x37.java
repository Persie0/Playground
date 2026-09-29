package p000;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class x37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final Method f67725p;

    /* JADX INFO: renamed from: q */
    public final int f67726q;

    public x37(int i, Method method) {
        this.f67725p = method;
        this.f67726q = i;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        if (obj != null) {
            b78Var.f8052c = obj.toString();
        } else {
            throw ci8.m4699L(this.f67725p, this.f67726q, "@Url parameter is null.", new Object[0]);
        }
    }
}
