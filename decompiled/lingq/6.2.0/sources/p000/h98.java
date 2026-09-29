package p000;

import com.lingq.feature.review.views.result.ReviewResultType;

/* JADX INFO: loaded from: classes3.dex */
public final class h98 {

    /* JADX INFO: renamed from: a */
    public final ReviewResultType f42043a;

    /* JADX INFO: renamed from: b */
    public final String f42044b;

    /* JADX INFO: renamed from: c */
    public final boolean f42045c;

    /* JADX INFO: renamed from: d */
    public final String f42046d;

    /* JADX INFO: renamed from: e */
    public final String f42047e;

    public h98(ReviewResultType reviewResultType, String str, boolean z, String str2, String str3) {
        reviewResultType.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f42043a = reviewResultType;
        this.f42044b = str;
        this.f42045c = z;
        this.f42046d = str2;
        this.f42047e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h98)) {
            return false;
        }
        h98 h98Var = (h98) obj;
        return this.f42043a == h98Var.f42043a && fa4.m11650l(this.f42044b, h98Var.f42044b) && this.f42045c == h98Var.f42045c && fa4.m11650l(this.f42046d, h98Var.f42046d) && fa4.m11650l(this.f42047e, h98Var.f42047e);
    }

    public final int hashCode() {
        return this.f42047e.hashCode() + ux5.m22980c(g9a.m12428e(ux5.m22980c(this.f42043a.hashCode() * 31, this.f42044b, 31), 31, this.f42045c), this.f42046d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultUnscrambleActivity(result=");
        sb.append(this.f42043a);
        sb.append(", emoji=");
        sb.append(this.f42044b);
        sb.append(", show=");
        hn1.m13367q(", sentence=", this.f42046d, ", youAnswered=", sb, this.f42045c);
        return AbstractC3393o1.m17738m(sb, this.f42047e, ")");
    }

    public /* synthetic */ h98() {
        this(ReviewResultType.ALMOST, "", false, "", "");
    }
}
