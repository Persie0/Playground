package p000;

import com.lingq.feature.review.views.result.ReviewResultType;

/* JADX INFO: loaded from: classes3.dex */
public final class rg8 {

    /* JADX INFO: renamed from: a */
    public final ReviewResultType f59238a;

    /* JADX INFO: renamed from: b */
    public final String f59239b;

    /* JADX INFO: renamed from: c */
    public final String f59240c;

    /* JADX INFO: renamed from: d */
    public final String f59241d;

    public rg8(ReviewResultType reviewResultType, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f59238a = reviewResultType;
        this.f59239b = str;
        this.f59240c = str2;
        this.f59241d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg8)) {
            return false;
        }
        rg8 rg8Var = (rg8) obj;
        return this.f59238a == rg8Var.f59238a && fa4.m11650l(this.f59239b, rg8Var.f59239b) && this.f59240c.equals(rg8Var.f59240c) && fa4.m11650l(this.f59241d, rg8Var.f59241d);
    }

    public final int hashCode() {
        return this.f59241d.hashCode() + ux5.m22980c(g9a.m12428e(ux5.m22980c(this.f59238a.hashCode() * 31, this.f59239b, 31), 31, true), this.f59240c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewUnscrambleOverlayState(result=");
        sb.append(this.f59238a);
        sb.append(", emoji=");
        sb.append(this.f59239b);
        sb.append(", show=true, sentence=");
        return wq1.m24125u(sb, this.f59240c, ", answer=", this.f59241d, ")");
    }
}
