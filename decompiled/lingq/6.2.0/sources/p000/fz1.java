package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.feature.challenges.cup.data.PrizeClaimUiState;

/* JADX INFO: loaded from: classes2.dex */
public final class fz1 {

    /* JADX INFO: renamed from: a */
    public final String f39945a;

    /* JADX INFO: renamed from: b */
    public final boolean f39946b;

    /* JADX INFO: renamed from: c */
    public final int f39947c;

    /* JADX INFO: renamed from: d */
    public final CupPrizeSource f39948d;

    /* JADX INFO: renamed from: e */
    public final PrizeClaimUiState f39949e;

    /* JADX INFO: renamed from: f */
    public final String f39950f;

    public fz1(String str, boolean z, int i, CupPrizeSource cupPrizeSource, PrizeClaimUiState prizeClaimUiState, String str2) {
        str.getClass();
        cupPrizeSource.getClass();
        prizeClaimUiState.getClass();
        str2.getClass();
        this.f39945a = str;
        this.f39946b = z;
        this.f39947c = i;
        this.f39948d = cupPrizeSource;
        this.f39949e = prizeClaimUiState;
        this.f39950f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz1)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return fa4.m11650l(this.f39945a, fz1Var.f39945a) && this.f39946b == fz1Var.f39946b && this.f39947c == fz1Var.f39947c && this.f39948d == fz1Var.f39948d && this.f39949e == fz1Var.f39949e && fa4.m11650l(this.f39950f, fz1Var.f39950f);
    }

    public final int hashCode() {
        return this.f39950f.hashCode() + ((this.f39949e.hashCode() + ((this.f39948d.hashCode() + wq1.m24106b(this.f39947c, g9a.m12428e(this.f39945a.hashCode() * 31, 31, this.f39946b), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DailyPrizeCardState(label=" + this.f39945a + ", isMultiplier=" + this.f39946b + ", value=" + this.f39947c + ", source=" + this.f39948d + ", claimState=" + this.f39949e + ", date=" + this.f39950f + ")";
    }
}
