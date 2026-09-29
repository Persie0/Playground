package com.lingq.feature.search.search;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$handleAction$4", m4291f = "SearchViewModel.kt", m4292l = {309}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$handleAction$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$handleAction$4(C2779e c2779e, Continuation continuation) {
        super(2, continuation);
        this.f33014b = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchViewModel$handleAction$4(this.f33014b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$handleAction$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33013a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f33013a = 1;
            if (this.f33014b.f33094b.mo4597w0(this) == coroutineSingletons) {
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
