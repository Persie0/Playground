package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1296l;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b23;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeCounters$3", m4291f = "SearchViewModel.kt", m4292l = {589}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeCounters$3 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f33036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeCounters$3(C2779e c2779e, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f33035b = c2779e;
        this.f33036c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchViewModel$observeCounters$3(this.f33035b, this.f33036c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchViewModel$observeCounters$3) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33034a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C2779e c2779e = this.f33035b;
            ArrayList arrayList = this.f33036c;
            b23 b23Var = c2779e.f33102j;
            String strMo4589b2 = c2779e.f33094b.mo4589b2();
            this.f33034a = 1;
            Object objM7308c = ((C1296l) b23Var.f7790a).m7308c(strMo4589b2, arrayList, this);
            if (objM7308c != coroutineSingletons) {
                objM7308c = xfaVar;
            }
            return objM7308c == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Throwable th) {
            new Result.Failure(th);
            return xfaVar;
        }
    }
}
