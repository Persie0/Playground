package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ma8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final String f50842a;

    /* JADX INFO: renamed from: b */
    public final int f50843b;

    public ma8(String str, int i) {
        str.getClass();
        this.f50842a = str;
        this.f50843b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma8)) {
            return false;
        }
        ma8 ma8Var = (ma8) obj;
        return fa4.m11650l(this.f50842a, ma8Var.f50842a) && this.f50843b == ma8Var.f50843b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50843b) + (this.f50842a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSessionItemStatusChanged(term=" + this.f50842a + ", status=" + this.f50843b + ")";
    }
}
