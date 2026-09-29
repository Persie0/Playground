package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yd5 {

    /* JADX INFO: renamed from: a */
    public final ws3 f69687a;

    /* JADX INFO: renamed from: b */
    public final ws3 f69688b;

    /* JADX INFO: renamed from: c */
    public final ws3 f69689c;

    /* JADX INFO: renamed from: d */
    public final ws3 f69690d;

    /* JADX INFO: renamed from: e */
    public final ws3 f69691e;

    /* JADX INFO: renamed from: f */
    public final String f69692f;

    /* JADX INFO: renamed from: g */
    public final String f69693g;

    public yd5(ws3 ws3Var, ws3 ws3Var2, ws3 ws3Var3, ws3 ws3Var4, ws3 ws3Var5, String str, String str2) {
        this.f69687a = ws3Var;
        this.f69688b = ws3Var2;
        this.f69689c = ws3Var3;
        this.f69690d = ws3Var4;
        this.f69691e = ws3Var5;
        this.f69692f = str;
        this.f69693g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd5)) {
            return false;
        }
        yd5 yd5Var = (yd5) obj;
        return this.f69687a.equals(yd5Var.f69687a) && this.f69688b.equals(yd5Var.f69688b) && this.f69689c.equals(yd5Var.f69689c) && this.f69690d.equals(yd5Var.f69690d) && this.f69691e.equals(yd5Var.f69691e) && this.f69692f.equals(yd5Var.f69692f) && this.f69693g.equals(yd5Var.f69693g);
    }

    public final int hashCode() {
        return this.f69693g.hashCode() + ux5.m22980c((this.f69691e.hashCode() + ((this.f69690d.hashCode() + ((this.f69689c.hashCode() + ((this.f69688b.hashCode() + (this.f69687a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, this.f69692f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LingQStatusColors(new=");
        sb.append(this.f69687a);
        sb.append(", recognized=");
        sb.append(this.f69688b);
        sb.append(", familiar=");
        sb.append(this.f69689c);
        sb.append(", known=");
        sb.append(this.f69690d);
        sb.append(", learned=");
        sb.append(this.f69691e);
        sb.append(", border=");
        sb.append(this.f69692f);
        sb.append(", foreground=");
        return AbstractC3393o1.m17738m(sb, this.f69693g, ")");
    }
}
