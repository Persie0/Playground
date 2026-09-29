package com.lingq.feature.chat;

import com.lingq.feature.chat.domain.C1997b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$24", m4291f = "ChatViewModel.kt", m4292l = {713}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$24 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$24(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24874b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$24(this.f24874b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$24) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24873a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2009m c2009m = this.f24874b;
            C1997b c1997b = c2009m.f25276P;
            String strMo4589b2 = c2009m.f25273M.mo4589b2();
            this.f24873a = 1;
            if (c1997b.m8860a(strMo4589b2, this) == coroutineSingletons) {
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
