package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ac3 {

    /* JADX INFO: renamed from: a */
    public final int f482a;

    public final boolean equals(Object obj) {
        if (obj instanceof ac3) {
            return this.f482a == ((ac3) obj).f482a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f482a);
    }

    public final String toString() {
        return wq1.m24114j("FontWeight(value=", this.f482a, ')');
    }
}
