package p000;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class xk7 {
    public static final wk7 Companion = new wk7();

    /* JADX INFO: renamed from: a */
    public final int f68316a;

    /* JADX INFO: renamed from: b */
    public final String f68317b;

    public /* synthetic */ xk7(int i, String str, int i2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, vk7.f65541a.getDescriptor());
            throw null;
        }
        this.f68316a = i2;
        this.f68317b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk7)) {
            return false;
        }
        xk7 xk7Var = (xk7) obj;
        return this.f68316a == xk7Var.f68316a && fa4.m11650l(this.f68317b, xk7Var.f68317b);
    }

    public final int hashCode() {
        return this.f68317b.hashCode() + (Integer.hashCode(this.f68316a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f68316a);
        sb.append(", uuid=");
        return ux5.m22992o(sb, this.f68317b, ')');
    }

    public xk7(int i, String str) {
        str.getClass();
        this.f68316a = i;
        this.f68317b = str;
    }
}
