package com.lingq.core.data.repository;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.bt1;
import p000.bu1;
import p000.c32;
import p000.ct1;
import p000.dt1;
import p000.ft1;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CupRepositoryImpl$observeTopContributors$1", m4291f = "CupRepositoryImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupRepositoryImpl$observeTopContributors$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f15103a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ dt1 f15104b;

    public CupRepositoryImpl$observeTopContributors$1() {
        super(3, null);
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CupRepositoryImpl$observeTopContributors$1 cupRepositoryImpl$observeTopContributors$1 = new CupRepositoryImpl$observeTopContributors$1(3, (Continuation) obj3);
        cupRepositoryImpl$observeTopContributors$1.f15103a = (List) obj;
        cupRepositoryImpl$observeTopContributors$1.f15104b = (dt1) obj2;
        return cupRepositoryImpl$observeTopContributors$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f15103a;
        dt1 dt1Var = this.f15104b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty() && dt1Var == null) {
            return null;
        }
        List<ct1> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (ct1 ct1Var : list2) {
            ct1Var.getClass();
            arrayList.add(new bt1(ct1Var.f34505c, ct1Var.f34506d, ct1Var.f34507e, ct1Var.f34504b, ct1Var.f34508f, ct1Var.f34509g, ct1Var.f34510h, ct1Var.f34511i));
        }
        return new ft1(arrayList, dt1Var != null ? new bu1(dt1Var.f36192c, dt1Var.f36191b) : null);
    }
}
