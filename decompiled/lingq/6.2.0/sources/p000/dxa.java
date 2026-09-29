package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class dxa extends fxa {

    /* JADX INFO: renamed from: a */
    public final String f36401a;

    /* JADX INFO: renamed from: b */
    public final int f36402b;

    public dxa(String str, int i) {
        str.getClass();
        this.f36401a = str;
        this.f36402b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxa)) {
            return false;
        }
        dxa dxaVar = (dxa) obj;
        return fa4.m11650l(this.f36401a, dxaVar.f36401a) && this.f36402b == dxaVar.f36402b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36402b) + (this.f36401a.hashCode() * 31);
    }

    public final String toString() {
        return "OnStatusChanged(term=" + this.f36401a + ", status=" + this.f36402b + ")";
    }
}
