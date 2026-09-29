package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c32;
import p000.cma;
import p000.lda;
import p000.m83;
import p000.v91;
import p000.vj6;
import p000.vk9;
import p000.vz1;
import p000.w3a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$18", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$18 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24862a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$18(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24863b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$18 chatViewModel$18 = new ChatViewModel$18(this.f24863b, continuation);
        chatViewModel$18.f24862a = obj;
        return chatViewModel$18;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$18 chatViewModel$18 = (ChatViewModel$18) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$18.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair = (Pair) this.f24862a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Map map = (Map) pair.f47623a;
        List list = (List) pair.f47624b;
        C2009m c2009m = this.f24863b;
        cma cmaVar = c2009m.f25273M;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            xfa xfaVar = xfa.f68157a;
            if (!zHasNext) {
                return xfaVar;
            }
            ChatPhrase chatPhrase = (ChatPhrase) it.next();
            String str = chatPhrase.f18937a;
            String str2 = chatPhrase.f18937a;
            String str3 = (String) map.get(vz1.m23609O(str, cmaVar.mo4589b2()));
            if ((str3 == null || vk9.m23391n0(str3)) && vk9.m23391n0(chatPhrase.f18938b)) {
                vj6 vj6Var = c2009m.f25309v;
                String strMo4589b2 = cmaVar.mo4589b2();
                String strMo4580K1 = cmaVar.mo4580K1();
                String strM23609O = vz1.m23609O(str2, cmaVar.mo4589b2());
                vj6Var.getClass();
                strMo4589b2.getClass();
                strMo4580K1.getClass();
                AbstractC1263a.m7050e(new m83(AbstractC3224d.m15536o(((C1306v) ((w3a) vj6Var.f65506b)).m7383i(strMo4589b2, strMo4580K1, strM23609O)), new ChatViewModel$observeChatPhrasesTranslations$1$1(c2009m, chatPhrase, null), 2), lda.m16103C(c2009m), str2);
            }
            arrayList.add(xfaVar);
        }
    }
}
