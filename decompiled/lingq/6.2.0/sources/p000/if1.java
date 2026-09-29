package p000;

/* JADX INFO: loaded from: classes.dex */
public final class if1 {

    /* JADX INFO: renamed from: a */
    public final int f44035a;

    public /* synthetic */ if1(int i) {
        this.f44035a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m13860a(int i) {
        return wq1.m24114j("CompositingStrategy(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof if1) {
            return this.f44035a == ((if1) obj).f44035a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44035a);
    }

    public final String toString() {
        return m13860a(this.f44035a);
    }
}
