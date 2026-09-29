package com.lingq.core.achievements.delegate;

import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.GoalMetType;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.cz5;
import p000.eh9;
import p000.go3;
import p000.h24;
import p000.qn6;
import p000.u66;
import p000.u91;
import p000.un1;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.core.achievements.delegate.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1238a implements cz5, cma, qn6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f14264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qn6 f14265b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f14266c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f14267d;

    /* JADX INFO: renamed from: e */
    public final C3244l f14268e;

    /* JADX INFO: renamed from: f */
    public final c18 f14269f;

    /* JADX INFO: renamed from: g */
    public final C3244l f14270g;

    /* JADX INFO: renamed from: h */
    public final C3244l f14271h;

    public C1238a(cma cmaVar, qn6 qn6Var, un1 un1Var) {
        cmaVar.getClass();
        qn6Var.getClass();
        un1Var.getClass();
        this.f14264a = cmaVar;
        this.f14265b = qn6Var;
        this.f14266c = new LinkedHashSet();
        this.f14267d = new LinkedHashSet();
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f14268e = c3244lM17114d;
        this.f14269f = AbstractC3224d.m15524c(c3244lM17114d);
        this.f14270g = AbstractC3352my.m17114d(Boolean.FALSE);
        this.f14271h = AbstractC3352my.m17114d(EmptyList.f47638a);
        wfb.m23926u(un1Var, null, null, new MilestonesControllerDelegateImpl$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f14264a.mo4571A();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f14265b.mo7001A1(inAppNotificationAction);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f14264a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f14264a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f14264a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f14264a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f14264a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f14264a.mo4577H();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    public final Object mo7002H0(int i, Continuation continuation) {
        return this.f14265b.mo7002H0(i, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f14264a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f14264a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f14264a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f14264a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f14264a.mo4582N();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    public final Object mo7003O(Continuation continuation) {
        return this.f14265b.mo7003O(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f14265b.mo7004O0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f14264a.mo4583O1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f14265b.mo7005P1(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f14264a.mo4584Q0();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Q1 */
    public final eh9 mo7006Q1() {
        return this.f14269f;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f14264a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f14264a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f14264a.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        return this.f14265b.mo7007X0(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f14265b.mo7008X1();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: Y1 */
    public final void mo7009Y1(List list) {
        LinkedHashSet linkedHashSet = this.f14266c;
        linkedHashSet.addAll(list);
        List listM22622n1 = u91.m22622n1(linkedHashSet);
        C3244l c3244l = this.f14271h;
        c3244l.getClass();
        c3244l.m15572j(null, listM22622n1);
        m7011b();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: a */
    public final u66 mo7010a() {
        return this.f14270g;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f14264a.mo4588a0();
    }

    /* JADX INFO: renamed from: b */
    public final void m7011b() {
        String strM17735j;
        if (((Boolean) this.f14270g.getValue()).booleanValue()) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f14266c;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        go3 go3Var = (go3) u91.m22588F0(linkedHashSet);
        Object objM12781a = go3Var.m12781a();
        boolean z = objM12781a instanceof Milestone;
        cma cmaVar = this.f14264a;
        if (z) {
            strM17735j = AbstractC3393o1.m17735j(((Milestone) objM12781a).m8102c(), "_", cmaVar.mo4589b2());
        } else {
            strM17735j = objM12781a instanceof DailyGoalMet ? AbstractC3393o1.m17735j(((DailyGoalMet) objM12781a).m8097a(), "_", cmaVar.mo4589b2()) : "";
        }
        if (this.f14267d.contains(strM17735j)) {
            linkedHashSet.remove(go3Var);
            m7011b();
            return;
        }
        C3244l c3244l = this.f14268e;
        c3244l.getClass();
        c3244l.m15572j(null, go3Var);
        if (go3Var.m12782b() == GoalMetType.StreakChallenge) {
            linkedHashSet.remove(go3Var);
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f14264a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f14264a.mo4590d0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f14265b.mo7012d2();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        this.f14265b.mo7013g1(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f14264a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        this.f14265b.mo7014i0(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f14264a.mo4592m0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f14265b.mo7015o2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f14264a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f14264a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f14264a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f14264a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f14264a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f14264a.mo4598w2();
    }

    @Override // p000.cz5
    /* JADX INFO: renamed from: z1 */
    public final void mo7016z1(go3 go3Var) {
        go3Var.getClass();
        LinkedHashSet linkedHashSet = this.f14266c;
        if (linkedHashSet.contains(go3Var) || go3Var.m12782b() == GoalMetType.StreakChallenge) {
            Boolean bool = Boolean.FALSE;
            C3244l c3244l = this.f14270g;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            this.f14268e.m15571i(null);
            linkedHashSet.remove(go3Var);
            Object objM12781a = go3Var.m12781a();
            boolean z = objM12781a instanceof Milestone;
            cma cmaVar = this.f14264a;
            LinkedHashSet linkedHashSet2 = this.f14267d;
            if (z) {
                linkedHashSet2.add(((Milestone) objM12781a).m8102c() + "_" + cmaVar.mo4589b2());
            } else if (objM12781a instanceof DailyGoalMet) {
                linkedHashSet2.add(((DailyGoalMet) objM12781a).m8097a() + "_" + cmaVar.mo4589b2());
            }
            if (linkedHashSet.isEmpty()) {
                return;
            }
            m7011b();
        }
    }
}
