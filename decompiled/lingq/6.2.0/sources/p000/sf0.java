package p000;

import android.text.Layout;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f60776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60777c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60778d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f60779e;

    public /* synthetic */ sf0(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.f60775a = 1;
        this.f60776b = j;
        this.f60777c = fArr;
        this.f60778d = ref$IntRef;
        this.f60779e = ref$FloatRef;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        long j;
        boolean z;
        float fM14683a;
        float fM14683a2;
        C3309ls c3309ls;
        int i = this.f60775a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f60779e;
        Object obj3 = this.f60778d;
        Object obj4 = this.f60777c;
        switch (i) {
            case 0:
                e28 e28Var = (e28) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                long j2 = this.f60776b;
                fa1 fa1Var = (fa1) obj2;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                float f = e28Var.f36620a;
                float f2 = e28Var.f36621b;
                an0 an0Var = c0358h.f4358a;
                ((qn3) an0Var.f853b.f50064b).m20067V(f, f2);
                try {
                    InterfaceC0310a.m1416Z(c0358h, (C3185ki) ref$ObjectRef.f47718a, j2, 0L, 0.0f, fa1Var, 0, 890);
                    return xfaVar;
                } finally {
                    ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                f37 f37Var = (f37) obj;
                int i2 = f37Var.f38359b;
                C3300lj c3300lj = f37Var.f38358a;
                int iM9923e = f37Var.f38360c;
                long j3 = this.f60776b;
                int iM9924f = i2 > cx9.m9924f(j3) ? f37Var.f38359b : cx9.m9924f(j3);
                if (iM9923e >= cx9.m9923e(j3)) {
                    iM9923e = cx9.m9923e(j3);
                }
                long jM11127g = eh0.m11127g(f37Var.m11527d(iM9924f), f37Var.m11527d(iM9923e));
                int i3 = ref$IntRef.f47716a;
                pw9 pw9Var = c3300lj.f49728d;
                int iM9924f2 = cx9.m9924f(jM11127g);
                int iM9923e2 = cx9.m9923e(jM11127g);
                Layout layout = pw9Var.f56919f;
                int length = layout.getText().length();
                if (iM9924f2 < 0) {
                    j54.m14288a("startOffset must be > 0");
                }
                if (iM9924f2 >= length) {
                    j54.m14288a("startOffset must be less than text length");
                }
                if (iM9923e2 <= iM9924f2) {
                    j54.m14288a("endOffset must be greater than startOffset");
                }
                if (iM9923e2 > length) {
                    j54.m14288a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (iM9923e2 - iM9924f2) * 4) {
                    j54.m14288a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iM19550g = pw9Var.m19550g(iM9924f2);
                int iM19550g2 = pw9Var.m19550g(iM9923e2 - 1);
                jv3 jv3Var = new jv3(pw9Var);
                if (iM19550g <= iM19550g2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iM19550g);
                        int iM19549f = pw9Var.m19549f(iM19550g);
                        int iMax = Math.max(iM9924f2, lineStart);
                        int iMin = Math.min(iM9923e2, iM19549f);
                        float fM19552i = pw9Var.m19552i(iM19550g);
                        float fM19548e = pw9Var.m19548e(iM19550g);
                        j = jM11127g;
                        int i4 = i3;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(iM19550g) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fM14683a3 = jv3Var.m14683a(iMax, false, false, false);
                                    z = z3;
                                    fM14683a = jv3Var.m14683a(iMax + 1, true, true, false);
                                    fM14683a2 = fM14683a3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fM14683a = jv3Var.m14683a(iMax, false, false, false);
                                        fM14683a2 = jv3Var.m14683a(iMax + 1, true, true, false);
                                    } else {
                                        fM14683a2 = jv3Var.m14683a(iMax, false, false, true);
                                        fM14683a = jv3Var.m14683a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fM14683a;
                                fArr[i4 + 1] = fM19552i;
                                fArr[i4 + 2] = fM14683a2;
                                fArr[i4 + 3] = fM19548e;
                                i4 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fM14683a = jv3Var.m14683a(iMax, z2, z2, true);
                                z = z3;
                                fM14683a2 = jv3Var.m14683a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i4] = fM14683a;
                            fArr[i4 + 1] = fM19552i;
                            fArr[i4 + 2] = fM14683a2;
                            fArr[i4 + 3] = fM19548e;
                            i4 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (iM19550g != iM19550g2) {
                            iM19550g++;
                            jM11127g = j;
                            i3 = i4;
                        }
                    }
                } else {
                    j = jM11127g;
                }
                int iM9922d = (cx9.m9922d(j) * 4) + ref$IntRef.f47716a;
                for (int i5 = ref$IntRef.f47716a; i5 < iM9922d; i5 += 4) {
                    int i6 = i5 + 1;
                    float f3 = fArr[i6];
                    float f4 = ref$FloatRef.f47715a;
                    fArr[i6] = f3 + f4;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f4;
                }
                ref$IntRef.f47716a = iM9922d;
                ref$FloatRef.f47715a = c3300lj.m16239b() + ref$FloatRef.f47715a;
                return xfaVar;
            default:
                long j4 = this.f60776b;
                C3500qj c3500qj = (C3500qj) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                float fMo169a = ((k73) obj4).mo169a();
                float fMax = (Math.max(Math.min(1.0f, fMo169a) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fM15944g = l70.m15944g(Math.abs(fMo169a) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fM15944g - (((float) Math.pow(fM15944g, 2.0d)) / 4.0f))) * 0.5f;
                float f5 = fPow * 360.0f;
                float f6 = ((0.8f * fMax) + fPow) * 360.0f;
                float fMin = Math.min(1.0f, fMax);
                C3588sv c3588sv = new C3588sv();
                c3588sv.f61450a = f6;
                c3588sv.f61451b = fMin;
                float fFloatValue = ((Number) ((dh9) obj3).getValue()).floatValue();
                long jMo1423z0 = interfaceC0310a.mo1423z0();
                C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                long jM16483A = c3309lsMo603o0.m16483A();
                c3309lsMo603o0.m16515r().mo17016h();
                try {
                    ((qn3) c3309lsMo603o0.f50064b).m20052F(fPow, jMo1423z0);
                    float fMo912g0 = (interfaceC0310a.mo912g0(2.5f) / 2.0f) + interfaceC0310a.mo912g0(5.5f);
                    long jM10538n = do7.m10538n(interfaceC0310a.mo1422h());
                    int i8 = (int) (jM10538n >> 32);
                    int i9 = (int) (jM10538n & 4294967295L);
                    e28 e28Var2 = new e28(Float.intBitsToFloat(i8) - fMo912g0, Float.intBitsToFloat(i9) - fMo912g0, Float.intBitsToFloat(i8) + fMo912g0, Float.intBitsToFloat(i9) + fMo912g0);
                    c3309ls = c3309lsMo603o0;
                    try {
                        InterfaceC0310a.m1419t0(interfaceC0310a, j4, f5, f6 - f5, e28Var2.m10805f(), e28Var2.m10804e(), fFloatValue, new el9(interfaceC0310a.mo912g0(2.5f), 0.0f, 0, 0, 26), 768);
                        lp7.m16425c(interfaceC0310a, c3500qj, e28Var2, j4, fFloatValue, c3588sv);
                        AbstractC3393o1.m17751z(c3309ls, jM16483A);
                        return xfaVar;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC3393o1.m17751z(c3309ls, jM16483A);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c3309ls = c3309lsMo603o0;
                }
                break;
        }
    }

    public /* synthetic */ sf0(Object obj, Object obj2, long j, Object obj3, int i) {
        this.f60775a = i;
        this.f60777c = obj;
        this.f60778d = obj2;
        this.f60776b = j;
        this.f60779e = obj3;
    }
}
