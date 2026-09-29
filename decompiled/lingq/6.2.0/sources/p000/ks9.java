package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ks9 {

    /* JADX INFO: renamed from: a */
    public final int f48393a;

    public /* synthetic */ ks9(int i) {
        this.f48393a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ks9 m15662a() {
        return new ks9(3);
    }

    /* JADX INFO: renamed from: b */
    public static String m15663b(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ks9) {
            return this.f48393a == ((ks9) obj).f48393a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48393a);
    }

    public final String toString() {
        return m15663b(this.f48393a);
    }
}
