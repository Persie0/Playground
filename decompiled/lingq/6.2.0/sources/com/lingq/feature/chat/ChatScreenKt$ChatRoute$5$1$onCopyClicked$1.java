package com.lingq.feature.chat;

import android.content.ClipData;
import android.content.Context;
import android.widget.Toast;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3610tg;
import p000.c32;
import p000.t31;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatScreenKt$ChatRoute$5$1$onCopyClicked$1", m4291f = "ChatScreen.kt", m4292l = {486}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatScreenKt$ChatRoute$5$1$onCopyClicked$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t31 f24781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24782c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f24783d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f24784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenKt$ChatRoute$5$1$onCopyClicked$1(t31 t31Var, String str, Context context, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f24781b = t31Var;
        this.f24782c = str;
        this.f24783d = context;
        this.f24784e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatScreenKt$ChatRoute$5$1$onCopyClicked$1(this.f24781b, this.f24782c, this.f24783d, this.f24784e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatScreenKt$ChatRoute$5$1$onCopyClicked$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24780a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ClipData clipDataNewPlainText = ClipData.newPlainText("Chat message", this.f24782c);
            clipDataNewPlainText.getClass();
            this.f24780a = 1;
            ((C3610tg) this.f24781b).f62240a.m3360m().setPrimaryClip(clipDataNewPlainText);
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Toast.makeText(this.f24783d, (CharSequence) this.f24784e.invoke(new Integer(com.lingq.core.p012ui.R$string.share_copied_clipboard)), 0).show();
        return xfaVar;
    }
}
