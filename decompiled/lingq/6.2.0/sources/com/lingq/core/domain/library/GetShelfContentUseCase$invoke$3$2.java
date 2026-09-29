package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1296l;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.y95;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetShelfContentUseCase$invoke$3$2", m4291f = "GetShelfContentUseCase.kt", m4292l = {57}, m4293m = "invokeSuspend", m4294v = 2)
final class GetShelfContentUseCase$invoke$3$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f18796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1389d f18797c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShelfContentUseCase$invoke$3$2(ArrayList arrayList, C1389d c1389d, String str, Continuation continuation) {
        super(1, continuation);
        this.f18796b = arrayList;
        this.f18797c = c1389d;
        this.f18798d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetShelfContentUseCase$invoke$3$2(this.f18796b, this.f18797c, this.f18798d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetShelfContentUseCase$invoke$3$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18795a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = this.f18796b;
            if (!arrayList.isEmpty()) {
                y95 y95Var = this.f18797c.f18834a;
                this.f18795a = 1;
                if (((C1296l) y95Var).m7311f(this.f18798d, arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
