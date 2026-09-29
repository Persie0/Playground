package com.lingq.feature.chat;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.v94;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$41", m4291f = "ChatViewModel.kt", m4292l = {861}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$41 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$41(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24899b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$41(this.f24899b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$41) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        C2009m c2009m = this.f24899b;
        C3244l c3244l = c2009m.f25281U;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24898a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, v94.m23191a((v94) value2, null, null, false, true, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -9, 1023)));
                this.f24898a = 1;
                if (C2009m.m8916V2(c2009m, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, v94.m23191a((v94) value3, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -9, 1023)));
            return xfa.f68157a;
        } catch (Throwable th) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -9, 1023)));
            throw th;
        }
    }
}
