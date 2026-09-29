package p000;

import com.lingq.core.domain.model.cup.CupClaim;

/* JADX INFO: loaded from: classes2.dex */
public final class iu1 {

    /* JADX INFO: renamed from: a */
    public final String f44565a;

    /* JADX INFO: renamed from: b */
    public final String f44566b;

    /* JADX INFO: renamed from: c */
    public final String f44567c;

    /* JADX INFO: renamed from: d */
    public final int f44568d;

    /* JADX INFO: renamed from: e */
    public final String f44569e;

    /* JADX INFO: renamed from: f */
    public final CupClaim f44570f;

    public iu1(String str, String str2, String str3, int i, String str4, CupClaim cupClaim) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f44565a = str;
        this.f44566b = str2;
        this.f44567c = str3;
        this.f44568d = i;
        this.f44569e = str4;
        this.f44570f = cupClaim;
    }

    /* JADX INFO: renamed from: a */
    public final CupClaim m14146a() {
        return this.f44570f;
    }

    /* JADX INFO: renamed from: b */
    public final String m14147b() {
        return this.f44565a;
    }

    /* JADX INFO: renamed from: c */
    public final String m14148c() {
        return this.f44566b;
    }

    /* JADX INFO: renamed from: d */
    public final String m14149d() {
        return this.f44569e;
    }

    /* JADX INFO: renamed from: e */
    public final String m14150e() {
        return this.f44567c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu1)) {
            return false;
        }
        iu1 iu1Var = (iu1) obj;
        return fa4.m11650l(this.f44565a, iu1Var.f44565a) && fa4.m11650l(this.f44566b, iu1Var.f44566b) && fa4.m11650l(this.f44567c, iu1Var.f44567c) && this.f44568d == iu1Var.f44568d && fa4.m11650l(this.f44569e, iu1Var.f44569e) && fa4.m11650l(this.f44570f, iu1Var.f44570f);
    }

    /* JADX INFO: renamed from: f */
    public final int m14151f() {
        return this.f44568d;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f44568d, ux5.m22980c(ux5.m22980c(this.f44565a.hashCode() * 31, this.f44566b, 31), this.f44567c, 31), 31), this.f44569e, 31);
        CupClaim cupClaim = this.f44570f;
        return iM22980c + (cupClaim == null ? 0 : cupClaim.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupPrizeEntity(date=", this.f44565a, ", kind=", this.f44566b, ", source=");
        AbstractC3393o1.m17748w(this.f44568d, this.f44567c, ", value=", ", label=", sbM23000w);
        sbM23000w.append(this.f44569e);
        sbM23000w.append(", claim=");
        sbM23000w.append(this.f44570f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
