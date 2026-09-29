package p000;

import com.lingq.core.domain.model.theme.ColorSchemeName;

/* JADX INFO: loaded from: classes.dex */
public final class vs3 {

    /* JADX INFO: renamed from: a */
    public final String f65845a;

    /* JADX INFO: renamed from: b */
    public final ColorSchemeName f65846b;

    /* JADX INFO: renamed from: c */
    public final yd5 f65847c;

    /* JADX INFO: renamed from: d */
    public final u7b f65848d;

    /* JADX INFO: renamed from: e */
    public final String f65849e;

    /* JADX INFO: renamed from: f */
    public final String f65850f;

    /* JADX INFO: renamed from: g */
    public final String f65851g;

    public vs3(String str, ColorSchemeName colorSchemeName, yd5 yd5Var, u7b u7bVar, String str2, String str3, String str4) {
        colorSchemeName.getClass();
        this.f65845a = str;
        this.f65846b = colorSchemeName;
        this.f65847c = yd5Var;
        this.f65848d = u7bVar;
        this.f65849e = str2;
        this.f65850f = str3;
        this.f65851g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs3)) {
            return false;
        }
        vs3 vs3Var = (vs3) obj;
        return fa4.m11650l(this.f65845a, vs3Var.f65845a) && this.f65846b == vs3Var.f65846b && fa4.m11650l(this.f65847c, vs3Var.f65847c) && fa4.m11650l(this.f65848d, vs3Var.f65848d) && fa4.m11650l(this.f65849e, vs3Var.f65849e) && fa4.m11650l(this.f65850f, vs3Var.f65850f) && fa4.m11650l(this.f65851g, vs3Var.f65851g);
    }

    public final int hashCode() {
        return this.f65851g.hashCode() + ux5.m22980c(ux5.m22980c((this.f65848d.hashCode() + ((this.f65847c.hashCode() + ((this.f65846b.hashCode() + (this.f65845a.hashCode() * 31)) * 31)) * 31)) * 31, this.f65849e, 31), this.f65850f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightColorScheme(id=");
        sb.append(this.f65845a);
        sb.append(", name=");
        sb.append(this.f65846b);
        sb.append(", lingq=");
        sb.append(this.f65847c);
        sb.append(", word=");
        sb.append(this.f65848d);
        sb.append(", relatedPhraseBackground=");
        AbstractC3393o1.m17725C(sb, this.f65849e, ", relatedPhraseSelectedBackground=", this.f65850f, ", relatedPhraseBorder=");
        return AbstractC3393o1.m17738m(sb, this.f65851g, ")");
    }

    public /* synthetic */ vs3(String str, ColorSchemeName colorSchemeName, yd5 yd5Var, u7b u7bVar) {
        this(str, colorSchemeName, yd5Var, u7bVar, "#88eaebed", "#1565C0", "#091a2f");
    }
}
