package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.nn5;
import p000.ul3;
import p000.un1;
import p000.v94;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$applyLynxModelConfig$2", m4291f = "ChatViewModel.kt", m4292l = {937}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$applyLynxModelConfig$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24922c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24923d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LynxChatModel f24924e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LynxReasoningEffort f24925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$applyLynxModelConfig$2(C2009m c2009m, String str, int i, LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort, Continuation continuation) {
        super(2, continuation);
        this.f24921b = c2009m;
        this.f24922c = str;
        this.f24923d = i;
        this.f24924e = lynxChatModel;
        this.f24925f = lynxReasoningEffort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$applyLynxModelConfig$2(this.f24921b, this.f24922c, this.f24923d, this.f24924e, this.f24925f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$applyLynxModelConfig$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7150A;
        Object value;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24920a;
        C2009m c2009m = this.f24921b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ul3 ul3Var = c2009m.f25266F;
            this.f24920a = 1;
            objM7150A = ((C1289e) ul3Var.f64041a).m7150A(this.f24922c, this.f24923d, this.f24924e, this.f24925f, this);
            if (objM7150A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7150A = obj;
        }
        ym5 ym5Var = (ym5) objM7150A;
        Object nn5Var = new nn5(this.f24924e, this.f24925f);
        ym5Var.getClass();
        xm5 xm5Var = ym5Var instanceof xm5 ? (xm5) ym5Var : null;
        if (xm5Var != null && (obj2 = xm5Var.f68348a) != null) {
            nn5Var = obj2;
        }
        nn5 nn5Var2 = (nn5) nn5Var;
        C3244l c3244l = c2009m.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, nn5Var2, false, null, null, null, -1, 991)));
        return xfa.f68157a;
    }
}
