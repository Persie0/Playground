package p000;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final Method f53777p;

    /* JADX INFO: renamed from: q */
    public final int f53778q;

    /* JADX INFO: renamed from: r */
    public final fm1 f53779r;

    public o37(Method method, int i, fm1 fm1Var) {
        this.f53777p = method;
        this.f53778q = i;
        this.f53779r = fm1Var;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        int i = this.f53778q;
        Method method = this.f53777p;
        if (obj == null) {
            throw ci8.m4699L(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            b78Var.f8060k = (z68) this.f53779r.convert(obj);
        } catch (IOException e) {
            throw ci8.m4700M(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
