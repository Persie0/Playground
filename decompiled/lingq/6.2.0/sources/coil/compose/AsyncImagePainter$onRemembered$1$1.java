package coil.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.AbstractC0278f;
import coil.C0855a;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3276kw;
import p000.C3350mw;
import p000.C3386nv;
import p000.C3438ow;
import p000.C3757xf;
import p000.ba2;
import p000.c32;
import p000.d04;
import p000.e04;
import p000.f04;
import p000.fa4;
import p000.gm5;
import p000.hi8;
import p000.hl1;
import p000.hn9;
import p000.jl1;
import p000.kna;
import p000.kt2;
import p000.m58;
import p000.q18;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.compose.AsyncImagePainter$onRemembered$1$1", m4291f = "AsyncImagePainter.kt", m4292l = {308}, m4293m = "invokeSuspend")
final class AsyncImagePainter$onRemembered$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0858a f10414b;

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$2 */
    @c32(m4290c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", m4291f = "AsyncImagePainter.kt", m4292l = {307}, m4293m = "invokeSuspend")
    final class C08562 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f10415a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f10416b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0858a f10417c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08562(C0858a c0858a, Continuation continuation) {
            super(2, continuation);
            this.f10417c = c0858a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C08562 c08562 = new C08562(this.f10417c, continuation);
            c08562.f10416b = obj;
            return c08562;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C08562) create((e04) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C0858a c0858a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f10415a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                e04 e04Var = (e04) this.f10416b;
                C0858a c0858a2 = this.f10417c;
                C0855a c0855a = (C0855a) ((xc9) c0858a2.f10431N).getValue();
                d04 d04VarM10778a = e04.m10778a(e04Var);
                d04VarM10778a.f34779d = new m58(c0858a2, 9);
                d04VarM10778a.m9961b();
                ba2 ba2Var = e04Var.f36527z;
                if (ba2Var.f8213a == null) {
                    d04VarM10778a.f34791p = new hi8(c0858a2, 3);
                    d04VarM10778a.m9961b();
                }
                if (ba2Var.f8214b == null) {
                    jl1 jl1Var = c0858a2.f10426I;
                    q18 q18Var = kna.f47564b;
                    d04VarM10778a.f34792q = (fa4.m11650l(jl1Var, hl1.f42565b) || fa4.m11650l(jl1Var, hl1.f42568e)) ? Scale.FIT : Scale.FILL;
                }
                if (ba2Var.f8216d != Precision.EXACT) {
                    d04VarM10778a.f34780e = Precision.INEXACT;
                }
                e04 e04VarM9960a = d04VarM10778a.m9960a();
                this.f10416b = c0858a2;
                this.f10415a = 1;
                obj = c0855a.m4952c(e04VarM9960a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0858a = c0858a2;
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0858a = (C0858a) this.f10416b;
                AbstractC3193b.m15359b(obj);
            }
            f04 f04Var = (f04) obj;
            c0858a.getClass();
            if (f04Var instanceof hn9) {
                hn9 hn9Var = (hn9) f04Var;
                return new C3350mw(c0858a.m4953k(hn9Var.f42663a), hn9Var);
            }
            if (!(f04Var instanceof kt2)) {
                gm5.m12750e();
                return null;
            }
            kt2 kt2Var = (kt2) f04Var;
            Drawable drawable = kt2Var.f48405a;
            return new C3276kw(drawable != null ? c0858a.m4953k(drawable) : null, kt2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1$1(C0858a c0858a, Continuation continuation) {
        super(2, continuation);
        this.f10414b = c0858a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$onRemembered$1$1(this.f10414b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncImagePainter$onRemembered$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10413a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0858a c0858a = this.f10414b;
            C3235e c3235eM15546y = AbstractC3224d.m15546y(AbstractC0278f.m1264n(new C3757xf(c0858a, 3)), new C08562(c0858a, null));
            C3438ow c3438ow = new C3438ow(c0858a, 0);
            this.f10413a = 1;
            if (c3235eM15546y.collect(c3438ow, this) == coroutineSingletons) {
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
