package p000;

import androidx.compose.foundation.gestures.C0119y;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: renamed from: uh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3648uh implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f63912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63913c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f63914d;

    public /* synthetic */ C3648uh(C0119y c0119y, float f, vi3 vi3Var) {
        this.f63911a = 2;
        this.f63913c = c0119y;
        this.f63912b = f;
        this.f63914d = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f A[PHI: r0
      0x008f: PHI (r0v13 float) = (r0v12 float), (r0v20 float) binds: [B:23:0x00a5, B:17:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.f63911a;
        xfa xfaVar = xfa.f68157a;
        float f = 0.0f;
        Object obj2 = this.f63914d;
        float f2 = this.f63912b;
        Object obj3 = this.f63913c;
        switch (i) {
            case 0:
                C3185ki c3185ki = (C3185ki) obj3;
                qd0 qd0Var = (qd0) obj2;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                C3309ls c3309ls = c0358h.f4358a.f853b;
                long jM16483A = c3309ls.m16483A();
                c3309ls.m16515r().mo17016h();
                try {
                    qn3 qn3Var = (qn3) c3309ls.f50064b;
                    qn3Var.m20067V(f2, 0.0f);
                    qn3Var.m20052F(45.0f, 0L);
                    InterfaceC0310a.m1410E(c0358h, c3185ki, 0L, 0.0f, qd0Var, 46);
                    return xfaVar;
                } finally {
                    AbstractC3393o1.m17751z(c3309ls, jM16483A);
                }
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                jv4 jv4Var = (jv4) obj2;
                C3838zm c3838zm = (C3838zm) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue();
                    if (fFloatValue > f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue();
                    if (fFloatValue < f2) {
                        f = f2;
                    } else {
                        f = fFloatValue;
                    }
                }
                float f3 = f - ref$FloatRef.f47715a;
                if (f3 != jv4Var.mo3997a(f3) || f != ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue()) {
                    c3838zm.m25698a();
                }
                ref$FloatRef.f47715a += f3;
                return xfaVar;
            default:
                C0119y c0119y = (C0119y) obj3;
                vi3 vi3Var = (vi3) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (c0119y.f2378b == Long.MIN_VALUE) {
                    c0119y.f2378b = jLongValue;
                }
                float f4 = c0119y.f2381e;
                C2934dn c2934dn = new C2934dn(f4);
                C2934dn c2934dn2 = C0119y.f2376f;
                long jMo9842d = f2 == 0.0f ? c0119y.f2377a.mo9842d(new C2934dn(f4), c2934dn2, c0119y.f2379c) : ss5.m21694U((jLongValue - c0119y.f2378b) / f2);
                float f5 = ((C2934dn) c0119y.f2377a.mo4036r(jMo9842d, c2934dn, c2934dn2, c0119y.f2379c)).f35886a;
                c0119y.f2379c = (C2934dn) c0119y.f2377a.mo4033i(jMo9842d, c2934dn, c2934dn2, c0119y.f2379c);
                c0119y.f2378b = jLongValue;
                float f6 = c0119y.f2381e - f5;
                c0119y.f2381e = f5;
                vi3Var.invoke(Float.valueOf(f6));
                return xfaVar;
        }
    }

    public /* synthetic */ C3648uh(float f, Object obj, Object obj2, int i) {
        this.f63911a = i;
        this.f63912b = f;
        this.f63913c = obj;
        this.f63914d = obj2;
    }
}
