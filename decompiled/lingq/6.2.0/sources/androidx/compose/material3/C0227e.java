package androidx.compose.material3;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.snapping.C0112a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.a62;
import p000.fb2;
import p000.hta;
import p000.l70;
import p000.ng0;
import p000.ui3;
import p000.wn8;
import p000.x63;

/* JADX INFO: renamed from: androidx.compose.material3.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0227e implements x63 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hta f3395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f3396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fb2 f3397c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0112a f3398d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f3399e;

    public C0227e(hta htaVar, C0269z c0269z, fb2 fb2Var, C0112a c0112a, ui3 ui3Var) {
        this.f3395a = htaVar;
        this.f3396b = c0269z;
        this.f3397c = fb2Var;
        this.f3398d = c0112a;
        this.f3399e = ui3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p000.x63
    /* JADX INFO: renamed from: a */
    public final Object mo862a(wn8 wn8Var, float f, Continuation continuation) throws Throwable {
        C0208xe15114e2 c0208xe15114e2;
        C0269z c0269z = this.f3396b;
        C0097e c0097e = c0269z.f3651e;
        if (continuation instanceof C0208xe15114e2) {
            c0208xe15114e2 = (C0208xe15114e2) continuation;
            int i = c0208xe15114e2.f3134c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0208xe15114e2.f3134c = i - Integer.MIN_VALUE;
            } else {
                c0208xe15114e2 = new C0208xe15114e2(this, (ContinuationImpl) continuation);
            }
        } else {
            c0208xe15114e2 = new C0208xe15114e2(this, (ContinuationImpl) continuation);
        }
        Object objMo862a = c0208xe15114e2.f3132a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0208xe15114e2.f3134c;
        ui3 ui3Var = this.f3399e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objMo862a);
                float fMo13459e = this.f3395a.mo13459e();
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float fM15944g = l70.m15944g(f, -fMo13459e, fMo13459e);
                ref$FloatRef.f47715a = fM15944g;
                if (fM15944g > 0.0f) {
                    a62 a62VarM849c = c0097e.m849c();
                    SheetValue sheetValue = SheetValue.Hidden;
                    if (a62VarM849c.m130c(sheetValue)) {
                        float fMax = Math.max(0.0f, c0097e.m849c().m133f(sheetValue) - c0097e.m852f());
                        float f2 = ng0.f52698e;
                        fb2 fb2Var = this.f3397c;
                        float fMo912g0 = fb2Var.mo912g0(f2);
                        if (fMax < fMo912g0) {
                            ref$FloatRef.f47715a *= fMax / fMo912g0;
                            float fMo912g1 = fb2Var.mo912g0(ng0.f52697d);
                            if (f >= fMo912g1) {
                                ref$FloatRef.f47715a = Math.max(ref$FloatRef.f47715a, fMo912g1);
                            }
                        }
                    }
                }
                C0112a c0112a = this.f3398d;
                float f3 = ref$FloatRef.f47715a;
                c0208xe15114e2.f3134c = 1;
                objMo862a = c0112a.mo862a(wn8Var, f3, c0208xe15114e2);
                if (objMo862a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objMo862a);
            }
            float fFloatValue = ((Number) objMo862a).floatValue();
            if (!c0269z.m1217e()) {
                ui3Var.mo0a();
            }
            return new Float(fFloatValue);
        } catch (Throwable th) {
            if (!c0269z.m1217e()) {
                ui3Var.mo0a();
            }
            throw th;
        }
    }
}
