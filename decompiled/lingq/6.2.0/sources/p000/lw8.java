package p000;

import com.lingq.core.domain.model.review.ReviewType;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lw8 {

    /* JADX INFO: renamed from: a */
    public final int f50212a;

    /* JADX INFO: renamed from: b */
    public final double f50213b;

    /* JADX INFO: renamed from: c */
    public final double f50214c;

    /* JADX INFO: renamed from: d */
    public final String f50215d;

    /* JADX INFO: renamed from: e */
    public final int f50216e;

    /* JADX INFO: renamed from: f */
    public final int f50217f;

    /* JADX INFO: renamed from: g */
    public final Set f50218g;

    /* JADX INFO: renamed from: h */
    public final ReviewType f50219h;

    public lw8(int i, double d, double d2, String str, int i2, int i3, Set set, ReviewType reviewType) {
        reviewType.getClass();
        this.f50212a = i;
        this.f50213b = d;
        this.f50214c = d2;
        this.f50215d = str;
        this.f50216e = i2;
        this.f50217f = i3;
        this.f50218g = set;
        this.f50219h = reviewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw8)) {
            return false;
        }
        lw8 lw8Var = (lw8) obj;
        return this.f50212a == lw8Var.f50212a && Double.compare(this.f50213b, lw8Var.f50213b) == 0 && Double.compare(this.f50214c, lw8Var.f50214c) == 0 && this.f50215d.equals(lw8Var.f50215d) && this.f50216e == lw8Var.f50216e && this.f50217f == lw8Var.f50217f && this.f50218g.equals(lw8Var.f50218g) && this.f50219h == lw8Var.f50219h;
    }

    public final int hashCode() {
        return this.f50219h.hashCode() + ((this.f50218g.hashCode() + wq1.m24106b(this.f50217f, wq1.m24106b(this.f50216e, ux5.m22980c(g9a.m12424a(this.f50214c, g9a.m12424a(this.f50213b, Integer.hashCode(this.f50212a) * 31, 31), 31), this.f50215d, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentenceData(index=");
        sb.append(this.f50212a);
        sb.append(", startTimestamp=");
        sb.append(this.f50213b);
        hn1.m13370t(sb, ", endTimestamp=", this.f50214c, ", text=");
        AbstractC3393o1.m17748w(this.f50216e, this.f50215d, ", startCharIndex=", ", endCharIndex=", sb);
        sb.append(this.f50217f);
        sb.append(", reviewTerms=");
        sb.append(this.f50218g);
        sb.append(", reviewType=");
        sb.append(this.f50219h);
        sb.append(")");
        return sb.toString();
    }
}
