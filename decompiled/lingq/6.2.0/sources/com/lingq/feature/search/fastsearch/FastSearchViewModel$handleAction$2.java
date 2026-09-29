package com.lingq.feature.search.fastsearch;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h03;
import p000.n03;
import p000.n23;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$handleAction$2", m4291f = "FastSearchViewModel.kt", m4292l = {126}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$handleAction$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f32854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$handleAction$2(C2768b c2768b, n03 n03Var, Continuation continuation) {
        super(2, continuation);
        this.f32853b = c2768b;
        this.f32854c = n03Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FastSearchViewModel$handleAction$2(this.f32853b, this.f32854c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FastSearchViewModel$handleAction$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32852a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2768b c2768b = this.f32853b;
            n23 n23Var = c2768b.f32888l;
            String strMo4589b2 = c2768b.f32878b.mo4589b2();
            h03 h03Var = (h03) this.f32854c;
            int i2 = h03Var.f41603a.f19426a;
            String value = h03Var.f41604b.getValue();
            this.f32852a = 1;
            if (n23Var.m17184a(strMo4589b2, i2, value, this) == coroutineSingletons) {
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
