package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zl5 {

    /* JADX INFO: renamed from: a */
    public final gl5 f71701a;

    /* JADX INFO: renamed from: b */
    public final Throwable f71702b;

    public zl5(gl5 gl5Var) {
        this.f71701a = gl5Var;
        this.f71702b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl5)) {
            return false;
        }
        zl5 zl5Var = (zl5) obj;
        gl5 gl5Var = this.f71701a;
        if (gl5Var != null && gl5Var == zl5Var.f71701a) {
            return true;
        }
        Throwable th = this.f71702b;
        if (th == null || zl5Var.f71702b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f71701a, this.f71702b});
    }

    public zl5(Throwable th) {
        this.f71702b = th;
        this.f71701a = null;
    }
}
