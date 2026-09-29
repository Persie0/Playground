package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sn7 {

    /* JADX INFO: renamed from: a */
    public final boolean f61063a;

    /* JADX INFO: renamed from: b */
    public final up6 f61064b;

    /* JADX INFO: renamed from: c */
    public final String f61065c;

    public sn7(boolean z, up6 up6Var, String str) {
        str.getClass();
        this.f61063a = z;
        this.f61064b = up6Var;
        this.f61065c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn7)) {
            return false;
        }
        sn7 sn7Var = (sn7) obj;
        return this.f61063a == sn7Var.f61063a && fa4.m11650l(this.f61064b, sn7Var.f61064b) && fa4.m11650l(this.f61065c, sn7Var.f61065c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f61063a) * 31;
        up6 up6Var = this.f61064b;
        return this.f61065c.hashCode() + ((iHashCode + (up6Var == null ? 0 : up6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoData(show=");
        sb.append(this.f61063a);
        sb.append(", offer=");
        sb.append(this.f61064b);
        sb.append(", locale=");
        return AbstractC3393o1.m17738m(sb, this.f61065c, ")");
    }
}
