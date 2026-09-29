package com.lingq.feature.challenges.cup;

import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bt1;
import p000.bu1;
import p000.c32;
import p000.cj3;
import p000.et1;
import p000.ew1;
import p000.fa4;
import p000.ft1;
import p000.ma3;
import p000.tw1;
import p000.u91;
import p000.v91;
import p000.vw1;
import p000.xfa;
import p000.xw1;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupTeamLeaderboardViewModel$state$1", m4291f = "CupTeamLeaderboardViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupTeamLeaderboardViewModel$state$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ew1 f24636a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f24637b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ft1 f24638c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ CupLeaderboardTab f24639d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1979f f24640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupTeamLeaderboardViewModel$state$1(C1979f c1979f, Continuation continuation) {
        super(5, continuation);
        this.f24640e = c1979f;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CupTeamLeaderboardViewModel$state$1 cupTeamLeaderboardViewModel$state$1 = new CupTeamLeaderboardViewModel$state$1(this.f24640e, (Continuation) obj5);
        cupTeamLeaderboardViewModel$state$1.f24636a = (ew1) obj;
        cupTeamLeaderboardViewModel$state$1.f24637b = (List) obj2;
        cupTeamLeaderboardViewModel$state$1.f24638c = (ft1) obj3;
        cupTeamLeaderboardViewModel$state$1.f24639d = (CupLeaderboardTab) obj4;
        return cupTeamLeaderboardViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        CupMyStats cupMyStats;
        Integer numValueOf;
        bu1 bu1Var;
        CupTeam cupTeam;
        ew1 ew1Var = this.f24636a;
        List list = this.f24637b;
        ft1 ft1Var = this.f24638c;
        CupLeaderboardTab cupLeaderboardTab = this.f24639d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = (ew1Var == null || (cupTeam = ew1Var.f37981g) == null) ? null : cupTeam.f18994b;
        Integer num = (ft1Var == null || (bu1Var = ft1Var.f39610b) == null) ? null : bu1Var.f9018a;
        boolean z = true;
        if (ew1Var != null || !list.isEmpty()) {
            z = false;
        }
        boolean z2 = cupLeaderboardTab == CupLeaderboardTab.Global && ft1Var == null;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((xw1) next).f68881a, str));
        xw1 xw1Var = (xw1) next;
        Integer numValueOf2 = xw1Var != null ? Integer.valueOf(xw1Var.f68886f) : (ew1Var == null || (cupMyStats = ew1Var.f37982h) == null) ? null : cupMyStats.f18978c;
        int size = list.size();
        List<xw1> listM22614f1 = u91.m22614f1(list, new ma3(11));
        ArrayList arrayList = new ArrayList(v91.m23189q0(listM22614f1, 10));
        for (xw1 xw1Var2 : listM22614f1) {
            int i = xw1Var2.f68886f;
            String str2 = xw1Var2.f68881a;
            arrayList.add(new vw1(i, str2, xw1Var2.f68882b, (int) xw1Var2.f68884d, xw1Var2.f68883c, xw1Var2.f68888h, fa4.m11650l(str2, str)));
            numValueOf2 = numValueOf2;
        }
        Integer num2 = numValueOf2;
        if (num == null) {
            numValueOf = null;
        } else {
            Integer num3 = num.intValue() > 50 ? num : null;
            if (num3 != null) {
                numValueOf = Integer.valueOf(num3.intValue() - 50);
            } else {
                numValueOf = null;
            }
        }
        boolean z3 = (ft1Var != null ? ft1Var.f39610b : null) != null;
        Iterable iterable = ft1Var != null ? ft1Var.f39609a : null;
        if (iterable == null) {
            iterable = EmptyList.f47638a;
        }
        Iterable<bt1> iterable2 = iterable;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(iterable2, 10));
        for (bt1 bt1Var : iterable2) {
            int i2 = bt1Var.f8962a;
            Integer num4 = numValueOf;
            arrayList2.add(new et1(i2, bt1Var.f8966e, bt1Var.f8968g, bt1Var.f8969h, bt1Var.f8964c, num != null && i2 == num.intValue(), bt1Var.f8967f));
            numValueOf = num4;
        }
        return new tw1(z, cupLeaderboardTab, str, num2, size, arrayList, z2, num, numValueOf, z3, arrayList2);
    }
}
