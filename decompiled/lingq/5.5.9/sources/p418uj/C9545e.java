package p418uj;

import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.review.views.result.ReviewResultType;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: uj.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9545e {

    /* JADX INFO: renamed from: a */
    public final ReviewResultType f49111a;

    /* JADX INFO: renamed from: b */
    public final String f49112b;

    /* JADX INFO: renamed from: c */
    public final boolean f49113c;

    /* JADX INFO: renamed from: d */
    public final String f49114d;

    /* JADX INFO: renamed from: e */
    public final String f49115e;

    public C9545e() {
        this(0);
    }

    public /* synthetic */ C9545e(int i10) {
        this(ReviewResultType.ALMOST, "", false, "", "");
    }

    public C9545e(ReviewResultType reviewResultType, String str, boolean z10, String str2, String str3) {
        C5207g.m11111f(reviewResultType, "result");
        C5207g.m11111f(str, "emoji");
        C5207g.m11111f(str2, "sentence");
        C5207g.m11111f(str3, "youAnswered");
        this.f49111a = reviewResultType;
        this.f49112b = str;
        this.f49113c = z10;
        this.f49114d = str2;
        this.f49115e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9545e)) {
            return false;
        }
        C9545e c9545e = (C9545e) obj;
        return this.f49111a == c9545e.f49111a && C5207g.m11106a(this.f49112b, c9545e.f49112b) && this.f49113c == c9545e.f49113c && C5207g.m11106a(this.f49114d, c9545e.f49114d) && C5207g.m11106a(this.f49115e, c9545e.f49115e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f49112b, this.f49111a.hashCode() * 31, 31);
        boolean z10 = this.f49113c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f49115e.hashCode() + C0166e.m758d(this.f49114d, (iM758d + r10) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultUnscrambleActivity(result=");
        sb2.append(this.f49111a);
        sb2.append(", emoji=");
        sb2.append(this.f49112b);
        sb2.append(", show=");
        sb2.append(this.f49113c);
        sb2.append(", sentence=");
        sb2.append(this.f49114d);
        sb2.append(", youAnswered=");
        return C0009a.m23l(sb2, this.f49115e, ")");
    }
}
