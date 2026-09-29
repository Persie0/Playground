package p000;

import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.p002ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class qh7 {

    /* JADX INFO: renamed from: a */
    public final int f57785a;

    /* JADX INFO: renamed from: b */
    public final boolean f57786b;

    /* JADX INFO: renamed from: c */
    public final boolean f57787c;

    /* JADX INFO: renamed from: d */
    public final boolean f57788d;

    /* JADX INFO: renamed from: e */
    public final boolean f57789e;

    /* JADX INFO: renamed from: f */
    public final int f57790f;

    public qh7(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        zf1 zf1Var = AbstractC0456d.f5291a;
        int i = !z ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.f57785a = i;
        this.f57786b = z3;
        this.f57787c = true;
        this.f57788d = true;
        this.f57789e = true;
        this.f57790f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh7)) {
            return false;
        }
        qh7 qh7Var = (qh7) obj;
        return this.f57785a == qh7Var.f57785a && this.f57786b == qh7Var.f57786b && this.f57787c == qh7Var.f57787c && this.f57788d == qh7Var.f57788d && this.f57789e == qh7Var.f57789e && this.f57790f == qh7Var.f57790f;
    }

    public final int hashCode() {
        return (g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(this.f57785a * 31, 31, this.f57786b), 31, this.f57787c), 31, this.f57788d), 31, this.f57789e), 31, false) + this.f57790f) * 31;
    }

    public qh7(int i, boolean z) {
        this((i & 1) != 0 ? false : z, SecureFlagPolicy.Inherit, (i & 8) != 0);
    }
}
