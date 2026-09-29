package com.lingq.feature.challenges.cup;

import com.lingq.core.domain.model.cup.CupTeamEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.bt1;
import p000.bu1;
import p000.c32;
import p000.et1;
import p000.ew1;
import p000.fa4;
import p000.ft1;
import p000.it1;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupContributorsViewModel$state$1", m4291f = "CupContributorsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupContributorsViewModel$state$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ft1 f24574a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ew1 f24575b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1975b f24576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupContributorsViewModel$state$1(C1975b c1975b, Continuation continuation) {
        super(3, continuation);
        this.f24576c = c1975b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CupContributorsViewModel$state$1 cupContributorsViewModel$state$1 = new CupContributorsViewModel$state$1(this.f24576c, (Continuation) obj3);
        cupContributorsViewModel$state$1.f24574a = (ft1) obj;
        cupContributorsViewModel$state$1.f24575b = (ew1) obj2;
        return cupContributorsViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        List list;
        Object next;
        C1975b c1975b = this.f24576c;
        String str = c1975b.f24682c;
        ft1 ft1Var = this.f24574a;
        ew1 ew1Var = this.f24575b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (ft1Var == null) {
            return new it1(str, 124);
        }
        ArrayList<bt1> arrayList = ft1Var.f39609a;
        bu1 bu1Var = ft1Var.f39610b;
        Integer num2 = bu1Var != null ? bu1Var.f9018a : null;
        if (ew1Var == null || (list = ew1Var.f37984j) == null) {
            num = null;
        } else {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((CupTeamEntry) next).f18996a, str));
            CupTeamEntry cupTeamEntry = (CupTeamEntry) next;
            if (cupTeamEntry != null) {
                num = new Integer(cupTeamEntry.f18997b);
            } else {
                num = null;
            }
        }
        String str2 = c1975b.f24682c;
        Integer num3 = bu1Var != null ? new Integer(bu1Var.f9019b) : null;
        Integer num4 = new Integer(num != null ? num.intValue() : arrayList.size());
        boolean z = bu1Var != null;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (bt1 bt1Var : arrayList) {
            int i = bt1Var.f8962a;
            arrayList2.add(new et1(i, bt1Var.f8966e, bt1Var.f8968g, bt1Var.f8969h, bt1Var.f8964c, num2 != null && i == num2.intValue(), bt1Var.f8967f));
        }
        return new it1(false, str2, num2, num3, num4, z, arrayList2);
    }
}
