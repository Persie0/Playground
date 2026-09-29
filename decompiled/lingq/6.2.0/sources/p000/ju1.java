package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ju1 {

    /* JADX INFO: renamed from: a */
    public final String f46152a;

    /* JADX INFO: renamed from: b */
    public final String f46153b;

    /* JADX INFO: renamed from: c */
    public final boolean f46154c;

    /* JADX INFO: renamed from: d */
    public final int f46155d;

    /* JADX INFO: renamed from: e */
    public final CupPrizeSource f46156e;

    /* JADX INFO: renamed from: f */
    public final boolean f46157f;

    public ju1(String str, String str2, boolean z, int i, CupPrizeSource cupPrizeSource, boolean z2) {
        str2.getClass();
        cupPrizeSource.getClass();
        this.f46152a = str;
        this.f46153b = str2;
        this.f46154c = z;
        this.f46155d = i;
        this.f46156e = cupPrizeSource;
        this.f46157f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju1)) {
            return false;
        }
        ju1 ju1Var = (ju1) obj;
        return this.f46152a.equals(ju1Var.f46152a) && fa4.m11650l(this.f46153b, ju1Var.f46153b) && this.f46154c == ju1Var.f46154c && this.f46155d == ju1Var.f46155d && this.f46156e == ju1Var.f46156e && this.f46157f == ju1Var.f46157f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46157f) + ((this.f46156e.hashCode() + wq1.m24106b(this.f46155d, g9a.m12428e(ux5.m22980c(this.f46152a.hashCode() * 31, this.f46153b, 31), 31, this.f46154c), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupPrizeHistoryItem(date=", this.f46152a, ", label=", this.f46153b, ", isMultiplier=");
        hn1.m13373w(sbM23000w, this.f46154c, ", value=", this.f46155d, ", source=");
        sbM23000w.append(this.f46156e);
        sbM23000w.append(", claimed=");
        sbM23000w.append(this.f46157f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
