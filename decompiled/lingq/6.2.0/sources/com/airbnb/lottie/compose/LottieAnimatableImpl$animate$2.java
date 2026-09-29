package com.airbnb.lottie.compose;

import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.cl5;
import p000.gl5;
import p000.kn1;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.wl6;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", m4291f = "LottieAnimatable.kt", m4292l = {269}, m4293m = "invokeSuspend")
final class LottieAnimatableImpl$animate$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f10649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0872b f10650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10651c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f10652d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gl5 f10653e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f10654f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LottieCancellationBehavior f10655g;

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1 */
    @c32(m4290c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", m4291f = "LottieAnimatable.kt", m4292l = {277}, m4293m = "invokeSuspend")
    final class C08701 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f10656a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LottieCancellationBehavior f10657b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cd4 f10658c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f10659d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C0872b f10660e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08701(LottieCancellationBehavior lottieCancellationBehavior, cd4 cd4Var, int i, C0872b c0872b, Continuation continuation) {
            super(2, continuation);
            this.f10657b = lottieCancellationBehavior;
            this.f10658c = cd4Var;
            this.f10659d = i;
            this.f10660e = c0872b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C08701(this.f10657b, this.f10658c, this.f10659d, this.f10660e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C08701) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:17:0x003b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0045  */
        /* JADX WARN: Code duplicated, block: B:20:0x0058 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0061  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.f10656a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                kotlin.AbstractC3193b.m15359b(r5)
                goto L59
            Ld:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                p000.C3386nv.m17633t(r4)
                r4 = 0
                return r4
            L14:
                kotlin.AbstractC3193b.m15359b(r5)
            L17:
                int[] r5 = p000.bl5.f8660a
                com.airbnb.lottie.compose.LottieCancellationBehavior r1 = r4.f10657b
                int r1 = r1.ordinal()
                r5 = r5[r1]
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r2) goto L2e
                cd4 r5 = r4.f10658c
                boolean r5 = r5.mo4538b()
                if (r5 == 0) goto L30
            L2e:
                r5 = r1
                goto L32
            L30:
                int r5 = r4.f10659d
            L32:
                r4.f10656a = r2
                com.airbnb.lottie.compose.b r3 = r4.f10660e
                r3.getClass()
                if (r5 != r1) goto L45
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2 r1 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                r1.<init>()
                java.lang.Object r5 = p000.fa4.m11637K(r1, r4)
                goto L56
            L45:
                com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3 r1 = new com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
                r1.<init>()
                kn1 r5 = r4.getContext()
                t16 r5 = p000.b34.m3250q(r5)
                java.lang.Object r5 = r5.mo1250e(r1, r4)
            L56:
                if (r5 != r0) goto L59
                return r0
            L59:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L17
                xfa r4 = p000.xfa.f68157a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.C08701.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(C0872b c0872b, int i, float f, gl5 gl5Var, float f2, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation) {
        super(1, continuation);
        this.f10650b = c0872b;
        this.f10651c = i;
        this.f10652d = f;
        this.f10653e = gl5Var;
        this.f10654f = f2;
        this.f10655g = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieAnimatableImpl$animate$2(this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f, this.f10655g, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kn1 kn1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10649a;
        xfa xfaVar = xfa.f68157a;
        C0872b c0872b = this.f10650b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c0872b.m5030g(this.f10651c);
                ((xc9) c0872b.f10718c).setValue(Integer.MAX_VALUE);
                t66 t66Var = c0872b.f10719d;
                Boolean bool = Boolean.FALSE;
                ((xc9) t66Var).setValue(bool);
                t66 t66Var2 = c0872b.f10721f;
                float f = this.f10652d;
                ((xc9) t66Var2).setValue(Float.valueOf(f));
                ((xc9) c0872b.f10720e).setValue(null);
                xc9 xc9Var = (xc9) c0872b.f10724i;
                gl5 gl5Var = this.f10653e;
                xc9Var.setValue(gl5Var);
                c0872b.m5031h(this.f10654f);
                ((xc9) c0872b.f10722g).setValue(bool);
                ((xc9) c0872b.f10727l).setValue(Long.MIN_VALUE);
                if (gl5Var == null) {
                    C0872b.m5027d(c0872b, false);
                    return xfaVar;
                }
                if (Float.isInfinite(f)) {
                    c0872b.m5031h(c0872b.m5028e());
                    C0872b.m5027d(c0872b, false);
                    c0872b.m5030g(Integer.MAX_VALUE);
                    return xfaVar;
                }
                C0872b.m5027d(c0872b, true);
                int i2 = cl5.f10228a[this.f10655g.ordinal()];
                if (i2 == 1) {
                    kn1Var = wl6.f67013b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kn1Var = EmptyCoroutineContext.f47685a;
                }
                C08701 c08701 = new C08701(this.f10655g, AbstractC3208a.m15441h(getContext()), this.f10651c, this.f10650b, null);
                this.f10649a = 1;
                if (wfb.m23905G(c08701, kn1Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            AbstractC3208a.m15439f(getContext());
            C0872b.m5027d(c0872b, false);
            return xfaVar;
        } catch (Throwable th) {
            C0872b.m5027d(c0872b, false);
            throw th;
        }
    }
}
