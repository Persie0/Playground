package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class ka6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final boolean f46938b;

    /* JADX INFO: renamed from: c */
    public final int f46939c;

    /* JADX INFO: renamed from: d */
    public final CardStatus f46940d;

    /* JADX INFO: renamed from: e */
    public final ReviewType f46941e;

    /* JADX INFO: renamed from: f */
    public final int f46942f;

    /* JADX INFO: renamed from: g */
    public final String f46943g;

    /* JADX INFO: renamed from: h */
    public final String f46944h;

    /* JADX INFO: renamed from: i */
    public final String f46945i;

    public ka6(boolean z, int i, CardStatus cardStatus, ReviewType reviewType, int i2, String str, String str2, String str3, int i3) {
        cardStatus = (i3 & 8) != 0 ? CardStatus.Known : cardStatus;
        i2 = (i3 & 32) != 0 ? -1 : i2;
        str = (i3 & 64) != 0 ? "" : str;
        str2 = (i3 & 128) != 0 ? "" : str2;
        str3 = (i3 & 256) != 0 ? "" : str3;
        cardStatus.getClass();
        reviewType.getClass();
        str.getClass();
        this.f46938b = z;
        this.f46939c = i;
        this.f46940d = cardStatus;
        this.f46941e = reviewType;
        this.f46942f = i2;
        this.f46943g = str;
        this.f46944h = str2;
        this.f46945i = str3;
    }

    /* JADX INFO: renamed from: a */
    public final int m15031a() {
        return this.f46939c;
    }

    /* JADX INFO: renamed from: b */
    public final String m15032b() {
        return this.f46944h;
    }

    /* JADX INFO: renamed from: c */
    public final String m15033c() {
        return this.f46943g;
    }

    /* JADX INFO: renamed from: d */
    public final String m15034d() {
        return this.f46945i;
    }

    /* JADX INFO: renamed from: e */
    public final ReviewType m15035e() {
        return this.f46941e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka6)) {
            return false;
        }
        ka6 ka6Var = (ka6) obj;
        return this.f46938b == ka6Var.f46938b && this.f46939c == ka6Var.f46939c && this.f46940d == ka6Var.f46940d && this.f46941e == ka6Var.f46941e && this.f46942f == ka6Var.f46942f && fa4.m11650l(this.f46943g, ka6Var.f46943g) && fa4.m11650l(this.f46944h, ka6Var.f46944h) && fa4.m11650l(this.f46945i, ka6Var.f46945i);
    }

    /* JADX INFO: renamed from: f */
    public final int m15036f() {
        return this.f46942f;
    }

    /* JADX INFO: renamed from: g */
    public final CardStatus m15037g() {
        return this.f46940d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15038h() {
        return this.f46938b;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f46942f, (this.f46941e.hashCode() + ((this.f46940d.hashCode() + wq1.m24106b(this.f46939c, g9a.m12428e(Boolean.hashCode(this.f46938b) * 31, 31, false), 31)) * 31)) * 31, 31), this.f46943g, 31);
        String str = this.f46944h;
        return this.f46945i.hashCode() + ((iM22980c + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Review(isFromVocabulary=");
        sb.append(this.f46938b);
        sb.append(", isDailyLingQs=false, lessonId=");
        sb.append(this.f46939c);
        sb.append(", statusUpper=");
        sb.append(this.f46940d);
        sb.append(", reviewType=");
        sb.append(this.f46941e);
        sb.append(", sentenceIndex=");
        hn1.m13361k(this.f46942f, ", reviewLanguageFromDeeplink=", this.f46943g, ", lotd=", sb);
        return wq1.m24125u(sb, this.f46944h, ", reviewLocation=", this.f46945i, ")");
    }
}
