package com.lingq.feature.chat;

import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.jv0;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatScreenKt$ChatScreen$toggleDrawer$1$1$1", m4291f = "ChatScreen.kt", m4292l = {872, 872}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatScreenKt$ChatScreen$toggleDrawer$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f24798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0253l f24799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatScreenKt$ChatScreen$toggleDrawer$1$1$1(jv0 jv0Var, C0253l c0253l, Continuation continuation) {
        super(2, continuation);
        this.f24798b = jv0Var;
        this.f24799c = c0253l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatScreenKt$ChatScreen$toggleDrawer$1$1$1(this.f24798b, this.f24799c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatScreenKt$ChatScreen$toggleDrawer$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24797a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f24798b.mo8886m();
        C0253l c0253l = this.f24799c;
        if (((DrawerValue) ((xc9) c0253l.f3552b.f2239h).getValue()) != DrawerValue.Closed) {
            this.f24797a = 2;
            if (c0253l.m1181b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        this.f24797a = 1;
        Object objM1180a = C0253l.m1180a(c0253l, DrawerValue.Open, c0253l.f3554d, this);
        if (objM1180a != coroutineSingletons) {
            objM1180a = xfaVar;
        }
        if (objM1180a == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
