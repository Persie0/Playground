package p000;

import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ox7 {

    /* JADX INFO: renamed from: a */
    public final int f55128a;

    /* JADX INFO: renamed from: b */
    public final boolean f55129b;

    /* JADX INFO: renamed from: c */
    public final boolean f55130c;

    /* JADX INFO: renamed from: d */
    public final String f55131d;

    /* JADX INFO: renamed from: e */
    public final List f55132e;

    /* JADX INFO: renamed from: f */
    public final ReaderFont f55133f;

    /* JADX INFO: renamed from: g */
    public final double f55134g;

    /* JADX INFO: renamed from: h */
    public final int f55135h;

    /* JADX INFO: renamed from: i */
    public final int f55136i;

    /* JADX INFO: renamed from: j */
    public final boolean f55137j;

    /* JADX INFO: renamed from: k */
    public final String f55138k;

    /* JADX INFO: renamed from: l */
    public final boolean f55139l;

    /* JADX INFO: renamed from: m */
    public final Map f55140m;

    public ox7(int i, boolean z, boolean z2, String str, List list, ReaderFont readerFont, double d, int i2, int i3, boolean z3, String str2, boolean z4, Map map) {
        readerFont.getClass();
        str2.getClass();
        this.f55128a = i;
        this.f55129b = z;
        this.f55130c = z2;
        this.f55131d = str;
        this.f55132e = list;
        this.f55133f = readerFont;
        this.f55134g = d;
        this.f55135h = i2;
        this.f55136i = i3;
        this.f55137j = z3;
        this.f55138k = str2;
        this.f55139l = z4;
        this.f55140m = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox7)) {
            return false;
        }
        ox7 ox7Var = (ox7) obj;
        return this.f55128a == ox7Var.f55128a && this.f55129b == ox7Var.f55129b && this.f55130c == ox7Var.f55130c && this.f55131d.equals(ox7Var.f55131d) && this.f55132e.equals(ox7Var.f55132e) && this.f55133f == ox7Var.f55133f && Double.compare(this.f55134g, ox7Var.f55134g) == 0 && this.f55135h == ox7Var.f55135h && this.f55136i == ox7Var.f55136i && this.f55137j == ox7Var.f55137j && fa4.m11650l(this.f55138k, ox7Var.f55138k) && this.f55139l == ox7Var.f55139l && this.f55140m.equals(ox7Var.f55140m);
    }

    public final int hashCode() {
        return this.f55140m.hashCode() + g9a.m12428e(ux5.m22980c(g9a.m12428e(wq1.m24106b(this.f55136i, wq1.m24106b(this.f55135h, g9a.m12424a(this.f55134g, (this.f55133f.hashCode() + ux5.m22979b(ux5.m22980c(g9a.m12428e(g9a.m12428e(Integer.hashCode(this.f55128a) * 31, 31, this.f55129b), 31, this.f55130c), this.f55131d, 31), 31, this.f55132e)) * 31, 31), 31), 31), 31, this.f55137j), this.f55138k, 31), 31, this.f55139l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderPage(index=");
        sb.append(this.f55128a);
        sb.append(", isFirstPage=");
        sb.append(this.f55129b);
        sb.append(", isLastPage=");
        hn1.m13367q(", pageText=", this.f55131d, ", textTokens=", sb, this.f55130c);
        sb.append(this.f55132e);
        sb.append(", readerFont=");
        sb.append(this.f55133f);
        sb.append(", lineSpacing=");
        sb.append(this.f55134g);
        sb.append(", fontSize=");
        sb.append(this.f55135h);
        sb.append(", textWidthPx=");
        sb.append(this.f55136i);
        sb.append(", withSpaces=");
        sb.append(this.f55137j);
        sb.append(", scriptType=");
        sb.append(this.f55138k);
        sb.append(", scriptStatusRestricted=");
        sb.append(this.f55139l);
        sb.append(", imageUrlsByPlaceholder=");
        sb.append(this.f55140m);
        sb.append(")");
        return sb.toString();
    }
}
