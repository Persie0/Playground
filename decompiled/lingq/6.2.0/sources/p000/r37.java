package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final String f58555p;

    /* JADX INFO: renamed from: q */
    public final nj0 f58556q;

    /* JADX INFO: renamed from: r */
    public final boolean f58557r;

    public r37(String str, boolean z) {
        nj0 nj0Var = nj0.f52807b;
        Objects.requireNonNull(str, "name == null");
        this.f58555p = str;
        this.f58556q = nj0Var;
        this.f58557r = z;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        if (obj == null) {
            return;
        }
        this.f58556q.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        b78Var.m3400b(this.f58555p, string, this.f58557r);
    }
}
