package com.lingq.feature.chat;

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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$refreshSuggestions$1", m4291f = "ChatViewModel.kt", m4292l = {1260}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$refreshSuggestions$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f25006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$refreshSuggestions$1(C2009m c2009m, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25005b = c2009m;
        this.f25006c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$refreshSuggestions$1(this.f25005b, this.f25006c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$refreshSuggestions$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25004a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25004a = 1;
            if (C2009m.m8916V2(this.f25005b, this.f25006c, this) == coroutineSingletons) {
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
