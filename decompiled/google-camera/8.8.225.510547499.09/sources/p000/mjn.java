package p000;

import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mjn extends Property {
    public mjn(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = mjp.f40753a;
        return Float.valueOf(((mjp) obj).f40761g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        mjp mjpVar = (mjp) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        mjpVar.f40761g = fFloatValue;
        float f = 5400.0f * fFloatValue;
        float[] fArr = mjpVar.f40791k;
        float f2 = fFloatValue * 1520.0f;
        fArr[0] = (-20.0f) + f2;
        fArr[1] = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float f3 = mjp.m16477f(i, mjp.f40753a[i2], 667);
            float[] fArr2 = mjpVar.f40791k;
            fArr2[1] = fArr2[1] + (mjpVar.f40758d.getInterpolation(f3) * 250.0f);
            float f4 = mjp.m16477f(i, mjp.f40754b[i2], 667);
            float[] fArr3 = mjpVar.f40791k;
            fArr3[0] = fArr3[0] + (mjpVar.f40758d.getInterpolation(f4) * 250.0f);
            i2++;
        }
        float[] fArr4 = mjpVar.f40791k;
        float f5 = fArr4[0];
        fArr4[0] = (f5 + ((fArr4[1] - f5) * mjpVar.f40762h)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            float f6 = mjp.m16477f(i, mjp.f40755c[i3], 333);
            if (f6 >= 0.0f && f6 <= 1.0f) {
                int i4 = i3 + mjpVar.f40760f;
                int[] iArr = mjpVar.f40759e.f40743c;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int iM15023p = kxk.m15023p(iArr[i5], mjpVar.f40790j.f40786i);
                int iM15023p2 = kxk.m15023p(mjpVar.f40759e.f40743c[i6], mjpVar.f40790j.f40786i);
                float interpolation = mjpVar.f40758d.getInterpolation(f6);
                int[] iArr2 = mjpVar.f40792l;
                Integer numValueOf = Integer.valueOf(iM15023p);
                Integer numValueOf2 = Integer.valueOf(iM15023p2);
                int iIntValue = numValueOf.intValue();
                int i7 = iIntValue >> 24;
                int iIntValue2 = numValueOf2.intValue();
                int i8 = iIntValue2 >> 24;
                float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                float fPow7 = (float) Math.pow(fPow + ((fPow4 - fPow) * interpolation), 0.45454545454545453d);
                float fPow8 = (float) Math.pow(fPow2 + ((fPow5 - fPow2) * interpolation), 0.45454545454545453d);
                float f7 = (i7 & 255) / 255.0f;
                iArr2[0] = Integer.valueOf(Math.round(((float) Math.pow(fPow3 + ((fPow6 - fPow3) * interpolation), 0.45454545454545453d)) * 255.0f) | (Math.round((f7 + (interpolation * (((i8 & 255) / 255.0f) - f7))) * 255.0f) << 24) | (Math.round(fPow7 * 255.0f) << 16) | (Math.round(fPow8 * 255.0f) << 8)).intValue();
                break;
            }
        }
        mjpVar.f40790j.invalidateSelf();
    }
}
