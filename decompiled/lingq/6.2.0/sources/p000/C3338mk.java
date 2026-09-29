package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: mk */
/* JADX INFO: loaded from: classes.dex */
public final class C3338mk {

    /* JADX INFO: renamed from: a */
    public o39 f51426a;

    /* JADX INFO: renamed from: b */
    public long f51427b;

    /* JADX INFO: renamed from: c */
    public LayoutDirection f51428c;

    /* JADX INFO: renamed from: d */
    public float f51429d;

    public C3338mk(o39 o39Var, long j, LayoutDirection layoutDirection, float f, k39 k39Var) {
        this.f51426a = o39Var;
        this.f51427b = j;
        this.f51428c = layoutDirection;
        this.f51429d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3338mk)) {
            return false;
        }
        C3338mk c3338mk = (C3338mk) obj;
        return fa4.m11650l(this.f51426a, c3338mk.f51426a) && x89.m24404a(this.f51427b, c3338mk.f51427b) && this.f51428c == c3338mk.f51428c && Float.compare(this.f51429d, c3338mk.f51429d) == 0 && fa4.m11650l(null, null);
    }

    public final int hashCode() {
        return wq1.m24105a((this.f51428c.hashCode() + ux5.m22981d(this.f51427b, this.f51426a.hashCode() * 31, 31)) * 31, this.f51429d, 31);
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.f51426a + ", size=" + ((Object) x89.m24409f(this.f51427b)) + ", layoutDirection=" + this.f51428c + ", density=" + this.f51429d + ", shadow=" + ((Object) null) + ')';
    }
}
