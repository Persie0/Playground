package com.lingq.feature.vocabulary.state;

import com.lingq.core.datastore.C1371d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.xza;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$observeSearchQuery$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$observeSearchQuery$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33737a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33738b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$observeSearchQuery$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33738b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$observeSearchQuery$1(this.f33738b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$observeSearchQuery$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33737a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2860b c2860b = this.f33738b;
            c83 c83Var = ((C1371d) c2860b.f33772a).f18580q;
            xza xzaVar = new xza(c2860b, 5);
            this.f33737a = 1;
            if (c83Var.collect(xzaVar, this) == coroutineSingletons) {
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
