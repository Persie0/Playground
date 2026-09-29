package com.lingq.feature.notifications;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.en6;
import p000.g41;
import p000.h24;
import p000.lda;
import p000.nn1;
import p000.oo6;
import p000.qn6;
import p000.vma;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.notifications.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2168b extends wta implements cma, qn6 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f26882b;

    /* JADX INFO: renamed from: c */
    public final en6 f26883c;

    /* JADX INFO: renamed from: d */
    public final vma f26884d;

    /* JADX INFO: renamed from: e */
    public final nn1 f26885e;

    /* JADX INFO: renamed from: f */
    public final qn6 f26886f;

    /* JADX INFO: renamed from: g */
    public final C3244l f26887g;

    /* JADX INFO: renamed from: h */
    public final C3244l f26888h;

    /* JADX INFO: renamed from: i */
    public final C3244l f26889i;

    /* JADX INFO: renamed from: j */
    public final C3211a f26890j;

    /* JADX INFO: renamed from: k */
    public final C3244l f26891k;

    /* JADX INFO: renamed from: l */
    public final c18 f26892l;

    public C2168b(en6 en6Var, vma vmaVar, nn1 nn1Var, cma cmaVar, qn6 qn6Var) {
        en6Var.getClass();
        vmaVar.getClass();
        cmaVar.getClass();
        qn6Var.getClass();
        this.f26882b = cmaVar;
        this.f26883c = en6Var;
        this.f26884d = vmaVar;
        this.f26885e = nn1Var;
        this.f26886f = qn6Var;
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f26887g = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(bool);
        this.f26888h = c3244lM17114d2;
        this.f26889i = AbstractC3352my.m17114d(1);
        this.f26890j = AbstractC1261a.m7042a();
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(emptyList);
        this.f26891k = c3244lM17114d3;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        AbstractC3224d.m15520B(c3244lM17114d3, g41VarM16103C, c3243k, emptyList);
        this.f26892l = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c3244lM17114d3, c3244lM17114d, c3244lM17114d2, new NotificationsViewModel$uiState$1(4, null)), lda.m16103C(this), c3243k, oo6.f54654a);
        wfb.m23926u(lda.m16103C(this), null, null, new NotificationsViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new NotificationsViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new NotificationsViewModel$3(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26882b.mo4571A();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f26886f.mo7001A1(inAppNotificationAction);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26882b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26882b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26882b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26882b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26882b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26882b.mo4577H();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    public final Object mo7002H0(int i, Continuation continuation) {
        return this.f26886f.mo7002H0(i, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26882b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26882b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26882b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26882b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26882b.mo4582N();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    public final Object mo7003O(Continuation continuation) {
        return this.f26886f.mo7003O(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f26886f.mo7004O0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26882b.mo4583O1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f26886f.mo7005P1(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26882b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26882b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26882b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9101V2() {
        g41 g41VarM16103C = lda.m16103C(this);
        C3244l c3244l = this.f26889i;
        String strM17733h = AbstractC3393o1.m17733h(c3244l.getValue(), "notifications ");
        NotificationsViewModel$observableNotifications$1 notificationsViewModel$observableNotifications$1 = new NotificationsViewModel$observableNotifications$1(this, null);
        nn1 nn1Var = this.f26885e;
        AbstractC1263a.m7047b(g41VarM16103C, nn1Var, strM17733h, notificationsViewModel$observableNotifications$1);
        AbstractC1263a.m7047b(lda.m16103C(this), nn1Var, AbstractC3393o1.m17733h(c3244l.getValue(), "networkGetNotifications "), new NotificationsViewModel$networkGetNotifications$1(this, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26882b.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        return this.f26886f.mo7007X0(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f26886f.mo7008X1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26882b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26882b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26882b.mo4590d0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f26886f.mo7012d2();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        this.f26886f.mo7013g1(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26882b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        this.f26886f.mo7014i0(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26882b.mo4592m0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f26886f.mo7015o2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26882b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26882b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26882b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26882b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26882b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26882b.mo4598w2();
    }
}
