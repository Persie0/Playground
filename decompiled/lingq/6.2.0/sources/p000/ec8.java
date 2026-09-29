package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class ec8 {

    /* JADX INFO: renamed from: a */
    public final ReviewType f37003a;

    /* JADX INFO: renamed from: b */
    public final String f37004b;

    /* JADX INFO: renamed from: c */
    public final int f37005c;

    /* JADX INFO: renamed from: d */
    public final CardStatus f37006d;

    /* JADX INFO: renamed from: e */
    public final int f37007e;

    /* JADX INFO: renamed from: f */
    public final String f37008f;

    /* JADX INFO: renamed from: g */
    public final boolean f37009g;

    /* JADX INFO: renamed from: h */
    public final boolean f37010h;

    public ec8(ReviewType reviewType, String str, int i, CardStatus cardStatus, int i2, String str2, boolean z, boolean z2) {
        reviewType.getClass();
        cardStatus.getClass();
        this.f37003a = reviewType;
        this.f37004b = str;
        this.f37005c = i;
        this.f37006d = cardStatus;
        this.f37007e = i2;
        this.f37008f = str2;
        this.f37009g = z;
        this.f37010h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec8)) {
            return false;
        }
        ec8 ec8Var = (ec8) obj;
        return this.f37003a == ec8Var.f37003a && this.f37004b.equals(ec8Var.f37004b) && this.f37005c == ec8Var.f37005c && this.f37006d == ec8Var.f37006d && this.f37007e == ec8Var.f37007e && fa4.m11650l(this.f37008f, ec8Var.f37008f) && this.f37009g == ec8Var.f37009g && this.f37010h == ec8Var.f37010h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f37007e, (this.f37006d.hashCode() + wq1.m24106b(this.f37005c, ux5.m22980c(this.f37003a.hashCode() * 31, this.f37004b, 31), 31)) * 31, 31);
        String str = this.f37008f;
        return Boolean.hashCode(this.f37010h) + g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f37009g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewArgs(reviewType=");
        sb.append(this.f37003a);
        sb.append(", reviewLocation=");
        sb.append(this.f37004b);
        sb.append(", lessonId=");
        sb.append(this.f37005c);
        sb.append(", statusUpper=");
        sb.append(this.f37006d);
        sb.append(", sentenceIndex=");
        hn1.m13361k(this.f37007e, ", lotd=", this.f37008f, ", isDailyLingQs=", sb);
        return e65.m10875g(sb, this.f37009g, ", isFromVocabulary=", this.f37010h, ")");
    }
}
