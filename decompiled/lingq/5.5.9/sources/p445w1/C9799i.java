package p445w1;

/* JADX INFO: renamed from: w1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9799i {

    /* JADX INFO: renamed from: a */
    public final int f49915a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9799i) {
            return this.f49915a == ((C9799i) obj).f49915a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49915a);
    }

    public final String toString() {
        int i10 = this.f49915a;
        if (i10 == 1) {
            return "Ltr";
        }
        if (i10 == 2) {
            return "Rtl";
        }
        if (i10 == 3) {
            return "Content";
        }
        if (i10 == 4) {
            return "ContentOrLtr";
        }
        return i10 == 5 ? "ContentOrRtl" : "Invalid";
    }
}
