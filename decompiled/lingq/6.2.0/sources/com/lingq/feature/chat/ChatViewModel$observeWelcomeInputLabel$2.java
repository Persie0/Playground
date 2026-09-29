package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.qn3;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeWelcomeInputLabel$2", m4291f = "ChatViewModel.kt", m4292l = {1229}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeWelcomeInputLabel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeWelcomeInputLabel$2(C2009m c2009m, String str, Continuation continuation) {
        super(2, continuation);
        this.f24997b = c2009m;
        this.f24998c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$observeWelcomeInputLabel$2(this.f24997b, this.f24998c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$observeWelcomeInputLabel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24996a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            qn3 qn3Var = this.f24997b.f25269I;
            this.f24996a = 1;
            Object objM7156f = ((C1289e) ((zw0) qn3Var.f57974a)).m7156f(this.f24998c, this);
            if (objM7156f != coroutineSingletons) {
                objM7156f = xfaVar;
            }
            if (objM7156f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
