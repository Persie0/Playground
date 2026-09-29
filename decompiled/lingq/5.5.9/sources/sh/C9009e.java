package sh;

import dm.C5207g;

/* JADX INFO: renamed from: sh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9009e {

    /* JADX INFO: renamed from: a */
    public final float f47230a;

    /* JADX INFO: renamed from: b */
    public final String f47231b;

    public C9009e() {
        this(0);
    }

    public C9009e(float f3, String str) {
        C5207g.m11111f(str, "label");
        this.f47230a = f3;
        this.f47231b = str;
    }

    public /* synthetic */ C9009e(int i10) {
        this(1.0f, "1x");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9009e)) {
            return false;
        }
        C9009e c9009e = (C9009e) obj;
        return Float.compare(this.f47230a, c9009e.f47230a) == 0 && C5207g.m11106a(this.f47231b, c9009e.f47231b);
    }

    public final int hashCode() {
        return this.f47231b.hashCode() + (Float.hashCode(this.f47230a) * 31);
    }

    public final String toString() {
        return "PlayerPlaybackRate(rate=" + this.f47230a + ", label=" + this.f47231b + ")";
    }
}
