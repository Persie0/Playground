package p351r0;

/* JADX INFO: renamed from: r0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8684c {

    /* JADX INFO: renamed from: a */
    public final int f46277a;

    /* JADX INFO: renamed from: a */
    public static String m16937a(int i10) {
        boolean z10 = false;
        if (i10 == 1) {
            return "Next";
        }
        if (i10 == 2) {
            return "Previous";
        }
        if (i10 == 3) {
            return "Left";
        }
        if (i10 == 4) {
            return "Right";
        }
        if (i10 == 5) {
            return "Up";
        }
        if (i10 == 6) {
            return "Down";
        }
        if (i10 == 7) {
            return "Enter";
        }
        if (i10 == 8) {
            z10 = true;
        }
        return z10 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8684c) {
            return this.f46277a == ((C8684c) obj).f46277a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46277a);
    }

    public final String toString() {
        return m16937a(this.f46277a);
    }
}
