package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessage;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.cy9;
import p000.hz0;
import p000.iv0;
import p000.v94;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$29", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$29 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ v94 f24879a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f24880b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Map f24881c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f24882d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ChatViewModel$29 chatViewModel$29 = new ChatViewModel$29(5, (Continuation) obj5);
        chatViewModel$29.f24879a = (v94) obj;
        chatViewModel$29.f24880b = (Map) obj2;
        chatViewModel$29.f24881c = (Map) obj3;
        chatViewModel$29.f24882d = (Map) obj4;
        return chatViewModel$29.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        cy9 cy9Var;
        v94 v94Var = this.f24879a;
        Map map = this.f24880b;
        Map map2 = this.f24881c;
        Map map3 = this.f24882d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = v94Var.f65073u;
        iv0 iv0Var = v94Var.f65057e;
        int i = iv0Var.f44630b;
        List list = iv0Var.f44629a;
        list.getClass();
        map.getClass();
        List<ChatMessage> list2 = list;
        int i2 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (ChatMessage chatMessage : list2) {
                if (chatMessage.m8014b() && (cy9Var = (cy9) map.get(Integer.valueOf(chatMessage.f18920a))) != null && (!cy9Var.f34713b.isEmpty()) && (i2 = i2 + 1) < 0) {
                    vz1.m23626d0();
                    throw null;
                }
            }
        }
        return new hz0(str, i, i2, map2, map3);
    }
}
