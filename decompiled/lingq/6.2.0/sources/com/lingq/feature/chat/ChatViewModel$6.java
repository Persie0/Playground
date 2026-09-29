package com.lingq.feature.chat;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$6", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24909b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$6(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24909b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$6 chatViewModel$6 = new ChatViewModel$6(this.f24909b, continuation);
        chatViewModel$6.f24908a = obj;
        return chatViewModel$6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$6 chatViewModel$6 = (ChatViewModel$6) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$6.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f24908a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (String) pair.f47623a;
        String str2 = (String) pair.f47624b;
        Bundle bundle = new Bundle();
        bundle.putString("chat language", str);
        bundle.putString("dictionary language", str2);
        C2009m c2009m = this.f24909b;
        String str3 = c2009m.f25280T;
        if (str3.length() > 0) {
            bundle.putString("chat screen open location", str3);
        }
        ((C1240a) c2009m.f25278R).m7025f("chat screen opened", bundle);
        c2009m.f25279S.mo8930n2();
        c2009m.m8921Z2(str, str2, "");
        return xfa.f68157a;
    }
}
