package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes3.dex */
public final class ox9 {

    /* JADX INFO: renamed from: a */
    public final ReaderFont f55144a;

    /* JADX INFO: renamed from: b */
    public final int f55145b;

    /* JADX INFO: renamed from: c */
    public final double f55146c;

    /* JADX INFO: renamed from: d */
    public final boolean f55147d;

    /* JADX INFO: renamed from: e */
    public final boolean f55148e;

    /* JADX INFO: renamed from: f */
    public final boolean f55149f;

    public ox9(ReaderFont readerFont, int i, double d, boolean z, boolean z2, boolean z3) {
        readerFont.getClass();
        this.f55144a = readerFont;
        this.f55145b = i;
        this.f55146c = d;
        this.f55147d = z;
        this.f55148e = z2;
        this.f55149f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox9)) {
            return false;
        }
        ox9 ox9Var = (ox9) obj;
        return this.f55144a == ox9Var.f55144a && this.f55145b == ox9Var.f55145b && Double.compare(this.f55146c, ox9Var.f55146c) == 0 && this.f55147d == ox9Var.f55147d && this.f55148e == ox9Var.f55148e && this.f55149f == ox9Var.f55149f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55149f) + g9a.m12428e(g9a.m12428e(g9a.m12424a(this.f55146c, wq1.m24106b(this.f55145b, this.f55144a.hashCode() * 31, 31), 31), 31, this.f55147d), 31, this.f55148e);
    }

    public final String toString() {
        return "TextSettings(font=" + this.f55144a + ", fontSize=" + this.f55145b + ", lineSpacing=" + this.f55146c + ", showSpaces=" + this.f55147d + ", isSentenceMode=" + this.f55148e + ", showSentenceTranslations=" + this.f55149f + ")";
    }
}
