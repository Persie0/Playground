package com.lingq.core.database.dao;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.CollectionSubscriptionDao_Impl$replaceForLanguage$2", m4291f = "CollectionSubscriptionDao_Impl.kt", m4292l = {75}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionSubscriptionDao_Impl$replaceForLanguage$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1316d f16878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16879c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f16880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSubscriptionDao_Impl$replaceForLanguage$2(C1316d c1316d, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.f16878b = c1316d;
        this.f16879c = str;
        this.f16880d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionSubscriptionDao_Impl$replaceForLanguage$2(this.f16878b, this.f16879c, this.f16880d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionSubscriptionDao_Impl$replaceForLanguage$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16877a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16877a = 1;
            if (C1316d.m7465z0(this.f16878b, this.f16879c, this.f16880d, this) == coroutineSingletons) {
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
