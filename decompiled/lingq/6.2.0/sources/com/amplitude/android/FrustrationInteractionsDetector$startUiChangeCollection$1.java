package com.amplitude.android;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.a18;
import p000.c32;
import p000.g9a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.FrustrationInteractionsDetector$startUiChangeCollection$1", m4291f = "FrustrationInteractionsDetector.kt", m4292l = {217}, m4293m = "invokeSuspend")
final class FrustrationInteractionsDetector$startUiChangeCollection$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0881c f10758b;

    /* JADX INFO: renamed from: com.amplitude.android.FrustrationInteractionsDetector$startUiChangeCollection$1$1 */
    @c32(m4290c = "com.amplitude.android.FrustrationInteractionsDetector$startUiChangeCollection$1$1", m4291f = "FrustrationInteractionsDetector.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C08781 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f10759a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0881c f10760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08781(C0881c c0881c, Continuation continuation) {
            super(2, continuation);
            this.f10760b = c0881c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C08781 c08781 = new C08781(this.f10760b, continuation);
            c08781.f10759a = obj;
            return c08781;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            g9a.m12435l(obj);
            C08781 c08781 = (C08781) create(null, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c08781.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            g9a.m12435l(this.f10759a);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrustrationInteractionsDetector$startUiChangeCollection$1(C0881c c0881c, Continuation continuation) {
        super(2, continuation);
        this.f10758b = c0881c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FrustrationInteractionsDetector$startUiChangeCollection$1(this.f10758b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FrustrationInteractionsDetector$startUiChangeCollection$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10757a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0881c c0881c = this.f10758b;
            c0881c.f10811b.mo16256b("Starting UI change signal collection for dead click detection");
            a18 a18Var = c0881c.f10810a.f11032q;
            C08781 c08781 = new C08781(c0881c, null);
            this.f10757a = 1;
            if (AbstractC3224d.m15529h(a18Var, c08781, this) == coroutineSingletons) {
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
