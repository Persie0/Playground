package p000;

import androidx.compose.p002ui.graphics.colorspace.C0308a;

/* JADX INFO: loaded from: classes.dex */
public final class qi1 extends ri1 {

    /* JADX INFO: renamed from: e */
    public final C0308a f57802e;

    /* JADX INFO: renamed from: f */
    public final C0308a f57803f;

    /* JADX INFO: renamed from: g */
    public final float[] f57804g;

    public qi1(C0308a c0308a, C0308a c0308a2) {
        float[] fArrM24368y;
        super(c0308a2, c0308a, c0308a2, null);
        this.f57802e = c0308a;
        this.f57803f = c0308a2;
        float[] fArr = C3400o8.f53963c.f53965b;
        i4b i4bVar = c0308a.f3941d;
        float[] fArr2 = c0308a.f3946i;
        i4b i4bVar2 = c0308a2.f3941d;
        float[] fArr3 = c0308a2.f3947j;
        if (x74.m24354k(i4bVar, i4bVar2)) {
            fArrM24368y = x74.m24368y(fArr3, fArr2);
        } else {
            float[] fArrM13658a = i4bVar.m13658a();
            float[] fArrM13658a2 = i4bVar2.m13658a();
            i4b i4bVar3 = AbstractC3184kh.f47266h;
            fArrM24368y = x74.m24368y(x74.m24354k(i4bVar2, i4bVar3) ? fArr3 : x74.m24365v(x74.m24368y(x74.m24353j(fArr, fArrM13658a2, new float[]{0.964212f, 1.0f, 0.825188f}), c0308a2.f3946i)), x74.m24354k(i4bVar, i4bVar3) ? fArr2 : x74.m24368y(x74.m24353j(fArr, fArrM13658a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f57804g = fArrM24368y;
    }

    @Override // p000.ri1
    /* JADX INFO: renamed from: a */
    public final long mo19178a(long j) {
        float fM204h = aa1.m204h(j);
        float fM203g = aa1.m203g(j);
        float fM201e = aa1.m201e(j);
        float fM200d = aa1.m200d(j);
        xg8 xg8Var = this.f57802e.f3953p;
        float fMo503c = (float) xg8Var.mo503c(fM204h);
        float fMo503c2 = (float) xg8Var.mo503c(fM203g);
        float fMo503c3 = (float) xg8Var.mo503c(fM201e);
        float[] fArr = this.f57804g;
        float f = (fArr[6] * fMo503c3) + (fArr[3] * fMo503c2) + (fArr[0] * fMo503c);
        float f2 = (fArr[7] * fMo503c3) + (fArr[4] * fMo503c2) + (fArr[1] * fMo503c);
        float f3 = (fArr[8] * fMo503c3) + (fArr[5] * fMo503c2) + (fArr[2] * fMo503c);
        C0308a c0308a = this.f57803f;
        float fMo503c4 = (float) c0308a.f3950m.mo503c(f);
        xg8 xg8Var2 = c0308a.f3950m;
        return d32.m10033d(fMo503c4, (float) xg8Var2.mo503c(f2), (float) xg8Var2.mo503c(f3), fM200d, c0308a);
    }
}
