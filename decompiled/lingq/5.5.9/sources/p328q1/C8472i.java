package p328q1;

/* JADX INFO: renamed from: q1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8472i {

    /* JADX INFO: renamed from: a */
    public final int f45644a;

    /* JADX INFO: renamed from: a */
    public static String m16547a(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "All";
        }
        if (i10 == 2) {
            return "Weight";
        }
        if (i10 == 3) {
            z10 = true;
        }
        return z10 ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8472i) {
            return this.f45644a == ((C8472i) obj).f45644a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45644a);
    }

    public final String toString() {
        return m16547a(this.f45644a);
    }
}
