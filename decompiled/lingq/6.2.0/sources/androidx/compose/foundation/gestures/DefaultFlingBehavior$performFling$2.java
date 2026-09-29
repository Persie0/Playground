package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0063e;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C0817bn;
import p000.C3386nv;
import p000.bb0;
import p000.c32;
import p000.f32;
import p000.r46;
import p000.un1;
import p000.wn8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m4291f = "Scrollable.kt", m4292l = {1070}, m4293m = "invokeSuspend", m4294v = 1)
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f1858a;

    /* JADX INFO: renamed from: b */
    public C0817bn f1859b;

    /* JADX INFO: renamed from: c */
    public int f1860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f1861d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0100h f1862e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wn8 f1863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, C0100h c0100h, wn8 wn8Var, Continuation continuation) {
        super(2, continuation);
        this.f1861d = f;
        this.f1862e = c0100h;
        this.f1863f = wn8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultFlingBehavior$performFling$2(this.f1861d, this.f1862e, this.f1863f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        C0817bn c0817bn;
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1860c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            f = this.f1861d;
            if (Math.abs(f) > 1.0f) {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.f47715a = f;
                Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                C0817bn c0817bnM20376a = r46.m20376a(0.0f, f, 28);
                try {
                    C0100h c0100h = this.f1862e;
                    f32 f32Var = c0100h.f2258a;
                    bb0 bb0Var = new bb0(ref$FloatRef3, this.f1863f, ref$FloatRef2, c0100h);
                    this.f1858a = ref$FloatRef2;
                    this.f1859b = c0817bnM20376a;
                    this.f1860c = 1;
                    if (AbstractC0063e.m757d(c0817bnM20376a, f32Var, false, bb0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$FloatRef = ref$FloatRef2;
                    f = ref$FloatRef.f47715a;
                } catch (CancellationException unused) {
                    c0817bn = c0817bnM20376a;
                    ref$FloatRef = ref$FloatRef2;
                    ref$FloatRef.f47715a = ((Number) c0817bn.m3884c()).floatValue();
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0817bn = this.f1859b;
            ref$FloatRef = this.f1858a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.f47715a = ((Number) c0817bn.m3884c()).floatValue();
            }
            f = ref$FloatRef.f47715a;
        }
        return new Float(f);
    }
}
