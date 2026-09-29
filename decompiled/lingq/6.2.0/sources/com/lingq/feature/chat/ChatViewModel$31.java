package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.a23;
import p000.c32;
import p000.hz0;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$31", m4291f = "ChatViewModel.kt", m4292l = {795}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$31 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24885a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f24887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$31(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24887c = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$31 chatViewModel$31 = new ChatViewModel$31(this.f24887c, continuation);
        chatViewModel$31.f24886b = obj;
        return chatViewModel$31;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$31) create((hz0) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7151a;
        hz0 hz0Var = (hz0) this.f24886b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24885a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        a23 a23Var = this.f24887c.f25306s;
        String str = hz0Var.f43230a;
        int i2 = hz0Var.f43231b;
        this.f24886b = null;
        this.f24885a = 1;
        a23Var.getClass();
        if (vk9.m23391n0(str) || i2 <= 0 || (objM7151a = ((C1289e) a23Var.f90a).m7151a(i2, str, this)) != coroutineSingletons) {
            objM7151a = xfaVar;
        }
        return objM7151a == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
