package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.iv0;
import p000.un1;
import p000.v94;
import p000.wa2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$deleteChat$1", m4291f = "ChatViewModel.kt", m4292l = {1685}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$deleteChat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$deleteChat$1(C2009m c2009m, int i, Continuation continuation) {
        super(2, continuation);
        this.f24932b = c2009m;
        this.f24933c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$deleteChat$1(this.f24932b, this.f24933c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$deleteChat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C2009m c2009m = this.f24932b;
        C3244l c3244l = c2009m.f25281U;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24931a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f24933c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wa2 wa2Var = c2009m.f25307t;
            String strMo4589b2 = c2009m.f25273M.mo4589b2();
            this.f24931a = 1;
            Object objM7152b = ((C1289e) wa2Var.f66560a).m7152b(i2, strMo4589b2, this);
            if (objM7152b != coroutineSingletons) {
                objM7152b = xfaVar;
            }
            if (objM7152b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (((v94) c3244l.getValue()).f65059g == i2) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, new iv0(16383), null, -1, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -81, 1023)));
        }
        return xfaVar;
    }
}
