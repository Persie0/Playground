package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.ChatDao_Impl$replaceChatSuggestions$2", m4291f = "ChatDao_Impl.kt", m4292l = {383}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatDao_Impl$replaceChatSuggestions$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1315c f16868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16869c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f16870d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f16871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDao_Impl$replaceChatSuggestions$2(C1315c c1315c, String str, int i, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f16868b = c1315c;
        this.f16869c = str;
        this.f16870d = i;
        this.f16871e = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChatDao_Impl$replaceChatSuggestions$2(this.f16868b, this.f16869c, this.f16870d, this.f16871e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ChatDao_Impl$replaceChatSuggestions$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16867a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16867a = 1;
            if (C1315c.m7463z0(this.f16868b, this.f16869c, this.f16870d, this.f16871e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
