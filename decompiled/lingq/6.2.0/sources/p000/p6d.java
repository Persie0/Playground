package p000;

import android.graphics.Typeface;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p6d {
    /* JADX INFO: renamed from: a */
    public static final void m18932a(float f, final int i, int i2, final long j, ye1 ye1Var, e16 e16Var) {
        float f2;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1108339918);
        int i3 = i2 | 6 | (tj3Var.m22116e(i) ? 32 : 16) | 3072;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            final float f3 = 2.0f;
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new vi3() { // from class: bv0
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        interfaceC0310a.getClass();
                        float f4 = 0.0f;
                        char c = ' ';
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        long jMo1422h = interfaceC0310a.mo1422h();
                        float f5 = f3;
                        el9 el9Var = new el9(f5, 0.0f, 0, 0, 30);
                        long j2 = j;
                        InterfaceC0310a.m1414L0(interfaceC0310a, j2, jFloatToRawIntBits, jMo1422h, 0.0f, el9Var, 0, 104);
                        interfaceC0310a.mo604w(j2, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / 2.0f)) & 4294967295L), f5, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        int i4 = i;
                        float f6 = fIntBitsToFloat / i4;
                        int i5 = 1;
                        while (i5 < i4) {
                            float f7 = i5 * f6;
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f7)) << c) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                            char c2 = c;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)))) & 4294967295L);
                            int i6 = i5;
                            InterfaceC0310a interfaceC0310a2 = interfaceC0310a;
                            long j3 = j2;
                            interfaceC0310a2.mo604w(j3, jFloatToRawIntBits2, jFloatToRawIntBits3, f5, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                            j2 = j3;
                            interfaceC0310a = interfaceC0310a2;
                            i5 = i6 + 1;
                            c = c2;
                            f4 = 0.0f;
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O, tj3Var, 0);
            f2 = 2.0f;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            f2 = f;
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cv0(f2, i, i2, j, e16Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo33b(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo34c(Typeface typeface, boolean z);
}
