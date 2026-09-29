package com.lingq.feature.chat;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.lazy.C0127b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b34;
import p000.c32;
import p000.tf4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$FollowConversationEnd$2$1", m4291f = "ChatSessionScreen.kt", m4292l = {383, 385}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$FollowConversationEnd$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24832a;

    /* JADX INFO: renamed from: b */
    public int f24833b;

    /* JADX INFO: renamed from: c */
    public int f24834c;

    /* JADX INFO: renamed from: d */
    public C0127b f24835d;

    /* JADX INFO: renamed from: e */
    public int f24836e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f24837f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f24838g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0127b f24839h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f24840i;

    /* JADX INFO: renamed from: com.lingq.feature.chat.ChatSessionScreenKt$FollowConversationEnd$2$1$1 */
    @c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$FollowConversationEnd$2$1$1", m4291f = "ChatSessionScreen.kt", m4292l = {383}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19871 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24841a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0127b f24842b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f24843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19871(C0127b c0127b, int i, Continuation continuation) {
            super(2, continuation);
            this.f24842b = c0127b;
            this.f24843c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19871(this.f24842b, this.f24843c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19871) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24841a;
            if (i != 0 && i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            do {
                this.f24841a = 1;
            } while (ChatSessionScreenKt$FollowConversationEnd$2$1.m8856g(this.f24842b, this.f24843c, this) != coroutineSingletons);
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$FollowConversationEnd$2$1(boolean z, boolean z2, C0127b c0127b, int i, Continuation continuation) {
        super(2, continuation);
        this.f24837f = z;
        this.f24838g = z2;
        this.f24839h = c0127b;
        this.f24840i = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m8856g(C0127b c0127b, int i, ContinuationImpl continuationImpl) throws Throwable {
        ChatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1 chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1;
        C0127b c0127b2;
        int i2;
        if (continuationImpl instanceof ChatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) {
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1 = (ChatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) continuationImpl;
            int i3 = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d = i3 - Integer.MIN_VALUE;
            } else {
                chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1 = new ChatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1(continuationImpl);
            }
        } else {
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1 = new ChatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1(continuationImpl);
        }
        Object obj = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24846c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            tf4 tf4Var = new tf4(29);
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a = c0127b;
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b = i;
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d = 1;
            if (b34.m3250q(chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.getContext()).mo1250e(tf4Var, chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) != coroutineSingletons) {
            }
        }
        if (i4 == 1) {
            i = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b;
            c0127b = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b;
            c0127b2 = chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a;
            AbstractC3193b.m15359b(obj);
        }
        chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a = null;
        chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b = i2;
        chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d = 3;
        return AbstractC0095c.m837l(c0127b2, 100000.0f, chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
        if (c0127b.mo975d()) {
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a = c0127b;
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b = i;
            chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d = 2;
            if (C0127b.m973l(c0127b, i, chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) != coroutineSingletons) {
                int i5 = i;
                c0127b2 = c0127b;
                i2 = i5;
                chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24844a = null;
                chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24845b = i2;
                chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1.f24847d = 3;
                if (AbstractC0095c.m837l(c0127b2, 100000.0f, chatSessionScreenKt$FollowConversationEnd$2$1$holdAtEnd$1) == coroutineSingletons) {
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$FollowConversationEnd$2$1(this.f24837f, this.f24838g, this.f24839h, this.f24840i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$FollowConversationEnd$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15447n(15000, r9, r8) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (m8856g(r4, r9, r8) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:23:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f24836e;
        int i5 = this.f24840i;
        C0127b c0127b = this.f24839h;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f24837f) {
                if (this.f24838g) {
                    C19871 c19871 = new C19871(c0127b, i5, null);
                    this.f24836e = 1;
                }
            }
            return xfa.f68157a;
        }
        if (i4 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f24834c;
            int i6 = this.f24833b;
            i3 = this.f24832a;
            c0127b = this.f24835d;
            AbstractC3193b.m15359b(obj);
            i2 = i6;
        }
        i++;
        if (i < i3) {
            this.f24835d = c0127b;
            this.f24832a = i3;
            this.f24833b = i2;
            this.f24834c = i;
            this.f24836e = 2;
        }
        return xfa.f68157a;
        i = 0;
        i2 = i5;
        i3 = 40;
        if (i < i3) {
            this.f24835d = c0127b;
            this.f24832a = i3;
            this.f24833b = i2;
            this.f24834c = i;
            this.f24836e = 2;
        }
        return xfa.f68157a;
    }
}
