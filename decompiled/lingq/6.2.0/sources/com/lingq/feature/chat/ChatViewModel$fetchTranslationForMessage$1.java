package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.wa2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$fetchTranslationForMessage$1", m4291f = "ChatViewModel.kt", m4292l = {1201}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$fetchTranslationForMessage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24943a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24944b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24945c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24946d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f24947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$fetchTranslationForMessage$1(C2009m c2009m, String str, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f24944b = c2009m;
        this.f24945c = str;
        this.f24946d = i;
        this.f24947e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$fetchTranslationForMessage$1(this.f24944b, this.f24945c, this.f24946d, this.f24947e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$fetchTranslationForMessage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24943a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        wa2 wa2Var = this.f24944b.f25312y;
        this.f24943a = 1;
        Object objM7163m = ((C1289e) wa2Var.f66560a).m7163m(this.f24946d, this.f24947e, this.f24945c, this);
        if (objM7163m != coroutineSingletons) {
            objM7163m = xfaVar;
        }
        return objM7163m == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
