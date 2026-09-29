package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class gl3 implements o39 {

    /* JADX INFO: renamed from: a */
    public final C3357n2 f40941a;

    public gl3(C3357n2 c3357n2) {
        this.f40941a = c3357n2;
    }

    @Override // p000.o39
    /* JADX INFO: renamed from: b */
    public final pk9 mo12726b(long j, LayoutDirection layoutDirection, fb2 fb2Var) {
        C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
        this.f40941a.invoke(c3500qjM22757a, new x89(j), layoutDirection);
        c3500qjM22757a.f57839a.close();
        return new a07(c3500qjM22757a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gl3 gl3Var = obj instanceof gl3 ? (gl3) obj : null;
        return (gl3Var != null ? gl3Var.f40941a : null) == this.f40941a;
    }

    public final int hashCode() {
        return this.f40941a.hashCode();
    }
}
