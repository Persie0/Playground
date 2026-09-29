package p000;

import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class kn5 {

    /* JADX INFO: renamed from: a */
    public final int f47550a;

    /* JADX INFO: renamed from: b */
    public final double f47551b;

    /* JADX INFO: renamed from: c */
    public final ReaderFont f47552c;

    /* JADX INFO: renamed from: d */
    public final vs3 f47553d;

    /* JADX INFO: renamed from: e */
    public final TextHighlightStyle f47554e;

    public kn5(int i, double d, ReaderFont readerFont, vs3 vs3Var, TextHighlightStyle textHighlightStyle) {
        readerFont.getClass();
        vs3Var.getClass();
        textHighlightStyle.getClass();
        this.f47550a = i;
        this.f47551b = d;
        this.f47552c = readerFont;
        this.f47553d = vs3Var;
        this.f47554e = textHighlightStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        kn5 kn5Var = (kn5) obj;
        return this.f47550a == kn5Var.f47550a && Double.compare(this.f47551b, kn5Var.f47551b) == 0 && this.f47552c == kn5Var.f47552c && fa4.m11650l(this.f47553d, kn5Var.f47553d) && this.f47554e == kn5Var.f47554e;
    }

    public final int hashCode() {
        return this.f47554e.hashCode() + ((this.f47553d.hashCode() + ((this.f47552c.hashCode() + g9a.m12424a(this.f47551b, Integer.hashCode(this.f47550a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LynxCoachTextStyle(fontSize=" + this.f47550a + ", lineHeight=" + this.f47551b + ", font=" + this.f47552c + ", colorScheme=" + this.f47553d + ", highlightStyle=" + this.f47554e + ")";
    }
}
