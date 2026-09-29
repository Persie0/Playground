package p000;

import androidx.compose.foundation.gestures.snapping.AbstractC0113b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fc9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f38857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$FloatRef f38858c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f38859d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f38860e;

    public /* synthetic */ fc9(float f, Ref$FloatRef ref$FloatRef, Object obj, Object obj2, int i) {
        this.f38856a = i;
        this.f38857b = f;
        this.f38858c = ref$FloatRef;
        this.f38859d = obj;
        this.f38860e = obj2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f38856a;
        float fMo3997a = 0.0f;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f38860e;
        Object obj3 = this.f38859d;
        Ref$FloatRef ref$FloatRef = this.f38858c;
        float f = this.f38857b;
        switch (i) {
            case 0:
                wn8 wn8Var = (wn8) obj3;
                vi3 vi3Var = (vi3) obj2;
                C3838zm c3838zm = (C3838zm) obj;
                float fAbs = Math.abs(((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                t66 t66Var = c3838zm.f71729e;
                if (fAbs < fAbs2) {
                    xc9 xc9Var = (xc9) t66Var;
                    AbstractC0113b.m926c(c3838zm, wn8Var, vi3Var, ((Number) xc9Var.getValue()).floatValue() - ref$FloatRef.f47715a);
                    ref$FloatRef.f47715a = ((Number) xc9Var.getValue()).floatValue();
                } else {
                    float fM927d = AbstractC0113b.m927d(((Number) ((xc9) t66Var).getValue()).floatValue(), f);
                    AbstractC0113b.m926c(c3838zm, wn8Var, vi3Var, fM927d - ref$FloatRef.f47715a);
                    c3838zm.m25698a();
                    ref$FloatRef.f47715a = fM927d;
                }
                break;
            case 1:
                wn8 wn8Var2 = (wn8) obj3;
                vi3 vi3Var2 = (vi3) obj2;
                C3838zm c3838zm2 = (C3838zm) obj;
                float fM927d2 = AbstractC0113b.m927d(((Number) ((xc9) c3838zm2.f71729e).getValue()).floatValue(), f);
                float f2 = fM927d2 - ref$FloatRef.f47715a;
                try {
                    fMo3997a = wn8Var2.mo3997a(f2);
                } catch (CancellationException unused) {
                    c3838zm2.m25698a();
                }
                vi3Var2.invoke(Float.valueOf(fMo3997a));
                if (Math.abs(f2 - fMo3997a) > 0.5f || fM927d2 != ((Number) ((xc9) c3838zm2.f71729e).getValue()).floatValue()) {
                    c3838zm2.m25698a();
                }
                ref$FloatRef.f47715a += fMo3997a;
                break;
            default:
                C0809bg c0809bg = (C0809bg) obj3;
                Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) obj2;
                C3838zm c3838zm3 = (C3838zm) obj;
                xc9 xc9Var2 = (xc9) c3838zm3.f71729e;
                if ((((Number) xc9Var2.getValue()).floatValue() < f && ref$FloatRef.f47715a > f) || (((Number) xc9Var2.getValue()).floatValue() > f && ref$FloatRef.f47715a < f)) {
                    float fFloatValue = ((Number) xc9Var2.getValue()).floatValue();
                    if (f == 0.0f) {
                        f = 0.0f;
                    } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
                        f = fFloatValue;
                    }
                    c0809bg.m3692a(f, ((Number) c3838zm3.m25699b()).floatValue());
                    ref$FloatRef2.f47715a = Float.isNaN(((Number) c3838zm3.m25699b()).floatValue()) ? 0.0f : ((Number) c3838zm3.m25699b()).floatValue();
                    ref$FloatRef.f47715a = f;
                    c3838zm3.m25698a();
                } else {
                    c0809bg.m3692a(((Number) xc9Var2.getValue()).floatValue(), ((Number) c3838zm3.m25699b()).floatValue());
                    ref$FloatRef2.f47715a = ((Number) c3838zm3.m25699b()).floatValue();
                    ref$FloatRef.f47715a = ((Number) xc9Var2.getValue()).floatValue();
                }
                break;
        }
        return xfaVar;
    }
}
