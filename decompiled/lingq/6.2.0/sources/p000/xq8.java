package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final boolean f68544a;

    /* JADX INFO: renamed from: b */
    public final String f68545b;

    public xq8(boolean z, String str) {
        this.f68544a = z;
        this.f68545b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq8)) {
            return false;
        }
        xq8 xq8Var = (xq8) obj;
        return this.f68544a == xq8Var.f68544a && this.f68545b.equals(xq8Var.f68545b);
    }

    public final int hashCode() {
        return this.f68545b.hashCode() + (Boolean.hashCode(this.f68544a) * 31);
    }

    public final String toString() {
        return "Search(defaultSelected=" + this.f68544a + ", query=" + this.f68545b + ")";
    }
}
