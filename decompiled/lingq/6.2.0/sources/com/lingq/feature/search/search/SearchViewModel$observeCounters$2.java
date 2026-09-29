package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1296l;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.r23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeCounters$2", m4291f = "SearchViewModel.kt", m4292l = {586}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeCounters$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f33031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33032b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f33033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeCounters$2(C2779e c2779e, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f33032b = c2779e;
        this.f33033c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchViewModel$observeCounters$2(this.f33032b, this.f33033c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchViewModel$observeCounters$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33031a;
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
            C2779e c2779e = this.f33032b;
            ArrayList arrayList = this.f33033c;
            r23 r23Var = c2779e.f33101i;
            String strMo4589b2 = c2779e.f33094b.mo4589b2();
            this.f33031a = 1;
            Object objM7311f = ((C1296l) r23Var.f58517a).m7311f(strMo4589b2, arrayList, this);
            if (objM7311f != coroutineSingletons) {
                objM7311f = xfaVar;
            }
            return objM7311f == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Throwable th) {
            new Result.Failure(th);
            return xfaVar;
        }
    }
}
