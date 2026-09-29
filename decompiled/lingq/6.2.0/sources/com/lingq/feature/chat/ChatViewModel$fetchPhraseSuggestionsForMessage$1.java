package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.p23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$fetchPhraseSuggestionsForMessage$1", m4291f = "ChatViewModel.kt", m4292l = {1185}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$fetchPhraseSuggestionsForMessage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f24940c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24941d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f24942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$fetchPhraseSuggestionsForMessage$1(C2009m c2009m, String str, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f24939b = c2009m;
        this.f24940c = str;
        this.f24941d = i;
        this.f24942e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$fetchPhraseSuggestionsForMessage$1(this.f24939b, this.f24940c, this.f24941d, this.f24942e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$fetchPhraseSuggestionsForMessage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24938a;
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
        p23 p23Var = this.f24939b.f25313z;
        this.f24938a = 1;
        Object objM7162l = ((C1289e) p23Var.f55480a).m7162l(this.f24941d, this.f24942e, this.f24940c, this);
        if (objM7162l != coroutineSingletons) {
            objM7162l = xfaVar;
        }
        return objM7162l == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
