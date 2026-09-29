package p328q1;

/* JADX INFO: renamed from: q1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8471h {

    /* JADX INFO: renamed from: a */
    public final int f45643a;

    /* JADX INFO: renamed from: a */
    public static String m16546a(int i10) {
        if (i10 == 0) {
            return "Normal";
        }
        return i10 == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8471h) {
            return this.f45643a == ((C8471h) obj).f45643a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45643a);
    }

    public final String toString() {
        return m16546a(this.f45643a);
    }
}
