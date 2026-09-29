package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dt1;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.CupDao_Impl$replaceContributors$2", m4291f = "CupDao_Impl.kt", m4292l = {354}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDao_Impl$replaceContributors$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1317e f16899b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16900c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f16901d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dt1 f16902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDao_Impl$replaceContributors$2(C1317e c1317e, String str, ArrayList arrayList, dt1 dt1Var, Continuation continuation) {
        super(1, continuation);
        this.f16899b = c1317e;
        this.f16900c = str;
        this.f16901d = arrayList;
        this.f16902e = dt1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CupDao_Impl$replaceContributors$2(this.f16899b, this.f16900c, this.f16901d, this.f16902e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CupDao_Impl$replaceContributors$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16898a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16898a = 1;
            if (C1317e.m7467b(this.f16899b, this.f16900c, this.f16901d, this.f16902e, this) == coroutineSingletons) {
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
