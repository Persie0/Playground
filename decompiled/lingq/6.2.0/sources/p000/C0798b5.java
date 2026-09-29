package p000;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0798b5 extends AbstractC2952e5 {

    /* JADX INFO: renamed from: a */
    public final int f7943a;

    /* JADX INFO: renamed from: b */
    public final String f7944b;

    public C0798b5(int i, String str) {
        str.getClass();
        this.f7943a = i;
        this.f7944b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798b5)) {
            return false;
        }
        C0798b5 c0798b5 = (C0798b5) obj;
        return this.f7943a == c0798b5.f7943a && fa4.m11650l(this.f7944b, c0798b5.f7944b);
    }

    public final int hashCode() {
        return this.f7944b.hashCode() + (Integer.hashCode(this.f7943a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f7943a, "KnownWordsMilestone(words=", ", language=", this.f7944b, ")");
    }
}
