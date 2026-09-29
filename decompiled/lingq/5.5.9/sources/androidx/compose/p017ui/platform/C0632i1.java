package androidx.compose.p017ui.platform;

import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0632i1 {

    /* JADX INFO: renamed from: a */
    public final String f4318a;

    /* JADX INFO: renamed from: b */
    public final Object f4319b;

    public C0632i1(Object obj, String str) {
        this.f4318a = str;
        this.f4319b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0632i1)) {
            return false;
        }
        C0632i1 c0632i1 = (C0632i1) obj;
        return C5207g.m11106a(this.f4318a, c0632i1.f4318a) && C5207g.m11106a(this.f4319b, c0632i1.f4319b);
    }

    public final int hashCode() {
        int iHashCode = this.f4318a.hashCode() * 31;
        Object obj = this.f4319b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f4318a + ", value=" + this.f4319b + ')';
    }
}
