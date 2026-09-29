package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dt2 extends et2 {

    /* JADX INFO: renamed from: a */
    public final int f36193a;

    /* JADX INFO: renamed from: b */
    public final String f36194b;

    public dt2(int i, String str) {
        str.getClass();
        this.f36193a = i;
        this.f36194b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt2)) {
            return false;
        }
        dt2 dt2Var = (dt2) obj;
        return this.f36193a == dt2Var.f36193a && fa4.m11650l(this.f36194b, dt2Var.f36194b);
    }

    public final int hashCode() {
        return this.f36194b.hashCode() + (Integer.hashCode(this.f36193a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f36193a, "TranscriptionLimit(limit=", ", dateRenewal=", this.f36194b, ")");
    }
}
