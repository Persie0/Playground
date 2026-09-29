package androidx.compose.p002ui;

import p000.e16;
import p000.fa4;
import p000.ux5;
import p000.vi3;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0286a implements e16 {

    /* JADX INFO: renamed from: a */
    public final e16 f3815a;

    /* JADX INFO: renamed from: b */
    public final e16 f3816b;

    public C0286a(e16 e16Var, e16 e16Var2) {
        this.f3815a = e16Var;
        this.f3816b = e16Var2;
    }

    @Override // p000.e16
    /* JADX INFO: renamed from: a */
    public final Object mo1318a(Object obj, zi3 zi3Var) {
        return this.f3816b.mo1318a(this.f3815a.mo1318a(obj, zi3Var), zi3Var);
    }

    @Override // p000.e16
    /* JADX INFO: renamed from: c */
    public final boolean mo1319c(vi3 vi3Var) {
        return this.f3815a.mo1319c(vi3Var) && this.f3816b.mo1319c(vi3Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0286a)) {
            return false;
        }
        C0286a c0286a = (C0286a) obj;
        return this.f3815a.equals(c0286a.f3815a) && fa4.m11650l(this.f3816b, c0286a.f3816b);
    }

    public final int hashCode() {
        return (this.f3816b.hashCode() * 31) + this.f3815a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("["), (String) mo1318a("", CombinedModifier$toString$1.f3805b), ']');
    }
}
