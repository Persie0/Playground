package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lg2 extends pvc {

    /* JADX INFO: renamed from: n */
    public final int f49621n;

    public lg2(int i) {
        this.f49621n = i;
        if (i > 0) {
            return;
        }
        C3386nv.m17626m("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lg2) {
            return this.f49621n == ((lg2) obj).f49621n;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49621n;
    }

    public final String toString() {
        return String.valueOf(this.f49621n);
    }
}
