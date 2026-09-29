package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.nn5;
import p000.un1;
import p000.v94;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.z13;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$fetchLynxModelConfig$1", m4291f = "ChatViewModel.kt", m4292l = {904}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$fetchLynxModelConfig$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$fetchLynxModelConfig$1(C2009m c2009m, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f24935b = c2009m;
        this.f24936c = str;
        this.f24937d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$fetchLynxModelConfig$1(this.f24935b, this.f24936c, this.f24937d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$fetchLynxModelConfig$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7164n;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24934a;
        C2009m c2009m = this.f24935b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            z13 z13Var = c2009m.f25265E;
            this.f24934a = 1;
            objM7164n = ((C1289e) z13Var.f70745a).m7164n(this.f24937d, this.f24936c, this);
            if (objM7164n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7164n = obj;
        }
        ym5 ym5Var = (ym5) objM7164n;
        if (ym5Var instanceof xm5) {
            C3244l c3244l = c2009m.f25281U;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, (nn5) ((xm5) ym5Var).f68348a, false, null, null, null, -1, 991)));
        }
        return xfa.f68157a;
    }
}
