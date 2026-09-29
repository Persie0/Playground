package androidx.compose.foundation;

import androidx.compose.animation.core.C0059a;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.c32;
import p000.fda;
import p000.hz4;
import p000.io2;
import p000.j68;
import p000.kk8;
import p000.te1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m4291f = "BasicMarquee.kt", m4292l = {413}, m4293m = "invokeSuspend", m4294v = 1)
final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0125l f1694b;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2 */
    @c32(m4290c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m4291f = "BasicMarquee.kt", m4292l = {427, 429, 433, 433}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00742 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public InterfaceC0025an f1695a;

        /* JADX INFO: renamed from: b */
        public int f1696b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f1697c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0125l f1698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00742(C0125l c0125l, Continuation continuation) {
            super(2, continuation);
            this.f1698d = c0125l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00742 c00742 = new C00742(this.f1698d, continuation);
            c00742.f1697c = obj;
            return c00742;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00742) create((Float) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00be A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Float f;
            InterfaceC0025an interfaceC0025an;
            Object objM744c;
            Float f2;
            C0125l c0125l = this.f1698d;
            C0059a c0059a = c0125l.f2418S;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1696b;
            xfa xfaVar = xfa.f68157a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    f = (Float) this.f1697c;
                    if (f != null) {
                        j68 j68Var = new j68(new fda((int) Math.ceil(f.floatValue() / (Math.abs(te1.m21979L(c0125l).f4327T.mo912g0(c0125l.f2410K)) / 1000.0f)), 1200, io2.f44352d), RepeatMode.Restart, ((-1200) + c0125l.f2409J) * (-1));
                        Float f3 = new Float(0.0f);
                        this.f1697c = f;
                        this.f1695a = j68Var;
                        this.f1696b = 1;
                        if (c0059a.m747f(f3, this) != coroutineSingletons) {
                            interfaceC0025an = j68Var;
                        }
                        return coroutineSingletons;
                    }
                    return xfaVar;
                }
                if (i == 1) {
                    InterfaceC0025an interfaceC0025an2 = this.f1695a;
                    Float f4 = (Float) this.f1697c;
                    AbstractC3193b.m15359b(obj);
                    interfaceC0025an = interfaceC0025an2;
                    f = f4;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            AbstractC3193b.m15359b(obj);
                            return xfaVar;
                        }
                        if (i != 4) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) this.f1697c;
                        AbstractC3193b.m15359b(obj);
                        throw th;
                    }
                    AbstractC3193b.m15359b(obj);
                    objM744c = obj;
                }
                f2 = new Float(0.0f);
                this.f1696b = 3;
                if (c0059a.m747f(f2, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
                C0059a c0059a2 = c0125l.f2418S;
                this.f1697c = null;
                this.f1695a = null;
                this.f1696b = 2;
                objM744c = C0059a.m744c(c0059a2, f, interfaceC0025an, null, this, 12);
                if (objM744c != coroutineSingletons) {
                    f2 = new Float(0.0f);
                    this.f1696b = 3;
                    if (c0059a.m747f(f2, this) != coroutineSingletons) {
                        return xfaVar;
                    }
                }
            } catch (Throwable th2) {
                Float f5 = new Float(0.0f);
                this.f1697c = th2;
                this.f1695a = null;
                this.f1696b = 4;
                if (c0059a.m747f(f5, this) != coroutineSingletons) {
                    throw th2;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(C0125l c0125l, Continuation continuation) {
        super(2, continuation);
        this.f1694b = c0125l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarqueeModifierNode$runAnimation$2(this.f1694b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MarqueeModifierNode$runAnimation$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1693a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0125l c0125l = this.f1694b;
            kk8 kk8VarM1264n = AbstractC0278f.m1264n(new hz4(c0125l, 8));
            C00742 c00742 = new C00742(c0125l, null);
            this.f1693a = 1;
            if (AbstractC3224d.m15529h(kk8VarM1264n, c00742, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
