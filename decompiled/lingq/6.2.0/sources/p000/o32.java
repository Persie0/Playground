package p000;

import android.text.TextUtils;
import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class o32 {

    /* JADX INFO: renamed from: a */
    public final String f53760a;

    /* JADX INFO: renamed from: b */
    public final C0713b f53761b;

    /* JADX INFO: renamed from: c */
    public final C0713b f53762c;

    /* JADX INFO: renamed from: d */
    public final int f53763d;

    /* JADX INFO: renamed from: e */
    public final int f53764e;

    public o32(String str, C0713b c0713b, C0713b c0713b2, int i, int i2) {
        bna.m3969q(i == 0 || i2 == 0);
        bna.m3969q(true ^ TextUtils.isEmpty(str));
        this.f53760a = str;
        c0713b.getClass();
        this.f53761b = c0713b;
        c0713b2.getClass();
        this.f53762c = c0713b2;
        this.f53763d = i;
        this.f53764e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o32.class == obj.getClass()) {
            o32 o32Var = (o32) obj;
            if (this.f53763d == o32Var.f53763d && this.f53764e == o32Var.f53764e && this.f53760a.equals(o32Var.f53760a) && this.f53761b.equals(o32Var.f53761b) && this.f53762c.equals(o32Var.f53762c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f53762c.hashCode() + ((this.f53761b.hashCode() + ux5.m22980c((((527 + this.f53763d) * 31) + this.f53764e) * 31, this.f53760a, 31)) * 31);
    }
}
