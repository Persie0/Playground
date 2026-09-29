package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.cma;
import p000.cy9;
import p000.lda;
import p000.m83;
import p000.u91;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeTokensData$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeTokensData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeTokensData$1(C2009m c2009m, String str, Continuation continuation) {
        super(2, continuation);
        this.f24988b = c2009m;
        this.f24989c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeTokensData$1 chatViewModel$observeTokensData$1 = new ChatViewModel$observeTokensData$1(this.f24988b, this.f24989c, continuation);
        chatViewModel$observeTokensData$1.f24987a = obj;
        return chatViewModel$observeTokensData$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observeTokensData$1 chatViewModel$observeTokensData$1 = (ChatViewModel$observeTokensData$1) create((Map) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeTokensData$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map = (Map) this.f24987a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2009m c2009m = this.f24988b;
        cma cmaVar = c2009m.f25273M;
        C3244l c3244l = c2009m.f25281U;
        C3244l c3244l2 = c2009m.f25282V;
        do {
            value = c3244l2.getValue();
        } while (!c3244l2.m15570h(value, map));
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            u91.m22630w0(((cy9) ((Map.Entry) it.next()).getValue()).f34713b, arrayList);
        }
        String strMo4589b2 = ((v94) c3244l.getValue()).f65073u;
        if (strMo4589b2.length() == 0) {
            strMo4589b2 = cmaVar.mo4589b2();
        }
        AbstractC1263a.m7050e(new m83(c2009m.f25300m.m8210a(strMo4589b2, arrayList), new ChatViewModel$observeCards$1(c2009m, null), 2), lda.m16103C(c2009m), "cardsForTokens");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            u91.m22630w0(((cy9) ((Map.Entry) it2.next()).getValue()).f34713b, arrayList2);
        }
        String strMo4589b3 = ((v94) c3244l.getValue()).f65073u;
        if (strMo4589b3.length() == 0) {
            strMo4589b3 = cmaVar.mo4589b2();
        }
        AbstractC1263a.m7050e(new m83(c2009m.f25301n.m8222a(strMo4589b3, arrayList2), new ChatViewModel$observeWords$1(c2009m, null), 2), lda.m16103C(c2009m), "wordsForTokens");
        AbstractC1263a.m7050e(new m83(c2009m.f25296i.m8800a(this.f24989c, map), new ChatViewModel$observePhrases$1(c2009m, null), 2), lda.m16103C(c2009m), "phrases");
        return xfa.f68157a;
    }
}
