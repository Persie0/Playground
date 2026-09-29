package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b68 {

    /* JADX INFO: renamed from: c */
    public static final b68 f8018c = new b68(0, false);

    /* JADX INFO: renamed from: a */
    public final int f8019a;

    /* JADX INFO: renamed from: b */
    public final boolean f8020b;

    public b68(int i, boolean z) {
        this.f8019a = i;
        this.f8020b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b68.class != obj.getClass()) {
            return false;
        }
        b68 b68Var = (b68) obj;
        return this.f8019a == b68Var.f8019a && this.f8020b == b68Var.f8020b;
    }

    public final int hashCode() {
        return (this.f8019a << 1) + (this.f8020b ? 1 : 0);
    }
}
