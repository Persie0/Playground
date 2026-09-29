package com.lingq.feature.chat;

import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.chat.ChatHistory;
import com.lingq.core.domain.model.chat.ChatMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.c32;
import p000.g41;
import p000.iv0;
import p000.lda;
import p000.m83;
import p000.v91;
import p000.v94;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeChatHistory$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeChatHistory$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24957c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeChatHistory$1(C2009m c2009m, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f24956b = c2009m;
        this.f24957c = str;
        this.f24958d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeChatHistory$1 chatViewModel$observeChatHistory$1 = new ChatViewModel$observeChatHistory$1(this.f24956b, this.f24957c, this.f24958d, continuation);
        chatViewModel$observeChatHistory$1.f24955a = obj;
        return chatViewModel$observeChatHistory$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observeChatHistory$1 chatViewModel$observeChatHistory$1 = (ChatViewModel$observeChatHistory$1) create((ChatHistory) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeChatHistory$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [kn1, kotlinx.coroutines.CoroutineStart] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str;
        int i;
        ChatMessage chatMessage;
        int i2;
        Object obj2;
        ChatViewModel$observeChatHistory$1 chatViewModel$observeChatHistory$1 = this;
        C2009m c2009m = chatViewModel$observeChatHistory$1.f24956b;
        C3244l c3244l = c2009m.f25281U;
        ChatHistory chatHistory = (ChatHistory) chatViewModel$observeChatHistory$1.f24955a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (chatHistory != null) {
            List list = chatHistory.f18914i;
            if (list.isEmpty()) {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, true, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -513, 1023)));
            } else {
                while (true) {
                    Object value2 = c3244l.getValue();
                    v94 v94Var = (v94) value2;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((ChatMessage) obj3).m8014b()) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        str = chatViewModel$observeChatHistory$1.f24957c;
                        i = chatViewModel$observeChatHistory$1.f24958d;
                        if (!zHasNext) {
                            break;
                        }
                        ChatMessage chatMessage2 = (ChatMessage) it.next();
                        if (chatMessage2.f18925f.length() == 0) {
                            int i3 = chatMessage2.f18920a;
                            g41 g41VarM16103C = lda.m16103C(c2009m);
                            chatMessage = chatMessage2;
                            i2 = 3;
                            ChatViewModel$fetchTranslationForMessage$1 chatViewModel$fetchTranslationForMessage$1 = new ChatViewModel$fetchTranslationForMessage$1(c2009m, str, i, i3, null);
                            obj2 = null;
                            wfb.m23926u(g41VarM16103C, null, null, chatViewModel$fetchTranslationForMessage$1, 3);
                        } else {
                            chatMessage = chatMessage2;
                            i2 = 3;
                            obj2 = null;
                        }
                        if (chatMessage.f18924e.isEmpty()) {
                            int i4 = chatMessage.f18920a;
                            g41 g41VarM16103C2 = lda.m16103C(c2009m);
                            ?? r12 = obj2;
                            c2009m = c2009m;
                            wfb.m23926u(g41VarM16103C2, r12, r12, new ChatViewModel$fetchPhraseSuggestionsForMessage$1(c2009m, str, i, i4, null), i2);
                        } else {
                            c2009m = c2009m;
                        }
                        List listM23365A0 = vk9.m23365A0(chatMessage.f18923d, new String[]{" "}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : listM23365A0) {
                            if (!vk9.m23391n0((String) obj4)) {
                                arrayList2.add(obj4);
                            }
                        }
                        c2009m.f25279S.mo8922a1(ChatEngagedDataType.WordsRead, new Integer(arrayList2.size()));
                        chatViewModel$observeChatHistory$1 = this;
                        list2 = list2;
                        list = list;
                    }
                    List list3 = list;
                    List<ChatMessage> list4 = list2;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list4) {
                        if (((ChatMessage) obj5).m8014b()) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        AbstractC3393o1.m17749x(((ChatMessage) it2.next()).f18920a, arrayList4);
                    }
                    AbstractC1263a.m7050e(new m83(c2009m.f25261A.m8865c(i, str, arrayList4), new ChatViewModel$observeTranslationForMessage$1(c2009m, null), 2), lda.m16103C(c2009m), "observeTranslationForMessages " + str + " " + i);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : list4) {
                        if (((ChatMessage) obj6).m8014b()) {
                            arrayList5.add(obj6);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        AbstractC3393o1.m17749x(((ChatMessage) it3.next()).f18920a, arrayList6);
                    }
                    AbstractC1263a.m7050e(new m83(c2009m.f25262B.m8865c(i, str, arrayList6), new ChatViewModel$observePhraseSuggestionsForMessage$1(c2009m, null), 2), lda.m16103C(c2009m), "observePhraseSuggestionsForMessages " + str + " " + i);
                    iv0 iv0Var = v94Var.f65057e;
                    Map map = iv0Var.f44639k;
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y(iv0Var.f44640l);
                    for (ChatMessage chatMessage3 : list4) {
                        if (!linkedHashMapM15372Y.containsKey(new Integer(chatMessage3.f18920a))) {
                            linkedHashMapM15372Y.put(new Integer(chatMessage3.f18920a), PhrasesState.Hidden);
                        }
                    }
                    List list5 = chatHistory.f18914i;
                    String str2 = chatHistory.f18907b;
                    String str3 = chatHistory.f18908c;
                    double d = chatHistory.f18909d;
                    String str4 = chatHistory.f18911f;
                    String str5 = chatHistory.f18912g;
                    String str6 = chatHistory.f18913h;
                    iv0 iv0Var2 = v94Var.f65057e;
                    if (c3244l.m15570h(value2, v94.m23191a(v94Var, null, null, false, false, new iv0(list5, i, str2, str3, d, str, str4, str5, str6, list5, map, linkedHashMapM15372Y, iv0Var2.f44641m, iv0Var2.f44642n), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -529, 1023))) {
                        break;
                    }
                    chatViewModel$observeChatHistory$1 = this;
                    list = list3;
                }
            }
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, true, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -513, 1023)));
        }
        return xfa.f68157a;
    }
}
