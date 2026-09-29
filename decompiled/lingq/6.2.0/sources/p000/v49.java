package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v49 {

    /* JADX INFO: renamed from: a */
    public final si8 f64855a;

    /* JADX INFO: renamed from: b */
    public final si8 f64856b;

    /* JADX INFO: renamed from: c */
    public final si8 f64857c;

    /* JADX INFO: renamed from: d */
    public final si8 f64858d;

    /* JADX INFO: renamed from: e */
    public final si8 f64859e;

    /* JADX INFO: renamed from: f */
    public final si8 f64860f;

    /* JADX INFO: renamed from: g */
    public final si8 f64861g;

    /* JADX INFO: renamed from: h */
    public final si8 f64862h;

    public v49(si8 si8Var, si8 si8Var2, si8 si8Var3, si8 si8Var4, si8 si8Var5) {
        si8 si8Var6 = w39.f66336e;
        si8 si8Var7 = w39.f66338g;
        si8 si8Var8 = w39.f66339h;
        this.f64855a = si8Var;
        this.f64856b = si8Var2;
        this.f64857c = si8Var3;
        this.f64858d = si8Var4;
        this.f64859e = si8Var5;
        this.f64860f = si8Var6;
        this.f64861g = si8Var7;
        this.f64862h = si8Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v49)) {
            return false;
        }
        v49 v49Var = (v49) obj;
        return fa4.m11650l(this.f64855a, v49Var.f64855a) && fa4.m11650l(this.f64856b, v49Var.f64856b) && fa4.m11650l(this.f64857c, v49Var.f64857c) && fa4.m11650l(this.f64858d, v49Var.f64858d) && fa4.m11650l(this.f64859e, v49Var.f64859e) && fa4.m11650l(this.f64860f, v49Var.f64860f) && fa4.m11650l(this.f64861g, v49Var.f64861g) && fa4.m11650l(this.f64862h, v49Var.f64862h);
    }

    public final int hashCode() {
        return this.f64862h.hashCode() + ((this.f64861g.hashCode() + ((this.f64860f.hashCode() + ((this.f64859e.hashCode() + ((this.f64858d.hashCode() + ((this.f64857c.hashCode() + ((this.f64856b.hashCode() + (this.f64855a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f64855a + ", small=" + this.f64856b + ", medium=" + this.f64857c + ", large=" + this.f64858d + ", largeIncreased=" + this.f64860f + ", extraLarge=" + this.f64859e + ", extralargeIncreased=" + this.f64861g + ", extraExtraLarge=" + this.f64862h + ')';
    }

    public v49() {
        this(w39.f66332a, w39.f66333b, w39.f66334c, w39.f66335d, w39.f66337f);
    }
}
