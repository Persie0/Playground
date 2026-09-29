package p000;

import androidx.compose.material3.SnackbarResult;

/* JADX INFO: loaded from: classes2.dex */
public final class vb9 implements sb9 {

    /* JADX INFO: renamed from: a */
    public final wb9 f65169a;

    /* JADX INFO: renamed from: b */
    public final sm0 f65170b;

    public vb9(wb9 wb9Var, sm0 sm0Var) {
        this.f65169a = wb9Var;
        this.f65170b = sm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m23217a() {
        sm0 sm0Var = this.f65170b;
        if (sm0Var.m21467t() instanceof dm6) {
            sm0Var.resumeWith(SnackbarResult.Dismissed);
        }
    }

    /* JADX INFO: renamed from: b */
    public final wb9 m23218b() {
        return this.f65169a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vb9.class == obj.getClass()) {
            vb9 vb9Var = (vb9) obj;
            return fa4.m11650l(this.f65169a, vb9Var.f65169a) && this.f65170b == vb9Var.f65170b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f65170b.hashCode() + (this.f65169a.hashCode() * 31);
    }
}
