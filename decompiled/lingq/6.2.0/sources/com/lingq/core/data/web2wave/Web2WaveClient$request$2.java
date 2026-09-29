package com.lingq.core.data.web2wave;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nn1;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.web2wave.Web2WaveClient$request$2", m4291f = "Web2WaveClient.kt", m4292l = {32}, m4293m = "invokeSuspend", m4294v = 2)
final class Web2WaveClient$request$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f16583a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1312a f16584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f16585c;

    /* JADX INFO: renamed from: com.lingq.core.data.web2wave.Web2WaveClient$request$2$1 */
    @c32(m4290c = "com.lingq.core.data.web2wave.Web2WaveClient$request$2$1", m4291f = "Web2WaveClient.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C13111 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ui3 f16586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13111(ui3 ui3Var, Continuation continuation) {
            super(2, continuation);
            this.f16586a = ui3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C13111(this.f16586a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C13111) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return this.f16586a.mo0a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web2WaveClient$request$2(C1312a c1312a, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f16584b = c1312a;
        this.f16585c = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Web2WaveClient$request$2(this.f16584b, this.f16585c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Web2WaveClient$request$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16583a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        nn1 nn1Var = this.f16584b.f16587a;
        C13111 c13111 = new C13111(this.f16585c, null);
        this.f16583a = 1;
        Object objM23905G = wfb.m23905G(c13111, nn1Var, this);
        return objM23905G == coroutineSingletons ? coroutineSingletons : objM23905G;
    }
}
