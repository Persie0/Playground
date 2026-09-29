package com.lingq.feature.search.search;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.search.search.SearchViewModel$observeDownloads$1$invokeSuspend$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeDownloads$1$invokeSuspend$$inlined$combine$1$3", m4291f = "SearchViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2773xae3c505e extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33046a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33047b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f33048c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2773xae3c505e c2773xae3c505e = new C2773xae3c505e(3, (Continuation) obj3);
        c2773xae3c505e.f33047b = (e83) obj;
        c2773xae3c505e.f33048c = (Object[]) obj2;
        return c2773xae3c505e.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33047b;
        Object[] objArr = this.f33048c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33046a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22587E0 = u91.m22587E0(v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr)));
            this.f33047b = null;
            this.f33048c = null;
            this.f33046a = 1;
            if (e83Var.emit(arrayListM22587E0, this) == coroutineSingletons) {
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
