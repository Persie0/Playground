package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;

/* JADX INFO: loaded from: classes2.dex */
public final class n56 {

    /* JADX INFO: renamed from: a */
    public final CupPrizeSource f52365a;

    /* JADX INFO: renamed from: b */
    public final int f52366b;

    /* JADX INFO: renamed from: c */
    public final boolean f52367c;

    public n56(CupPrizeSource cupPrizeSource, int i, boolean z) {
        cupPrizeSource.getClass();
        this.f52365a = cupPrizeSource;
        this.f52366b = i;
        this.f52367c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n56)) {
            return false;
        }
        n56 n56Var = (n56) obj;
        return this.f52365a == n56Var.f52365a && this.f52366b == n56Var.f52366b && this.f52367c == n56Var.f52367c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52367c) + wq1.m24106b(this.f52366b, this.f52365a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiplierItem(source=");
        sb.append(this.f52365a);
        sb.append(", factor=");
        sb.append(this.f52366b);
        sb.append(", highlighted=");
        return AbstractC3393o1.m17740o(sb, this.f52367c, ")");
    }
}
