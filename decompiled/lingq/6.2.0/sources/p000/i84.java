package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i84 extends g84 {

    /* JADX INFO: renamed from: d */
    public static final i84 f43682d = new i84(1, 0, 1);

    @Override // p000.g84
    public final boolean equals(Object obj) {
        if (!(obj instanceof i84)) {
            return false;
        }
        if (isEmpty() && ((i84) obj).isEmpty()) {
            return true;
        }
        i84 i84Var = (i84) obj;
        return this.f40379a == i84Var.f40379a && this.f40380b == i84Var.f40380b;
    }

    @Override // p000.g84
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f40379a * 31) + this.f40380b;
    }

    @Override // p000.g84
    public final boolean isEmpty() {
        return this.f40379a > this.f40380b;
    }

    @Override // p000.g84
    public final String toString() {
        return this.f40379a + ".." + this.f40380b;
    }
}
