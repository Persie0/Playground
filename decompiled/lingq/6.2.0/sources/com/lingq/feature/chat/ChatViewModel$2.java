package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1289e;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.dx0;
import p000.lda;
import p000.m83;
import p000.p23;
import p000.u91;
import p000.v94;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$2", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$2(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24866b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$2 chatViewModel$2 = new ChatViewModel$2(this.f24866b, continuation);
        chatViewModel$2.f24865a = obj;
        return chatViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$2 chatViewModel$2 = (ChatViewModel$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2009m c2009m;
        String str;
        List list = (List) this.f24865a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str2 = (String) u91.m22591I0(list);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C2009m c2009m2 = this.f24866b;
        C3244l c3244l = c2009m2.f25281U;
        while (true) {
            Object value = c3244l.getValue();
            c2009m = c2009m2;
            str = str3;
            if (c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, str3, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -2097153, 1023))) {
                break;
            }
            c2009m2 = c2009m;
            str3 = str;
        }
        if (!vk9.m23391n0(str)) {
            p23 p23Var = c2009m.f25268H;
            p23Var.getClass();
            C1289e c1289e = (C1289e) p23Var.f55480a;
            c1289e.getClass();
            AbstractC1263a.m7050e(new m83(AbstractC3224d.m15536o(new dx0(c1289e.f16472f, str, 0)), new ChatViewModel$observeWelcomeInputLabel$1(c2009m, null), 2), lda.m16103C(c2009m), "observeWelcomeInputLabel");
            wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$observeWelcomeInputLabel$2(c2009m, str, null), 3);
        }
        return xfa.f68157a;
    }
}
