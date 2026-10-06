package p000;

import android.graphics.Paint;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class atl extends atn {

    /* JADX INFO: renamed from: a */
    public int[] f2309a;

    /* JADX INFO: renamed from: b */
    float f2310b;

    /* JADX INFO: renamed from: c */
    float f2311c;

    /* JADX INFO: renamed from: d */
    float f2312d;

    /* JADX INFO: renamed from: e */
    float f2313e;

    /* JADX INFO: renamed from: f */
    float f2314f;

    /* JADX INFO: renamed from: g */
    float f2315g;

    /* JADX INFO: renamed from: h */
    Paint.Cap f2316h;

    /* JADX INFO: renamed from: i */
    Paint.Join f2317i;

    /* JADX INFO: renamed from: j */
    float f2318j;

    /* JADX INFO: renamed from: k */
    ilo f2319k;

    /* JADX INFO: renamed from: l */
    ilo f2320l;

    public atl() {
        this.f2310b = 0.0f;
        this.f2311c = 1.0f;
        this.f2312d = 1.0f;
        this.f2313e = 0.0f;
        this.f2314f = 1.0f;
        this.f2315g = 0.0f;
        this.f2316h = Paint.Cap.BUTT;
        this.f2317i = Paint.Join.MITER;
        this.f2318j = 4.0f;
    }

    @Override // p000.asp
    /* JADX INFO: renamed from: b */
    public final boolean mo1969b() {
        return this.f2320l.m11443f() || this.f2319k.m11443f();
    }

    @Override // p000.asp
    /* JADX INFO: renamed from: c */
    public final boolean mo1970c(int[] iArr) {
        return this.f2319k.m11444g(iArr) | this.f2320l.m11444g(iArr);
    }

    float getFillAlpha() {
        return this.f2312d;
    }

    int getFillColor() {
        return this.f2320l.f31455a;
    }

    float getStrokeAlpha() {
        return this.f2311c;
    }

    int getStrokeColor() {
        return this.f2319k.f31455a;
    }

    float getStrokeWidth() {
        return this.f2310b;
    }

    float getTrimPathEnd() {
        return this.f2314f;
    }

    float getTrimPathOffset() {
        return this.f2315g;
    }

    float getTrimPathStart() {
        return this.f2313e;
    }

    void setFillAlpha(float f) {
        this.f2312d = f;
    }

    void setFillColor(int i) {
        this.f2320l.f31455a = i;
    }

    void setStrokeAlpha(float f) {
        this.f2311c = f;
    }

    void setStrokeColor(int i) {
        this.f2319k.f31455a = i;
    }

    void setStrokeWidth(float f) {
        this.f2310b = f;
    }

    void setTrimPathEnd(float f) {
        this.f2314f = f;
    }

    void setTrimPathOffset(float f) {
        this.f2315g = f;
    }

    void setTrimPathStart(float f) {
        this.f2313e = f;
    }

    public atl(atl atlVar) {
        super(atlVar);
        this.f2310b = 0.0f;
        this.f2311c = 1.0f;
        this.f2312d = 1.0f;
        this.f2313e = 0.0f;
        this.f2314f = 1.0f;
        this.f2315g = 0.0f;
        this.f2316h = Paint.Cap.BUTT;
        this.f2317i = Paint.Join.MITER;
        this.f2318j = 4.0f;
        int[] iArr = atlVar.f2309a;
        this.f2309a = null;
        this.f2319k = atlVar.f2319k;
        this.f2310b = atlVar.f2310b;
        this.f2311c = atlVar.f2311c;
        this.f2320l = atlVar.f2320l;
        this.f2336o = atlVar.f2336o;
        this.f2312d = atlVar.f2312d;
        this.f2313e = atlVar.f2313e;
        this.f2314f = atlVar.f2314f;
        this.f2315g = atlVar.f2315g;
        this.f2316h = atlVar.f2316h;
        this.f2317i = atlVar.f2317i;
        this.f2318j = atlVar.f2318j;
    }
}
