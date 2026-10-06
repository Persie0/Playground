package p000;

import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkc extends Property {
    public mkc(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = mkd.f40815f;
        return Float.valueOf(((mkd) obj).f40821e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mkd mkdVar = (mkd) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        mkdVar.f40821e = fFloatValue;
        float[] fArr = mkdVar.f40791k;
        fArr[0] = 0.0f;
        akf akfVar = mkdVar.f40817a;
        float f = mkd.m16477f((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = akfVar.getInterpolation(f);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = mkdVar.f40791k;
        float interpolation2 = mkdVar.f40817a.getInterpolation(f + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        float[] fArr3 = mkdVar.f40791k;
        fArr3[5] = 1.0f;
        if (mkdVar.f40820d && fArr3[3] < 1.0f) {
            int[] iArr = mkdVar.f40792l;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = kxk.m15023p(mkdVar.f40818b.f40743c[mkdVar.f40819c], mkdVar.f40790j.f40786i);
            mkdVar.f40820d = false;
        }
        mkdVar.f40790j.invalidateSelf();
    }
}
