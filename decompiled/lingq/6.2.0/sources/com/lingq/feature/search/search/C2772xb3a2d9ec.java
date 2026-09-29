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

/* JADX INFO: renamed from: com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1$invokeSuspend$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1$invokeSuspend$$inlined$combine$1$3", m4291f = "SearchViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2772xb3a2d9ec extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33024a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33025b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f33026c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2772xb3a2d9ec c2772xb3a2d9ec = new C2772xb3a2d9ec(3, (Continuation) obj3);
        c2772xb3a2d9ec.f33025b = (e83) obj;
        c2772xb3a2d9ec.f33026c = (Object[]) obj2;
        return c2772xb3a2d9ec.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33025b;
        Object[] objArr = this.f33026c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33024a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22587E0 = u91.m22587E0(v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr)));
            this.f33025b = null;
            this.f33026c = null;
            this.f33024a = 1;
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
