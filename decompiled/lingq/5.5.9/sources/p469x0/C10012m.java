package p469x0;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;
import p387t0.AbstractC9161o;

/* JADX INFO: renamed from: x0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10012m extends AbstractC10010k {

    /* JADX INFO: renamed from: H */
    public final float f50946H;

    /* JADX INFO: renamed from: I */
    public final float f50947I;

    /* JADX INFO: renamed from: a */
    public final String f50948a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC10003d> f50949b;

    /* JADX INFO: renamed from: c */
    public final int f50950c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9161o f50951d;

    /* JADX INFO: renamed from: e */
    public final float f50952e;

    /* JADX INFO: renamed from: f */
    public final AbstractC9161o f50953f;

    /* JADX INFO: renamed from: g */
    public final float f50954g;

    /* JADX INFO: renamed from: h */
    public final float f50955h;

    /* JADX INFO: renamed from: i */
    public final int f50956i;

    /* JADX INFO: renamed from: j */
    public final int f50957j;

    /* JADX INFO: renamed from: k */
    public final float f50958k;

    /* JADX INFO: renamed from: l */
    public final float f50959l;

    public C10012m(String str, List list, int i10, AbstractC9161o abstractC9161o, float f3, AbstractC9161o abstractC9161o2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15) {
        this.f50948a = str;
        this.f50949b = list;
        this.f50950c = i10;
        this.f50951d = abstractC9161o;
        this.f50952e = f3;
        this.f50953f = abstractC9161o2;
        this.f50954g = f10;
        this.f50955h = f11;
        this.f50956i = i11;
        this.f50957j = i12;
        this.f50958k = f12;
        this.f50959l = f13;
        this.f50946H = f14;
        this.f50947I = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10012m.class != obj.getClass()) {
            return false;
        }
        C10012m c10012m = (C10012m) obj;
        if (C5207g.m11106a(this.f50948a, c10012m.f50948a) && C5207g.m11106a(this.f50951d, c10012m.f50951d)) {
            if (!(this.f50952e == c10012m.f50952e) || !C5207g.m11106a(this.f50953f, c10012m.f50953f)) {
                return false;
            }
            if (!(this.f50954g == c10012m.f50954g)) {
                return false;
            }
            if (!(this.f50955h == c10012m.f50955h)) {
                return false;
            }
            if (!(this.f50956i == c10012m.f50956i)) {
                return false;
            }
            if (!(this.f50957j == c10012m.f50957j)) {
                return false;
            }
            if (!(this.f50958k == c10012m.f50958k)) {
                return false;
            }
            if (!(this.f50959l == c10012m.f50959l)) {
                return false;
            }
            if (!(this.f50946H == c10012m.f50946H)) {
                return false;
            }
            if (this.f50947I == c10012m.f50947I) {
                return (this.f50950c == c10012m.f50950c) && C5207g.m11106a(this.f50949b, c10012m.f50949b);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f50949b, this.f50948a.hashCode() * 31, 31);
        AbstractC9161o abstractC9161o = this.f50951d;
        int iM846e = C0204c.m846e(this.f50952e, (iM848g + (abstractC9161o != null ? abstractC9161o.hashCode() : 0)) * 31, 31);
        AbstractC9161o abstractC9161o2 = this.f50953f;
        return Integer.hashCode(this.f50950c) + C0204c.m846e(this.f50947I, C0204c.m846e(this.f50946H, C0204c.m846e(this.f50959l, C0204c.m846e(this.f50958k, C0009a.m16d(this.f50957j, C0009a.m16d(this.f50956i, C0204c.m846e(this.f50955h, C0204c.m846e(this.f50954g, (iM846e + (abstractC9161o2 != null ? abstractC9161o2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
