package p445w1;

/* JADX INFO: renamed from: w1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9797g {

    /* JADX INFO: renamed from: a */
    public final int f49910a;

    public final boolean equals(Object obj) {
        if (obj instanceof C9797g) {
            return this.f49910a == ((C9797g) obj).f49910a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49910a);
    }

    public final String toString() {
        int i10 = this.f49910a;
        if (i10 == 1) {
            return "Left";
        }
        if (i10 == 2) {
            return "Right";
        }
        if (i10 == 3) {
            return "Center";
        }
        if (i10 == 4) {
            return "Justify";
        }
        if (i10 == 5) {
            return "Start";
        }
        return i10 == 6 ? "End" : "Invalid";
    }
}
