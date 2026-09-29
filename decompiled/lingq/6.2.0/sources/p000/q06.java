package p000;

import androidx.compose.p002ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class q06 {

    /* JADX INFO: renamed from: a */
    public final SecureFlagPolicy f57093a = SecureFlagPolicy.Inherit;

    /* JADX INFO: renamed from: b */
    public final boolean f57094b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f57095c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q06)) {
            return false;
        }
        q06 q06Var = (q06) obj;
        return this.f57093a == q06Var.f57093a && this.f57095c == q06Var.f57095c && this.f57094b == q06Var.f57094b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57095c) + g9a.m12428e(this.f57093a.hashCode() * 31, 29791, this.f57094b);
    }
}
