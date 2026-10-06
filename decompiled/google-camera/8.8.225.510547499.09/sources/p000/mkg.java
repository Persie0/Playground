package p000;

import android.util.Property;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mkg extends Property {
    public mkg(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = mkh.f40825a;
        return Float.valueOf(((mkh) obj).f40832g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mkh mkhVar = (mkh) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        mkhVar.f40832g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        for (int i = 0; i < 4; i++) {
            mkhVar.f40791k[i] = Math.max(0.0f, Math.min(1.0f, mkhVar.f40828c[i].getInterpolation(mkh.m16477f((int) f, mkh.f40826b[i], mkh.f40825a[i]))));
        }
        if (mkhVar.f40831f) {
            Arrays.fill(mkhVar.f40792l, kxk.m15023p(mkhVar.f40829d.f40743c[mkhVar.f40830e], mkhVar.f40790j.f40786i));
            mkhVar.f40831f = false;
        }
        mkhVar.f40790j.invalidateSelf();
    }
}
