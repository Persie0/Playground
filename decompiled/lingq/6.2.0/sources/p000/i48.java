package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class i48 implements k48 {

    /* JADX INFO: renamed from: a */
    public final int f43518a;

    /* JADX INFO: renamed from: b */
    public final int f43519b;

    public /* synthetic */ i48(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m13654a() {
        return this.f43519b;
    }

    /* JADX INFO: renamed from: b */
    public final int m13655b() {
        return this.f43518a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i48)) {
            return false;
        }
        i48 i48Var = (i48) obj;
        return this.f43518a == i48Var.f43518a && this.f43519b == i48Var.f43519b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43519b) + (Integer.hashCode(this.f43518a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f43518a, this.f43519b, "InvalidFields(username=", ", email=", ")");
    }

    public i48(int i, int i2) {
        this.f43518a = i;
        this.f43519b = i2;
    }
}
