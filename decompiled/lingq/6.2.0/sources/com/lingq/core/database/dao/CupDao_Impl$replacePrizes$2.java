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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.CupDao_Impl$replacePrizes$2", m4291f = "CupDao_Impl.kt", m4292l = {342}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDao_Impl$replacePrizes$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1317e f16904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f16905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDao_Impl$replacePrizes$2(C1317e c1317e, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f16904b = c1317e;
        this.f16905c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CupDao_Impl$replacePrizes$2(this.f16904b, this.f16905c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CupDao_Impl$replacePrizes$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16903a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16903a = 1;
            if (C1317e.m7468d(this.f16904b, this.f16905c, this) == coroutineSingletons) {
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
