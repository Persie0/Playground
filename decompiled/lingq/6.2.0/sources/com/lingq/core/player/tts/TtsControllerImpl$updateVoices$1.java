package com.lingq.core.player.tts;

import com.lingq.core.data.repository.C1307w;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$updateVoices$1", m4291f = "TtsController.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$updateVoices$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$updateVoices$1(C1819c c1819c, Continuation continuation) {
        super(2, continuation);
        this.f22157b = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$updateVoices$1(this.f22157b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$updateVoices$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22156a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1819c c1819c = this.f22157b;
                C1307w c1307w = c1819c.f22167e;
                String strMo4589b2 = c1819c.f22170h.mo4589b2();
                this.f22156a = 1;
                if (c1307w.m7407v(strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str = "TTS updateVoices: Error - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
        }
        return xfa.f68157a;
    }
}
