package p352r1;

/* JADX INFO: renamed from: r1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8706g {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public /* synthetic */ C8706g() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static String m16950a(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return "None";
        }
        if (i10 == 1) {
            return "Default";
        }
        if (i10 == 2) {
            return "Go";
        }
        if (i10 == 3) {
            return "Search";
        }
        if (i10 == 4) {
            return "Send";
        }
        if (i10 == 5) {
            return "Previous";
        }
        if (i10 == 6) {
            return "Next";
        }
        if (i10 == 7) {
            z10 = true;
        }
        return z10 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8706g)) {
            return false;
        }
        ((C8706g) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return m16950a(0);
    }
}
