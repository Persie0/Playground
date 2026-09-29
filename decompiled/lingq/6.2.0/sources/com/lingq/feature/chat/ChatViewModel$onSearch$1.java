package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$onSearch$1", m4291f = "ChatViewModel.kt", m4292l = {1699}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$onSearch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$onSearch$1(C2009m c2009m, String str, Continuation continuation) {
        super(2, continuation);
        this.f25002b = c2009m;
        this.f25003c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$onSearch$1(this.f25002b, this.f25003c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$onSearch$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25001a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f25001a = 1;
            if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = this.f25002b.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, this.f25003c, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -8388609, 1023)));
        return xfa.f68157a;
    }
}
