package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class do0 {

    /* JADX INFO: renamed from: a */
    public final boolean f35915a;

    /* JADX INFO: renamed from: b */
    public final boolean f35916b;

    /* JADX INFO: renamed from: c */
    public final boolean f35917c;

    /* JADX INFO: renamed from: d */
    public final boolean f35918d;

    /* JADX INFO: renamed from: e */
    public final boolean f35919e;

    /* JADX INFO: renamed from: f */
    public final boolean f35920f;

    /* JADX INFO: renamed from: g */
    public final boolean f35921g;

    /* JADX INFO: renamed from: h */
    public final boolean f35922h;

    /* JADX INFO: renamed from: i */
    public final boolean f35923i;

    /* JADX INFO: renamed from: j */
    public final boolean f35924j;

    /* JADX INFO: renamed from: k */
    public final boolean f35925k;

    /* JADX INFO: renamed from: l */
    public final Map f35926l;

    /* JADX INFO: renamed from: m */
    public final Map f35927m;

    /* JADX INFO: renamed from: n */
    public final Map f35928n;

    public do0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, Map map, Map map2, Map map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.f35915a = z;
        this.f35916b = z2;
        this.f35917c = z3;
        this.f35918d = z4;
        this.f35919e = z5;
        this.f35920f = z6;
        this.f35921g = z7;
        this.f35922h = z8;
        this.f35923i = z9;
        this.f35924j = z10;
        this.f35925k = z11;
        this.f35926l = map;
        this.f35927m = map2;
        this.f35928n = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do0)) {
            return false;
        }
        do0 do0Var = (do0) obj;
        return this.f35915a == do0Var.f35915a && this.f35916b == do0Var.f35916b && this.f35917c == do0Var.f35917c && this.f35918d == do0Var.f35918d && this.f35919e == do0Var.f35919e && this.f35920f == do0Var.f35920f && this.f35921g == do0Var.f35921g && this.f35922h == do0Var.f35922h && this.f35923i == do0Var.f35923i && this.f35924j == do0Var.f35924j && this.f35925k == do0Var.f35925k && fa4.m11650l(this.f35926l, do0Var.f35926l) && fa4.m11650l(this.f35927m, do0Var.f35927m) && fa4.m11650l(this.f35928n, do0Var.f35928n);
    }

    public final int hashCode() {
        return this.f35928n.hashCode() + e65.m10869a(e65.m10869a(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f35915a) * 31, 31, this.f35916b), 31, this.f35917c), 31, this.f35918d), 31, this.f35919e), 31, this.f35920f), 31, this.f35921g), 31, this.f35922h), 31, this.f35923i), 31, this.f35924j), 31, this.f35925k), 31, this.f35926l), 31, this.f35927m);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("CardSettingsData(frontTerm=", ", frontPhrase=", ", frontTranslation=", this.f35915a, this.f35916b);
        wq1.m24101A(sbM13357g, this.f35917c, ", frontStatus=", this.f35918d, ", frontTags=");
        wq1.m24101A(sbM13357g, this.f35919e, ", backTerm=", this.f35920f, ", backPhrase=");
        wq1.m24101A(sbM13357g, this.f35921g, ", backTranslation=", this.f35922h, ", backStatus=");
        wq1.m24101A(sbM13357g, this.f35923i, ", backTags=", this.f35924j, ", backNotes=");
        sbM13357g.append(this.f35925k);
        sbM13357g.append(", transliterationScripts=");
        sbM13357g.append(this.f35926l);
        sbM13357g.append(", autoplayTTS=");
        sbM13357g.append(this.f35927m);
        sbM13357g.append(", shuffleCards=");
        sbM13357g.append(this.f35928n);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
