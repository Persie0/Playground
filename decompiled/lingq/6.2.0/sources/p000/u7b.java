package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u7b {

    /* JADX INFO: renamed from: a */
    public final ws3 f63524a;

    /* JADX INFO: renamed from: b */
    public final ws3 f63525b;

    /* JADX INFO: renamed from: c */
    public final ws3 f63526c;

    /* JADX INFO: renamed from: d */
    public final String f63527d;

    /* JADX INFO: renamed from: e */
    public final String f63528e;

    public u7b(ws3 ws3Var, ws3 ws3Var2, ws3 ws3Var3, String str, String str2) {
        this.f63524a = ws3Var;
        this.f63525b = ws3Var2;
        this.f63526c = ws3Var3;
        this.f63527d = str;
        this.f63528e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7b)) {
            return false;
        }
        u7b u7bVar = (u7b) obj;
        return this.f63524a.equals(u7bVar.f63524a) && this.f63525b.equals(u7bVar.f63525b) && this.f63526c.equals(u7bVar.f63526c) && this.f63527d.equals(u7bVar.f63527d) && this.f63528e.equals(u7bVar.f63528e);
    }

    public final int hashCode() {
        return this.f63528e.hashCode() + ux5.m22980c((this.f63526c.hashCode() + ((this.f63525b.hashCode() + (this.f63524a.hashCode() * 31)) * 31)) * 31, this.f63527d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WordStatusColors(new=");
        sb.append(this.f63524a);
        sb.append(", ignored=");
        sb.append(this.f63525b);
        sb.append(", known=");
        sb.append(this.f63526c);
        sb.append(", border=");
        sb.append(this.f63527d);
        sb.append(", foreground=");
        return AbstractC3393o1.m17738m(sb, this.f63528e, ")");
    }
}
