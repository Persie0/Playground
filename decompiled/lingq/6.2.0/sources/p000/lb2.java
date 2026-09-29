package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lb2 {

    /* JADX INFO: renamed from: a */
    public final rp7 f49390a;

    /* JADX INFO: renamed from: b */
    public final int f49391b;

    /* JADX INFO: renamed from: c */
    public final int f49392c;

    public lb2(rp7 rp7Var, int i, int i2) {
        wfb.m23913h(rp7Var, "Null dependency anInterface.");
        this.f49390a = rp7Var;
        this.f49391b = i;
        this.f49392c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static lb2 m16057a(Class cls) {
        return new lb2(0, 1, cls);
    }

    /* JADX INFO: renamed from: b */
    public static lb2 m16058b(rp7 rp7Var) {
        return new lb2(rp7Var, 1, 0);
    }

    /* JADX INFO: renamed from: c */
    public static lb2 m16059c(Class cls) {
        return new lb2(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        return this.f49390a.equals(lb2Var.f49390a) && this.f49391b == lb2Var.f49391b && this.f49392c == lb2Var.f49392c;
    }

    public final int hashCode() {
        return this.f49392c ^ ((((this.f49390a.hashCode() ^ 1000003) * 1000003) ^ this.f49391b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f49390a);
        sb.append(", type=");
        int i = this.f49391b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f49392c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(ux5.m22988k(i2, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return AbstractC3393o1.m17738m(sb, str2, "}");
    }

    public lb2(int i, int i2, Class cls) {
        this(rp7.m20740a(cls), i, i2);
    }
}
