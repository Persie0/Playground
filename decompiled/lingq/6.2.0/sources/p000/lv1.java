package p000;

import com.lingq.feature.challenges.cup.data.CupPhase;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class lv1 {

    /* JADX INFO: renamed from: a */
    public final CupPhase f50170a;

    /* JADX INFO: renamed from: b */
    public final boolean f50171b;

    /* JADX INFO: renamed from: c */
    public final zt1 f50172c;

    /* JADX INFO: renamed from: d */
    public final fz1 f50173d;

    /* JADX INFO: renamed from: e */
    public final List f50174e;

    /* JADX INFO: renamed from: f */
    public final List f50175f;

    /* JADX INFO: renamed from: g */
    public final rs1 f50176g;

    /* JADX INFO: renamed from: h */
    public final ru1 f50177h;

    /* JADX INFO: renamed from: i */
    public final vv1 f50178i;

    /* JADX INFO: renamed from: j */
    public final boolean f50179j;

    /* JADX INFO: renamed from: k */
    public final boolean f50180k;

    /* JADX INFO: renamed from: l */
    public final hu1 f50181l;

    public /* synthetic */ lv1(CupPhase cupPhase, boolean z, zt1 zt1Var, fz1 fz1Var, List list, List list2, rs1 rs1Var, ru1 ru1Var, vv1 vv1Var, boolean z2, boolean z3, hu1 hu1Var, int i) {
        zt1 zt1Var2;
        CupPhase cupPhase2 = (i & 1) != 0 ? CupPhase.Loading : cupPhase;
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            zt1Var2 = new zt1((16383 & 1) != 0 ? null : 14, (16383 & 2) != 0 ? null : 39, null, null, null, (16383 & 32) != 0 ? null : "es", (16383 & 64) == 0, null, (16383 & 256) != 0 ? null : 42, (16383 & 512) != 0 ? null : 15, (16383 & 1024) != 0 ? null : 12140, (16383 & 2048) != 0 ? null : 14, (16383 & 4096) != 0 ? null : 1284530, (16383 & 8192) != 0 ? null : 8452);
        } else {
            zt1Var2 = zt1Var;
        }
        fz1 fz1Var2 = (i & 8) != 0 ? null : fz1Var;
        int i2 = i & 16;
        List list3 = EmptyList.f47638a;
        this(cupPhase2, z4, zt1Var2, fz1Var2, i2 != 0 ? list3 : list, (i & 32) == 0 ? list2 : list3, (i & 64) != 0 ? null : rs1Var, (i & 128) != 0 ? null : ru1Var, (i & 256) != 0 ? null : vv1Var, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? null : hu1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv1)) {
            return false;
        }
        lv1 lv1Var = (lv1) obj;
        return this.f50170a == lv1Var.f50170a && this.f50171b == lv1Var.f50171b && fa4.m11650l(this.f50172c, lv1Var.f50172c) && fa4.m11650l(this.f50173d, lv1Var.f50173d) && fa4.m11650l(this.f50174e, lv1Var.f50174e) && fa4.m11650l(this.f50175f, lv1Var.f50175f) && fa4.m11650l(this.f50176g, lv1Var.f50176g) && fa4.m11650l(this.f50177h, lv1Var.f50177h) && fa4.m11650l(this.f50178i, lv1Var.f50178i) && this.f50179j == lv1Var.f50179j && this.f50180k == lv1Var.f50180k && fa4.m11650l(this.f50181l, lv1Var.f50181l);
    }

    public final int hashCode() {
        int iHashCode = (this.f50172c.hashCode() + g9a.m12428e(this.f50170a.hashCode() * 31, 31, this.f50171b)) * 31;
        fz1 fz1Var = this.f50173d;
        int iM22979b = ux5.m22979b(ux5.m22979b((iHashCode + (fz1Var == null ? 0 : fz1Var.hashCode())) * 31, 31, this.f50174e), 31, this.f50175f);
        rs1 rs1Var = this.f50176g;
        int iHashCode2 = (iM22979b + (rs1Var == null ? 0 : rs1Var.hashCode())) * 31;
        ru1 ru1Var = this.f50177h;
        int iHashCode3 = (iHashCode2 + (ru1Var == null ? 0 : ru1Var.hashCode())) * 31;
        vv1 vv1Var = this.f50178i;
        int iM12428e = g9a.m12428e(g9a.m12428e((iHashCode3 + (vv1Var == null ? 0 : vv1Var.hashCode())) * 31, 31, this.f50179j), 31, this.f50180k);
        hu1 hu1Var = this.f50181l;
        return iM12428e + (hu1Var != null ? hu1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupScreenState(phase=");
        sb.append(this.f50170a);
        sb.append(", joined=");
        sb.append(this.f50171b);
        sb.append(", hero=");
        sb.append(this.f50172c);
        sb.append(", dailyPrize=");
        sb.append(this.f50173d);
        sb.append(", multipliers=");
        hn1.m13372v(sb, this.f50174e, ", teamPreview=", this.f50175f, ", badges=");
        sb.append(this.f50176g);
        sb.append(", results=");
        sb.append(this.f50177h);
        sb.append(", signup=");
        sb.append(this.f50178i);
        sb.append(", isRefreshing=");
        sb.append(this.f50179j);
        sb.append(", showClaimAnimation=");
        sb.append(this.f50180k);
        sb.append(", message=");
        sb.append(this.f50181l);
        sb.append(")");
        return sb.toString();
    }

    public lv1(CupPhase cupPhase, boolean z, zt1 zt1Var, fz1 fz1Var, List list, List list2, rs1 rs1Var, ru1 ru1Var, vv1 vv1Var, boolean z2, boolean z3, hu1 hu1Var) {
        cupPhase.getClass();
        zt1Var.getClass();
        list.getClass();
        list2.getClass();
        this.f50170a = cupPhase;
        this.f50171b = z;
        this.f50172c = zt1Var;
        this.f50173d = fz1Var;
        this.f50174e = list;
        this.f50175f = list2;
        this.f50176g = rs1Var;
        this.f50177h = ru1Var;
        this.f50178i = vv1Var;
        this.f50179j = z2;
        this.f50180k = z3;
        this.f50181l = hu1Var;
    }
}
