package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class we8 {

    /* JADX INFO: renamed from: a */
    public final String f66727a;

    /* JADX INFO: renamed from: b */
    public final String f66728b;

    /* JADX INFO: renamed from: c */
    public final int f66729c;

    /* JADX INFO: renamed from: d */
    public final int f66730d;

    /* JADX INFO: renamed from: e */
    public final int f66731e;

    /* JADX INFO: renamed from: f */
    public final Integer f66732f;

    /* JADX INFO: renamed from: g */
    public final vs3 f66733g;

    /* JADX INFO: renamed from: h */
    public final boolean f66734h;

    public we8(String str, String str2, int i, int i2, int i3, Integer num, vs3 vs3Var, boolean z) {
        str.getClass();
        vs3Var.getClass();
        this.f66727a = str;
        this.f66728b = str2;
        this.f66729c = i;
        this.f66730d = i2;
        this.f66731e = i3;
        this.f66732f = num;
        this.f66733g = vs3Var;
        this.f66734h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we8)) {
            return false;
        }
        we8 we8Var = (we8) obj;
        return fa4.m11650l(this.f66727a, we8Var.f66727a) && this.f66728b.equals(we8Var.f66728b) && this.f66729c == we8Var.f66729c && this.f66730d == we8Var.f66730d && this.f66731e == we8Var.f66731e && fa4.m11650l(this.f66732f, we8Var.f66732f) && fa4.m11650l(this.f66733g, we8Var.f66733g) && this.f66734h == we8Var.f66734h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f66731e, wq1.m24106b(this.f66730d, wq1.m24106b(this.f66729c, ux5.m22980c(this.f66727a.hashCode() * 31, this.f66728b, 31), 31), 31), 31);
        Integer num = this.f66732f;
        return Boolean.hashCode(this.f66734h) + ((this.f66733g.hashCode() + ((iM24106b + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ReviewSessionCompleteItemState(term=", this.f66727a, ", translation=", this.f66728b, ", correctCount=");
        hn1.m13360j(this.f66729c, this.f66730d, ", incorrectCount=", ", status=", sbM23000w);
        sbM23000w.append(this.f66731e);
        sbM23000w.append(", extendedStatus=");
        sbM23000w.append(this.f66732f);
        sbM23000w.append(", colorScheme=");
        sbM23000w.append(this.f66733g);
        sbM23000w.append(", showTts=");
        sbM23000w.append(this.f66734h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
