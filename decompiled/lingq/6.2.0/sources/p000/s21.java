package p000;

import com.lingq.core.domain.model.cup.CupPrize;

/* JADX INFO: loaded from: classes2.dex */
public final class s21 implements w21 {

    /* JADX INFO: renamed from: a */
    public final boolean f60173a;

    /* JADX INFO: renamed from: b */
    public final CupPrize f60174b;

    public s21(boolean z, CupPrize cupPrize) {
        this.f60173a = z;
        this.f60174b = cupPrize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s21)) {
            return false;
        }
        s21 s21Var = (s21) obj;
        return this.f60173a == s21Var.f60173a && fa4.m11650l(this.f60174b, s21Var.f60174b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f60173a) * 31;
        CupPrize cupPrize = this.f60174b;
        return iHashCode + (cupPrize == null ? 0 : cupPrize.hashCode());
    }

    public final String toString() {
        return "Claimed(isNew=" + this.f60173a + ", prize=" + this.f60174b + ")";
    }
}
