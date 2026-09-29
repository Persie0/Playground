package p000;

import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;

/* JADX INFO: loaded from: classes.dex */
public final class v20 extends ec1 {

    /* JADX INFO: renamed from: a */
    public final fy2 f64717a;

    /* JADX INFO: renamed from: b */
    public final ComplianceData$ProductIdOrigin f64718b;

    public v20(p40 p40Var, ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin) {
        this.f64717a = p40Var;
        this.f64718b = complianceData$ProductIdOrigin;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ec1) {
            ec1 ec1Var = (ec1) obj;
            fy2 fy2Var = this.f64717a;
            if (fy2Var != null ? fy2Var.equals(((v20) ec1Var).f64717a) : ((v20) ec1Var).f64717a == null) {
                ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = this.f64718b;
                if (complianceData$ProductIdOrigin != null ? complianceData$ProductIdOrigin.equals(((v20) ec1Var).f64718b) : ((v20) ec1Var).f64718b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        fy2 fy2Var = this.f64717a;
        int iHashCode = ((fy2Var == null ? 0 : fy2Var.hashCode()) ^ 1000003) * 1000003;
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = this.f64718b;
        return iHashCode ^ (complianceData$ProductIdOrigin != null ? complianceData$ProductIdOrigin.hashCode() : 0);
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f64717a + ", productIdOrigin=" + this.f64718b + "}";
    }
}
