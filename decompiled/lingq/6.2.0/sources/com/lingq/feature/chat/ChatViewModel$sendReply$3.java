package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatToolTier;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.gm5;
import p000.iv0;
import p000.tw0;
import p000.uw0;
import p000.v94;
import p000.vw0;
import p000.ww0;
import p000.xfa;
import p000.xw0;
import p000.yw0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$sendReply$3", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$sendReply$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$sendReply$3(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f25008b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$sendReply$3 chatViewModel$sendReply$3 = new ChatViewModel$sendReply$3(this.f25008b, continuation);
        chatViewModel$sendReply$3.f25007a = obj;
        return chatViewModel$sendReply$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$sendReply$3 chatViewModel$sendReply$3 = (ChatViewModel$sendReply$3) create((yw0) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$sendReply$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        v94 v94Var;
        Object value2;
        v94 v94Var2;
        Object value3;
        v94 v94Var3;
        C2009m c2009m = this.f25008b;
        C3244l c3244l = c2009m.f25281U;
        yw0 yw0Var = (yw0) this.f25007a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (yw0Var instanceof vw0) {
            do {
                value3 = c3244l.getValue();
                v94Var3 = (v94) value3;
            } while (!c3244l.m15570h(value3, v94.m23191a(v94Var3, null, null, false, false, iv0.m14155a(v94Var3.f65057e, null, null, true, null, 4095), null, 0, null, null, false, true, true, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -3089, 1023)));
        } else if (yw0Var instanceof xw0) {
            do {
                value2 = c3244l.getValue();
                v94Var2 = (v94) value2;
            } while (!c3244l.m15570h(value2, v94.m23191a(v94Var2, null, null, false, false, iv0.m14155a(v94Var2.f65057e, null, null, false, ((xw0) yw0Var).f68880a, 4095), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -17, 1023)));
        } else if (yw0Var instanceof tw0) {
            do {
                value = c3244l.getValue();
                v94Var = (v94) value;
            } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0.m14155a(v94Var.f65057e, null, null, false, null, 4095), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1041, 1023)));
        } else if (yw0Var instanceof ww0) {
            C2009m.m8917W2(c2009m, UpgradeReason.LYNX_OUT_OF_CREDITS);
        } else {
            if (!(yw0Var instanceof uw0)) {
                gm5.m12750e();
                return null;
            }
            C2009m.m8917W2(c2009m, ((uw0) yw0Var).f64456a == ChatToolTier.Plus ? UpgradeReason.GATED_TOOL_PLUS : UpgradeReason.GATED_TOOL);
        }
        return xfa.f68157a;
    }
}
