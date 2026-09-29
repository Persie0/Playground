package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 {

    /* JADX INFO: renamed from: a */
    public fb2 f71734a;

    /* JADX INFO: renamed from: b */
    public LayoutDirection f71735b;

    /* JADX INFO: renamed from: c */
    public ym0 f71736c;

    /* JADX INFO: renamed from: d */
    public long f71737d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm0)) {
            return false;
        }
        zm0 zm0Var = (zm0) obj;
        return fa4.m11650l(this.f71734a, zm0Var.f71734a) && this.f71735b == zm0Var.f71735b && fa4.m11650l(this.f71736c, zm0Var.f71736c) && x89.m24404a(this.f71737d, zm0Var.f71737d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f71737d) + ((this.f71736c.hashCode() + ((this.f71735b.hashCode() + (this.f71734a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f71734a + ", layoutDirection=" + this.f71735b + ", canvas=" + this.f71736c + ", size=" + ((Object) x89.m24409f(this.f71737d)) + ')';
    }
}
