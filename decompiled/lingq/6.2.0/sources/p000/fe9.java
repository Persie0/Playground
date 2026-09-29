package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fe9 {

    /* JADX INFO: renamed from: a */
    public final float f38952a;

    /* JADX INFO: renamed from: b */
    public final float f38953b;

    /* JADX INFO: renamed from: c */
    public final float f38954c;

    /* JADX INFO: renamed from: d */
    public final float f38955d;

    /* JADX INFO: renamed from: e */
    public final float f38956e;

    /* JADX INFO: renamed from: f */
    public final float f38957f;

    /* JADX INFO: renamed from: g */
    public final float f38958g;

    /* JADX INFO: renamed from: h */
    public final float f38959h;

    /* JADX INFO: renamed from: i */
    public final float f38960i;

    /* JADX INFO: renamed from: j */
    public final float f38961j;

    /* JADX INFO: renamed from: k */
    public final float f38962k;

    /* JADX INFO: renamed from: l */
    public final float f38963l;

    /* JADX INFO: renamed from: m */
    public final float f38964m;

    /* JADX INFO: renamed from: n */
    public final float f38965n;

    public fe9(int i) {
        float f = (i & 8) != 0 ? 4.0f : 6.0f;
        float f2 = (i & 256) != 0 ? 16.0f : 24.0f;
        float f3 = (i & 512) != 0 ? 8.0f : 16.0f;
        float f4 = (i & 1024) != 0 ? 32.0f : 48.0f;
        float f5 = (i & 4096) != 0 ? 16.0f : 18.0f;
        float f6 = (i & 8192) != 0 ? 8.0f : 12.0f;
        this.f38952a = 8.0f;
        this.f38953b = 0.0f;
        this.f38954c = 2.0f;
        this.f38955d = f;
        this.f38956e = 12.0f;
        this.f38957f = 16.0f;
        this.f38958g = 24.0f;
        this.f38959h = 32.0f;
        this.f38960i = f2;
        this.f38961j = f3;
        this.f38962k = f4;
        this.f38963l = 12.0f;
        this.f38964m = f5;
        this.f38965n = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe9)) {
            return false;
        }
        fe9 fe9Var = (fe9) obj;
        return xj2.m24560b(this.f38952a, fe9Var.f38952a) && xj2.m24560b(this.f38953b, fe9Var.f38953b) && xj2.m24560b(this.f38954c, fe9Var.f38954c) && xj2.m24560b(this.f38955d, fe9Var.f38955d) && xj2.m24560b(this.f38956e, fe9Var.f38956e) && xj2.m24560b(this.f38957f, fe9Var.f38957f) && xj2.m24560b(this.f38958g, fe9Var.f38958g) && xj2.m24560b(this.f38959h, fe9Var.f38959h) && xj2.m24560b(this.f38960i, fe9Var.f38960i) && xj2.m24560b(this.f38961j, fe9Var.f38961j) && xj2.m24560b(this.f38962k, fe9Var.f38962k) && xj2.m24560b(this.f38963l, fe9Var.f38963l) && xj2.m24560b(this.f38964m, fe9Var.f38964m) && xj2.m24560b(this.f38965n, fe9Var.f38965n) && xj2.m24560b(16.0f, 16.0f) && xj2.m24560b(32.0f, 32.0f) && xj2.m24560b(40.0f, 40.0f) && xj2.m24560b(24.0f, 24.0f) && xj2.m24560b(16.0f, 16.0f) && xj2.m24560b(48.0f, 48.0f) && xj2.m24560b(6.0f, 6.0f) && xj2.m24560b(48.0f, 48.0f) && xj2.m24560b(48.0f, 48.0f) && xj2.m24560b(64.0f, 64.0f) && xj2.m24560b(227.0f, 227.0f) && xj2.m24560b(140.0f, 140.0f) && xj2.m24560b(20.0f, 20.0f) && xj2.m24560b(12.0f, 12.0f);
    }

    public final int hashCode() {
        return Float.hashCode(12.0f) + wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(this.f38952a) * 31, this.f38953b, 31), this.f38954c, 31), this.f38955d, 31), this.f38956e, 31), this.f38957f, 31), this.f38958g, 31), this.f38959h, 31), this.f38960i, 31), this.f38961j, 31), this.f38962k, 31), this.f38963l, 31), this.f38964m, 31), this.f38965n, 31), 16.0f, 31), 32.0f, 31), 40.0f, 31), 24.0f, 31), 16.0f, 31), 48.0f, 31), 6.0f, 31), 48.0f, 31), 48.0f, 31), 64.0f, 31), 227.0f, 31), 140.0f, 31), 20.0f, 31);
    }

    public final String toString() {
        String strM24561c = xj2.m24561c(this.f38952a);
        String strM24561c2 = xj2.m24561c(this.f38953b);
        String strM24561c3 = xj2.m24561c(this.f38954c);
        String strM24561c4 = xj2.m24561c(this.f38955d);
        String strM24561c5 = xj2.m24561c(this.f38956e);
        String strM24561c6 = xj2.m24561c(this.f38957f);
        String strM24561c7 = xj2.m24561c(this.f38958g);
        String strM24561c8 = xj2.m24561c(this.f38959h);
        String strM24561c9 = xj2.m24561c(this.f38960i);
        String strM24561c10 = xj2.m24561c(this.f38961j);
        String strM24561c11 = xj2.m24561c(this.f38962k);
        String strM24561c12 = xj2.m24561c(this.f38963l);
        String strM24561c13 = xj2.m24561c(this.f38964m);
        String strM24561c14 = xj2.m24561c(this.f38965n);
        String strM24561c15 = xj2.m24561c(16.0f);
        String strM24561c16 = xj2.m24561c(32.0f);
        String strM24561c17 = xj2.m24561c(40.0f);
        String strM24561c18 = xj2.m24561c(24.0f);
        String strM24561c19 = xj2.m24561c(16.0f);
        String strM24561c20 = xj2.m24561c(48.0f);
        String strM24561c21 = xj2.m24561c(6.0f);
        String strM24561c22 = xj2.m24561c(48.0f);
        String strM24561c23 = xj2.m24561c(48.0f);
        String strM24561c24 = xj2.m24561c(64.0f);
        String strM24561c25 = xj2.m24561c(227.0f);
        String strM24561c26 = xj2.m24561c(140.0f);
        String strM24561c27 = xj2.m24561c(20.0f);
        String strM24561c28 = xj2.m24561c(12.0f);
        StringBuilder sbM23000w = ux5.m23000w("Spacing(default=", strM24561c, ", none=", strM24561c2, ", extraSmall=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c3, ", small=", strM24561c4, ", large=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c5, ", extraLarge=", strM24561c6, ", superLarge=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c7, ", megaLarge=", strM24561c8, ", screenStandardPadding=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c9, ", screenVerticalPadding=", strM24561c10, ", screenExtraPadding=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c11, ", listVerticalPadding=", strM24561c12, ", listExtraVerticalPadding=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c13, ", listHorizontalPadding=", strM24561c14, ", listExtraHorizontalPadding=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c15, ", icon=", strM24561c16, ", iconLarge=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c17, ", iconSmaller=", strM24561c18, ", iconSmall=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c19, ", progressCircular=", strM24561c20, ", progressCircularStroke=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c21, ", minButtonMainActionHeight=", strM24561c22, ", thumbnail=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c23, ", listeningModeImageSize=", strM24561c24, ", libraryItemWidth=");
        AbstractC3393o1.m17725C(sbM23000w, strM24561c25, ", libraryItemHeight=", strM24561c26, ", libraryItemStatWidth=");
        return wq1.m24125u(sbM23000w, strM24561c27, ", libraryItemStatHeight=", strM24561c28, ")");
    }
}
