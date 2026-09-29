package androidx.compose.foundation.gestures.snapping;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.AbstractC3489q9;
import p000.C0817bn;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.f32;
import p000.hc9;
import p000.l54;
import p000.r46;
import p000.un1;
import p000.vi3;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m4291f = "SnapFlingBehavior.kt", m4292l = {134, 150}, m4293m = "invokeSuspend", m4294v = 1)
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f2320a;

    /* JADX INFO: renamed from: b */
    public int f2321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0112a f2322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f2323d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f2324e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wn8 f2325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(C0112a c0112a, float f, vi3 vi3Var, wn8 wn8Var, Continuation continuation) {
        super(2, continuation);
        this.f2322c = c0112a;
        this.f2323d = f;
        this.f2324e = vi3Var;
        this.f2325f = wn8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.f2322c, this.f2323d, this.f2324e, this.f2325f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapFlingBehavior$fling$result$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ec9] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final Ref$FloatRef ref$FloatRef;
        Object objM921b;
        C0112a c0112a = this.f2322c;
        hc9 hc9Var = c0112a.f2343a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2321b;
        final int i2 = 1;
        final vi3 vi3Var = this.f2324e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            f32 f32Var = c0112a.f2344b;
            float f = this.f2323d;
            float fMo12102d = hc9Var.mo12102d(f, AbstractC3489q9.m19777g(f32Var, 0.0f, f));
            if (Float.isNaN(fMo12102d)) {
                l54.m15816c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ref$FloatRef = new Ref$FloatRef();
            float fSignum = Math.signum(f) * Math.abs(fMo12102d);
            ref$FloatRef.f47715a = fSignum;
            vi3Var.invoke(new Float(fSignum));
            float f2 = ref$FloatRef.f47715a;
            final int i3 = 0;
            ?? r4 = new vi3() { // from class: ec9
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    int i4 = i3;
                    xfa xfaVar = xfa.f68157a;
                    vi3 vi3Var2 = vi3Var;
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (i4) {
                        case 0:
                            float f3 = ref$FloatRef2.f47715a - fFloatValue;
                            ref$FloatRef2.f47715a = f3;
                            vi3Var2.invoke(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = ref$FloatRef2.f47715a - fFloatValue;
                            ref$FloatRef2.f47715a = f4;
                            vi3Var2.invoke(Float.valueOf(f4));
                            break;
                    }
                    return xfaVar;
                }
            };
            this.f2320a = ref$FloatRef;
            this.f2321b = 1;
            objM921b = C0112a.m921b(c0112a, this.f2325f, f2, this.f2323d, r4, this);
            if (objM921b != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$FloatRef ref$FloatRef2 = this.f2320a;
        AbstractC3193b.m15359b(obj);
        ref$FloatRef = ref$FloatRef2;
        objM921b = obj;
        C0817bn c0817bn = (C0817bn) objM921b;
        float fMo12103e = hc9Var.mo12103e(((Number) c0817bn.m3884c()).floatValue());
        if (Float.isNaN(fMo12103e)) {
            l54.m15816c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.f47715a = fMo12103e;
        C0817bn c0817bnM20392r = r46.m20392r(c0817bn, 0.0f, 0.0f, 30);
        InterfaceC0025an interfaceC0025an = c0112a.f2345c;
        vi3 vi3Var2 = new vi3() { // from class: ec9
            @Override // p000.vi3
            public final Object invoke(Object obj2) {
                int i4 = i2;
                xfa xfaVar = xfa.f68157a;
                vi3 vi3Var3 = vi3Var;
                Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        float f3 = ref$FloatRef3.f47715a - fFloatValue;
                        ref$FloatRef3.f47715a = f3;
                        vi3Var3.invoke(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = ref$FloatRef3.f47715a - fFloatValue;
                        ref$FloatRef3.f47715a = f4;
                        vi3Var3.invoke(Float.valueOf(f4));
                        break;
                }
                return xfaVar;
            }
        };
        this.f2320a = null;
        this.f2321b = 2;
        Object objM925b = AbstractC0113b.m925b(this.f2325f, fMo12103e, fMo12103e, c0817bnM20392r, interfaceC0025an, vi3Var2, this);
        return objM925b == coroutineSingletons ? coroutineSingletons : objM925b;
    }
}
