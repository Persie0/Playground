package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pa6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final String f55890b;

    /* JADX INFO: renamed from: c */
    public final boolean f55891c;

    /* JADX INFO: renamed from: d */
    public final String f55892d;

    public pa6(String str, int i, String str2) {
        boolean z = (i & 2) == 0;
        str2 = (i & 8) != 0 ? null : str2;
        str.getClass();
        this.f55890b = str;
        this.f55891c = z;
        this.f55892d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m19006a() {
        return this.f55890b;
    }

    /* JADX INFO: renamed from: b */
    public final String m19007b() {
        return this.f55892d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19008c() {
        return this.f55891c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa6)) {
            return false;
        }
        pa6 pa6Var = (pa6) obj;
        return fa4.m11650l(this.f55890b, pa6Var.f55890b) && this.f55891c == pa6Var.f55891c && fa4.m11650l(this.f55892d, pa6Var.f55892d);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(this.f55890b.hashCode() * 31, 961, this.f55891c);
        String str = this.f55892d;
        return iM12428e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upgrade(attemptedAction=");
        sb.append(this.f55890b);
        sb.append(", plusDefault=");
        sb.append(this.f55891c);
        sb.append(", reason=null, offer=");
        return AbstractC3393o1.m17738m(sb, this.f55892d, ")");
    }
}
