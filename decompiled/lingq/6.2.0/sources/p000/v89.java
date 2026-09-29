package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v89 {

    /* JADX INFO: renamed from: c */
    public static final v89 f65026c = new v89(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f65027a;

    /* JADX INFO: renamed from: b */
    public final int f65028b;

    static {
        new v89(0, 0);
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public v89(int i, int i2) {
        bna.m3969q((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f65027a = i;
        this.f65028b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v89) {
            v89 v89Var = (v89) obj;
            if (this.f65027a == v89Var.f65027a && this.f65028b == v89Var.f65028b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f65027a;
        int i2 = i << 16;
        return this.f65028b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.f65027a + "x" + this.f65028b;
    }
}
