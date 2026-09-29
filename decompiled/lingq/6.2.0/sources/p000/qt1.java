package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qt1 {

    /* JADX INFO: renamed from: a */
    public final boolean f58175a;

    /* JADX INFO: renamed from: b */
    public final fz1 f58176b;

    /* JADX INFO: renamed from: c */
    public final List f58177c;

    /* JADX INFO: renamed from: d */
    public final List f58178d;

    /* JADX INFO: renamed from: e */
    public final boolean f58179e;

    /* JADX INFO: renamed from: f */
    public final hu1 f58180f;

    public qt1(boolean z, fz1 fz1Var, List list, List list2, boolean z2, hu1 hu1Var) {
        list.getClass();
        list2.getClass();
        this.f58175a = z;
        this.f58176b = fz1Var;
        this.f58177c = list;
        this.f58178d = list2;
        this.f58179e = z2;
        this.f58180f = hu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt1)) {
            return false;
        }
        qt1 qt1Var = (qt1) obj;
        return this.f58175a == qt1Var.f58175a && fa4.m11650l(this.f58176b, qt1Var.f58176b) && fa4.m11650l(this.f58177c, qt1Var.f58177c) && fa4.m11650l(this.f58178d, qt1Var.f58178d) && this.f58179e == qt1Var.f58179e && fa4.m11650l(this.f58180f, qt1Var.f58180f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f58175a) * 31;
        fz1 fz1Var = this.f58176b;
        int iM12428e = g9a.m12428e(ux5.m22979b(ux5.m22979b((iHashCode + (fz1Var == null ? 0 : fz1Var.hashCode())) * 31, 31, this.f58177c), 31, this.f58178d), 31, this.f58179e);
        hu1 hu1Var = this.f58180f;
        return iM12428e + (hu1Var != null ? hu1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupDailyPrizeState(isLoading=");
        sb.append(this.f58175a);
        sb.append(", today=");
        sb.append(this.f58176b);
        sb.append(", multiplierRows=");
        hn1.m13372v(sb, this.f58177c, ", history=", this.f58178d, ", showClaimAnimation=");
        sb.append(this.f58179e);
        sb.append(", message=");
        sb.append(this.f58180f);
        sb.append(")");
        return sb.toString();
    }
}
