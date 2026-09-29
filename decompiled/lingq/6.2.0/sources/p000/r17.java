package p000;

/* JADX INFO: loaded from: classes.dex */
public final class r17 implements nn3 {

    /* JADX INFO: renamed from: a */
    public final n17 f58487a;

    /* JADX INFO: renamed from: b */
    public final n17 f58488b;

    /* JADX INFO: renamed from: c */
    public final n17 f58489c;

    /* JADX INFO: renamed from: d */
    public final n17 f58490d;

    /* JADX INFO: renamed from: e */
    public final n17 f58491e;

    /* JADX INFO: renamed from: f */
    public final n17 f58492f;

    public /* synthetic */ r17(n17 n17Var, n17 n17Var2, n17 n17Var3, n17 n17Var4) {
        this(new n17(3, 0.0f), n17Var, n17Var2, new n17(3, 0.0f), n17Var3, n17Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r17)) {
            return false;
        }
        r17 r17Var = (r17) obj;
        return fa4.m11650l(this.f58487a, r17Var.f58487a) && fa4.m11650l(this.f58488b, r17Var.f58488b) && fa4.m11650l(this.f58489c, r17Var.f58489c) && fa4.m11650l(this.f58490d, r17Var.f58490d) && fa4.m11650l(this.f58491e, r17Var.f58491e) && fa4.m11650l(this.f58492f, r17Var.f58492f);
    }

    public final int hashCode() {
        return this.f58492f.hashCode() + ((this.f58491e.hashCode() + ((this.f58490d.hashCode() + ((this.f58489c.hashCode() + ((this.f58488b.hashCode() + (this.f58487a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f58487a + ", start=" + this.f58488b + ", top=" + this.f58489c + ", right=" + this.f58490d + ", end=" + this.f58491e + ", bottom=" + this.f58492f + ')';
    }

    public r17(n17 n17Var, n17 n17Var2, n17 n17Var3, n17 n17Var4, n17 n17Var5, n17 n17Var6) {
        this.f58487a = n17Var;
        this.f58488b = n17Var2;
        this.f58489c = n17Var3;
        this.f58490d = n17Var4;
        this.f58491e = n17Var5;
        this.f58492f = n17Var6;
    }
}
