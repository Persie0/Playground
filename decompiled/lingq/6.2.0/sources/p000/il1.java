package p000;

/* JADX INFO: loaded from: classes.dex */
public final class il1 {

    /* JADX INFO: renamed from: a */
    public final int f44253a;

    /* JADX INFO: renamed from: a */
    public static String m14010a(int i) {
        return wq1.m24114j("ContentScale(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof il1) {
            return this.f44253a == ((il1) obj).f44253a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44253a);
    }

    public final String toString() {
        return m14010a(this.f44253a);
    }
}
