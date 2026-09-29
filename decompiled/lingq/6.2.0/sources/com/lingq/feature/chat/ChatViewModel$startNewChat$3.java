package com.lingq.feature.chat;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.chat.ChatToolTier;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.c32;
import p000.er1;
import p000.fr1;
import p000.gm5;
import p000.gr1;
import p000.hr1;
import p000.ir1;
import p000.iv0;
import p000.jr1;
import p000.v94;
import p000.wv0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$startNewChat$3", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$startNewChat$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LynxChatModel f25052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f25053c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v94 f25054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$startNewChat$3(LynxChatModel lynxChatModel, C2009m c2009m, v94 v94Var, Continuation continuation) {
        super(2, continuation);
        this.f25052b = lynxChatModel;
        this.f25053c = c2009m;
        this.f25054d = v94Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$startNewChat$3 chatViewModel$startNewChat$3 = new ChatViewModel$startNewChat$3(this.f25052b, this.f25053c, this.f25054d, continuation);
        chatViewModel$startNewChat$3.f25051a = obj;
        return chatViewModel$startNewChat$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$startNewChat$3 chatViewModel$startNewChat$3 = (ChatViewModel$startNewChat$3) create((jr1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$startNewChat$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        v94 v94Var;
        Object value2;
        v94 v94Var2;
        ir1 ir1Var;
        Object value3;
        v94 v94Var3;
        v94 v94Var4 = this.f25054d;
        String str = v94Var4.f65074v;
        String str2 = v94Var4.f65073u;
        C2009m c2009m = this.f25053c;
        wv0 wv0Var = c2009m.f25279S;
        C3244l c3244l = c2009m.f25281U;
        jr1 jr1Var = (jr1) this.f25051a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (jr1Var instanceof hr1) {
            int i = ((hr1) jr1Var).f42820a;
            if (i != -1) {
                if (this.f25052b != null) {
                    c2009m.f25289b0 = new Integer(i);
                }
                Bundle bundle = new Bundle();
                bundle.putString("chat language", str2);
                bundle.putString("dictionary language", str);
                bundle.putInt("chat id", i);
                ((C1240a) c2009m.f25278R).m7025f("new chat started", bundle);
                wv0Var.mo8928e(str2, i, str);
                wv0Var.mo8924b(new DateTime());
            }
            do {
                value3 = c3244l.getValue();
                v94Var3 = (v94) value3;
            } while (!c3244l.m15570h(value3, v94.m23191a(v94Var3, null, null, false, false, iv0.m14155a(v94Var3.f65057e, null, null, true, null, 4095), null, i, null, null, false, true, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1105, 1023)));
        } else if (jr1Var instanceof ir1) {
            do {
                value2 = c3244l.getValue();
                v94Var2 = (v94) value2;
                ir1Var = (ir1) jr1Var;
            } while (!c3244l.m15570h(value2, v94.m23191a(v94Var2, null, null, false, false, iv0.m14155a(v94Var2.f65057e, null, null, false, ir1Var.f44452b, 4095), null, ir1Var.f44451a, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -81, 1023)));
        } else if (jr1Var instanceof er1) {
            do {
                value = c3244l.getValue();
                v94Var = (v94) value;
            } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0.m14155a(v94Var.f65057e, null, null, false, null, 4095), null, ((er1) jr1Var).f37740a, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1105, 1023)));
        } else if (jr1Var instanceof gr1) {
            C2009m.m8917W2(c2009m, UpgradeReason.LYNX_OUT_OF_CREDITS);
        } else {
            if (!(jr1Var instanceof fr1)) {
                gm5.m12750e();
                return null;
            }
            C2009m.m8917W2(c2009m, ((fr1) jr1Var).f39515a == ChatToolTier.Plus ? UpgradeReason.GATED_TOOL_PLUS : UpgradeReason.GATED_TOOL);
        }
        return xfa.f68157a;
    }
}
