package com.lingq.feature.collections;

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
import p000.v91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$invokeSuspend$$inlined$combine$1$3 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$invokeSuspend$$inlined$combine$1$3", m4291f = "CollectionViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2026x8afd58ca extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f25494a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f25495b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f25496c;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2026x8afd58ca c2026x8afd58ca = new C2026x8afd58ca(3, (Continuation) obj3);
        c2026x8afd58ca.f25495b = (e83) obj;
        c2026x8afd58ca.f25496c = (Object[]) obj2;
        return c2026x8afd58ca.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f25495b;
        Object[] objArr = this.f25496c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25494a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM23190r0 = v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr));
            this.f25495b = null;
            this.f25496c = null;
            this.f25494a = 1;
            if (e83Var.emit(arrayListM23190r0, this) == coroutineSingletons) {
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
