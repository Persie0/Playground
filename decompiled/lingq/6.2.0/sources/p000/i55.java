package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes3.dex */
public final class i55 {

    /* JADX INFO: renamed from: a */
    public final String f43538a;

    /* JADX INFO: renamed from: b */
    public final int f43539b;

    /* JADX INFO: renamed from: c */
    public final ReaderFont f43540c;

    /* JADX INFO: renamed from: d */
    public final int f43541d;

    public i55(String str, int i, ReaderFont readerFont, int i2) {
        str.getClass();
        readerFont.getClass();
        this.f43538a = str;
        this.f43539b = i;
        this.f43540c = readerFont;
        this.f43541d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) obj;
        return fa4.m11650l(this.f43538a, i55Var.f43538a) && this.f43539b == i55Var.f43539b && this.f43540c == i55Var.f43540c && this.f43541d == i55Var.f43541d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43541d) + ((this.f43540c.hashCode() + wq1.m24106b(this.f43539b, this.f43538a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f43539b, "TranslationMeasureKey(translation=", this.f43538a, ", textWidthPx=", ", font=");
        sbM17741p.append(this.f43540c);
        sbM17741p.append(", fontSizeSp=");
        sbM17741p.append(this.f43541d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
