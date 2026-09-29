package com.lingq.core.database.dao;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.BlacklistDao_Impl$clearBlacklist$2", m4291f = "BlacklistDao_Impl.kt", m4292l = {75}, m4293m = "invokeSuspend", m4294v = 2)
final class BlacklistDao_Impl$clearBlacklist$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1314b f16859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlacklistDao_Impl$clearBlacklist$2(C1314b c1314b, String str, Continuation continuation) {
        super(1, continuation);
        this.f16859b = c1314b;
        this.f16860c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BlacklistDao_Impl$clearBlacklist$2(this.f16859b, this.f16860c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((BlacklistDao_Impl$clearBlacklist$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16858a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16858a = 1;
            if (C1314b.m7461b(this.f16859b, this.f16860c, this) == coroutineSingletons) {
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
