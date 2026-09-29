package com.lingq.feature.chat;

import com.lingq.core.datastore.C1368a;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.fa4;
import p000.si7;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$32", m4291f = "ChatViewModel.kt", m4292l = {801}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$32 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24888a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f24890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$32(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24890c = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$32 chatViewModel$32 = new ChatViewModel$32(this.f24890c, continuation);
        chatViewModel$32.f24889b = obj;
        return chatViewModel$32;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$32) create((String) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        v94 v94Var;
        Object next;
        ChatMode chatMode;
        C2009m c2009m = this.f24890c;
        cma cmaVar = c2009m.f25273M;
        String str = (String) this.f24889b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24888a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if ((fa4.m11650l(str, ChatMode.Plus.getServerId()) || fa4.m11650l(str, ChatMode.Tutor.getServerId())) && !cmaVar.mo4588a0() && !cmaVar.mo4592m0()) {
                si7 si7Var = c2009m.f25272L;
                String serverId = ChatMode.Standard.getServerId();
                this.f24889b = str;
                this.f24888a = 1;
                if (((C1368a) si7Var).m7901r(serverId, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c2009m.f25281U;
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
            ChatMode.Companion.getClass();
            str.getClass();
            Iterator<E> it = ChatMode.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((ChatMode) next).getServerId(), str));
            chatMode = (ChatMode) next;
            if (chatMode == null) {
                chatMode = ChatMode.Standard;
            }
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, chatMode, null, null, false, null, false, null, null, null, -1, 1021)));
        return xfa.f68157a;
    }
}
