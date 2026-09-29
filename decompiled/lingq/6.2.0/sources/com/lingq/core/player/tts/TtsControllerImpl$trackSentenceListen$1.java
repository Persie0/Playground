package com.lingq.core.player.tts;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$DoubleRef;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$trackSentenceListen$1", m4291f = "TtsController.kt", m4292l = {604}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$trackSentenceListen$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22153b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f22154c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$DoubleRef f22155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$trackSentenceListen$1(C1819c c1819c, int i, Ref$DoubleRef ref$DoubleRef, Continuation continuation) {
        super(2, continuation);
        this.f22153b = c1819c;
        this.f22154c = i;
        this.f22155d = ref$DoubleRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$trackSentenceListen$1(this.f22153b, this.f22154c, this.f22155d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$trackSentenceListen$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22152a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1819c c1819c = this.f22153b;
            d65 d65Var = c1819c.f22168f;
            String strMo4589b2 = c1819c.f22170h.mo4589b2();
            double d = this.f22155d.f47714a;
            this.f22152a = 1;
            if (d65.m10120d(d65Var, strMo4589b2, this.f22154c, d, 0.0d, this, 8) == coroutineSingletons) {
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
