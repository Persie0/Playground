package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oz3 {

    /* JADX INFO: renamed from: a */
    public final int f55322a;

    public final boolean equals(Object obj) {
        if (obj instanceof oz3) {
            return this.f55322a == ((oz3) obj).f55322a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55322a);
    }

    public final String toString() {
        int i = this.f55322a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
