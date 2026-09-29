package p002a1;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a {

    /* JADX INFO: renamed from: a */
    public final int f4a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0006a) {
            return this.f4a == ((C0006a) obj).f4a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4a);
    }

    public final String toString() {
        int i10 = this.f4a;
        boolean z10 = false;
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            z10 = true;
        }
        return z10 ? "Keyboard" : "Error";
    }
}
